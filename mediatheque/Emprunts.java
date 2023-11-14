package mediatheque;

import java.time.LocalDate;

public class Emprunts {
    private LocalDate dateEmprunt;
    private LocalDate dateRetour;
    private Jeux jeu;
    private Livres livre;
    private Lecteur lecteur;

    public Emprunts(LocalDate dateEmprunt, LocalDate dateRetour, Jeux jeu, Lecteur lecteur) {
	super();
	this.dateEmprunt = dateEmprunt;
	this.dateRetour = dateRetour;
	this.jeu = jeu;
	this.lecteur = lecteur;
	this.livre = null;
    }

    public Emprunts(LocalDate dateEmprunt, LocalDate dateRetour, Livres livre, Lecteur lecteur) {
	super();
	this.dateEmprunt = dateEmprunt;
	this.dateRetour = dateRetour;
	this.jeu = null;
	this.lecteur = lecteur;
	this.livre = livre;
    }

    public LocalDate getDateEmprunt() {
	return dateEmprunt;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
	this.dateEmprunt = dateEmprunt;
    }

    public LocalDate getDateRetour() {
	return dateRetour;
    }

    public void setDateRetour(LocalDate dateRetour) {
	this.dateRetour = dateRetour;
    }

    public Jeux getJeu() {
	return jeu;
    }

    public void setJeu(Jeux jeu) {
	this.jeu = jeu;
    }

    public Livres getLivre() {
	return livre;
    }

    public void setLivre(Livres livre) {
	this.livre = livre;
    }

    public Lecteur getLecteur() {
	return lecteur;
    }

    public void setLecteur(Lecteur lecteur) {
	this.lecteur = lecteur;
    }

}
