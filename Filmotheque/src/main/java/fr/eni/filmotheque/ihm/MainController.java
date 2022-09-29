package fr.eni.filmotheque.ihm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.sercives.FilmService;

@Controller
@RequestMapping("/accueil")
public class MainController {
		
	private FilmService filmService;

	@RequestMapping
	public String main() {
		System.out.println("blabla");
		return "accueil";
	}
	
	public MainController(FilmService filmService) {
		this.filmService = filmService;
	}
}
