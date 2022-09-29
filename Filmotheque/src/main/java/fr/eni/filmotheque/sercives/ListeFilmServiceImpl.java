package fr.eni.filmotheque.sercives;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Film;


@Service
public class ListeFilmServiceImpl implements FilmService {

	private List<Film> listeFilms;

	public ListeFilmServiceImpl() {
		listeFilms = new ArrayList();
		listeFilms.add(new Film(1, "Batman", 2004, 180, "Blablabla"));
	}

	public void setListeFilms(List<Film> listeFilms) {
		this.listeFilms = listeFilms;
	}

	@Override
	public String listeFilm() {
		return null;
	}

}
