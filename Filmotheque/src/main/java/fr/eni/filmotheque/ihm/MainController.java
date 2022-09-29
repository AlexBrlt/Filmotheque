package fr.eni.filmotheque.ihm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.sercives.FilmService;

@Controller
@RequestMapping("/accueil")
public class MainController {
		
	private FilmService filmService;
	
	@ModelAttribute("Films")
	public List<Film> getFilms() {
		return new ArrayList<Film>();
	}
	
	@RequestMapping({"", "/accueil"})
	public String main(Model modele) {
		modele.addAttribute("film", new Film(1, "Batman", 2004, 180, "Blablabla"));
		return "accueil";
	}
	
	public MainController(FilmService filmService) {
		this.filmService = filmService;
	}
}
