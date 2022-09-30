package fr.eni.filmotheque.bo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Film {
	
	private int id;
	@NotBlank(message="Le champ est obligatoire !")
	private String titre;
	@Min(0)
	private int annee;
	private int duree;
	private String synopsis;
	
	public Film() {}
	
	public Film(int id, String titre, int annee, int duree, String synopsis ) {
		super();
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
}
