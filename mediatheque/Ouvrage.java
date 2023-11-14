package mediatheque;

public class Ouvrage {
    // création des attributs de la classe
    private String titre;
    private int numSerie;
    private String nomAuteur;
    private Emplct emplct;

    // création du constructeur de la classe avec les paramètres.
    public Ouvrage(String titre, String nomAuteur, int numSerie, Emplct emplct) {
	super();
	this.titre = titre;
	this.nomAuteur = nomAuteur;
	this.emplct = emplct;
	this.numSerie = numSerie;

    }

    // création d'un constructeur vide, sans paramètres.
    public Ouvrage() {

    }

    // création des getters et des setters pour chacun des attributs que l'on a
    // créer plus tôt.
    public String getNomAuteur() {
	return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
	this.nomAuteur = nomAuteur;
    }

    public String getTitre() {
	return titre;
    }

    public void setTitre(String titre) {
	this.titre = titre;
    }

    public int getNumSerie() {
	return numSerie;
    }

    public void setNumSerie(int numSerie) {
	this.numSerie = numSerie;
    }

    public Emplct getEmplct() {
	return emplct;
    }

    public void setEmplct(Emplct emplct) {
	this.emplct = emplct;
    }

    // création d'une méthode qui affiche le titre du livre et celui de son auteur.
    public void afficher() {
	System.out.print(this.titre + " " + this.nomAuteur + " ");
	this.emplct.afficher();

    }

}
