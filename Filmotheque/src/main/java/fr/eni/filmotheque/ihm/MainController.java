package fr.eni.filmotheque.ihm;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.sercives.FilmService;

@Controller
public class MainController {
		
	private FilmService filmService;
	
	@ModelAttribute("films")
	public List<Film> getFilms() {
		return filmService.getListeFilms();
	}
	
	@GetMapping({"", "/accueil"})
	public String main(Model modele) {
		modele.addAttribute("film", new Film());
		return "accueil";
	}
	
	@PostMapping("/ajout")
	public String ajoutFilm(
			@Valid @ModelAttribute("film")Film film,
		BindingResult validationResult,
			@ModelAttribute("films") List<Film> listeFilms) {
			if(validationResult.hasErrors()) {
				return "accueil";
		}
			listeFilms.add(film);
			return "accueil";
	}
	
	public MainController(FilmService filmService) {
		this.filmService = filmService;
	}
}
