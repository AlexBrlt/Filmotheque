package fr.eni.filmotheque.sercives;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Film;

@Service("FilmService")
public class ListeFilmController implements FilmService {

	private List<Film> listeFilms;

	public ListeFilmController() {
		listeFilms = new ArrayList();
	}

	public void setListeFilms(List<Film> listeFilms) {
		this.listeFilms = listeFilms;
	}

	@Override
	public String listeFilm() {
		// TODO Auto-generated method stub
		return null;
	}

}
