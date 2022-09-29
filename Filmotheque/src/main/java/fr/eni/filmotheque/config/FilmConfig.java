package fr.eni.filmotheque.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.sercives.FilmService;

@Configuration
public class FilmConfig {
	
	@Bean 
	@ApplicationScope
	public List<Film> listeFilms(FilmService service){ 
		return service.getListeFilms();
	}
}
