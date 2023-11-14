package mediatheque;

import java.time.LocalDate;

public class Lecteur extends Acteur {
    // attribut spécifique a la classe Lecteur
    private int numAdhe;
    private Abonnement abo;

    // création du constructeur
    public Lecteur(String prenom, String nom, int numAdhe, Abonnement abo) {
	super(prenom, nom);
	this.numAdhe = numAdhe;
	this.abo = abo;
    }

    // création des getters et des setters.
    public int getNumAdhe() {
	return numAdhe;
    }

    public void setNumAdhe(int numAdhe) {
	this.numAdhe = numAdhe;
    }

    public Abonnement getAbo() {
	return abo;
    }

    public void setAbo(Abonnement abo) {
	this.abo = abo;
    }

    public Emprunts emprunter(Livres nom) {
	Emprunts emprunt = new Emprunts(LocalDate.now(), null, nom, this);
	return emprunt;
    }

    public Emprunts emprunter(Jeux nom) {
	Emprunts emprunt2 = new Emprunts(LocalDate.now(), null, nom, this);
	return emprunt2;
    }

    public Emprunts retourJeu(LocalDate dateRetour, Emprunts emprunt) {
	if (this.equals(emprunt.getLecteur())) {
	    emprunt.setDateRetour(dateRetour);
	}
	return emprunt;
    }
}
