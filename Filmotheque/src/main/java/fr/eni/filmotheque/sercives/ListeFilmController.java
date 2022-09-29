package fr.eni.filmotheque.sercives;

import org.springframework.stereotype.Service;

@Service("FilmService")
public class ListeFilmController implements FilmService {
	public String listeFilm() {
		return "listeFilms";
	}

}
