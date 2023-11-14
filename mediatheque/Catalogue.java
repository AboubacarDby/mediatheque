package mediatheque;

import java.util.ArrayList;

public class Catalogue {
    // création d'un tableau de liste dans lequel on intégrera les informations de
    // nos livres.

    private ArrayList<Jeux> jeux = new ArrayList<>();
    private ArrayList<Livres> livres = new ArrayList<>();

    public void afficher() {
	for (Jeux jeu : jeux) {
	    jeu.afficher();
	}
	for (Livres livre : livres) {
	    livre.afficher();
	}
    }

    public ArrayList<Jeux> getJeux() {
	return jeux;
    }

    public void setJeux(ArrayList<Jeux> jeux) {
	this.jeux = jeux;
    }

    public ArrayList<Livres> getLivres() {
	return livres;
    }

    public void setLivres(ArrayList<Livres> livres) {
	this.livres = livres;
    }

    // Création de la méthode qui va afficher le contenue du catalogue.

}
