package mediatheque;

public class Acteur {
    // Cette classe est la "Mère" et ses filles sont les classes Lecteur et
    // Bibliothecaire, qui héritent d'elle.
    private String prenom;
    private String nom;

    // création du constructeur
    public Acteur(String prenom, String nom) {
	super();
	this.prenom = prenom;
	this.nom = nom;
    }

    // création d'un constructeur vide, c'est-à-dire qui ne possède aucun
    // paramètres.
    public Acteur() {
	super();
    }

    // création des getters et des setters.
    public String getPrenom() {
	return prenom;
    }

    public void setPrenom(String prenom) {
	this.prenom = prenom;
    }

    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    // déclaration d'une méthode qui va effectuer une recherche pour l'élément
    // voulu.
    public void rechercher(Catalogue catalogue, String nomAuteur, String titre, CategoriesJeux jeu) {
	for (Jeux ouvr : catalogue.getJeux()) {
	    if ((nomAuteur != "" && ouvr.getNomAuteur() == nomAuteur) || (titre != "" && ouvr.getTitre() == titre)
		    || (jeu != null && ouvr.getCatJeux() == jeu)) {
		ouvr.afficher();
	    }
	}
    }

    public void rechercher(Catalogue catalogue, String nomAuteur, String titre, CategoriesLivres livre) {
	for (Livres ouvr : catalogue.getLivres()) {
	    if ((nomAuteur != "" && ouvr.getNomAuteur() == nomAuteur) || (titre != "" && ouvr.getTitre() == titre)
		    || (livre != null && ouvr.getCatLiv() == livre)) {
		ouvr.afficher();
	    }
	}
    }

    // Qui ? C'est l'acteur qui doit/va faire le retour du livre ou du jeu qu'il
    // a emprunter
    // Pour faire quoi ? renvoyer l'emprunt avec la date modifier
    // Avec quoi ? Pour le retour il faut la date, le nom de ce qui est
    // retourné, l'auteur de l'ouvrage et la categorie
    // Avec qui ? avec le lecteur qui va rendre l'ouvrage emprunter(jeu ou livre) et
    // la bibliothecaire qui va rentrer dans le système la date de retour et
    // l'ouvrage qui est rendu

}
