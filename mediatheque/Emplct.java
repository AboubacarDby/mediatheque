package mediatheque;

public class Emplct {
    // Création des attributs qui seront spécifique à cette classe
    private int numSerie;
    private int rayonnage;
    private String fond;

    // création du constructeur de la classe
    public Emplct(int numSerie, int rayonnage, String fond) {
	super();
	this.numSerie = numSerie;
	this.rayonnage = rayonnage;
	this.fond = fond;
    }

    // création des getters et des setters de la classe
    public int getNumSerie() {
	return numSerie;
    }

    public void setNumSerie(int numSerie) {
	this.numSerie = numSerie;
    }

    public int getRayonnage() {
	return rayonnage;
    }

    public void setRayonnage(int rayonnage) {
	this.rayonnage = rayonnage;
    }

    public String getFond() {
	return fond;
    }

    public void setFond(String fond) {
	this.fond = fond;
    }

    // création de la méthode de la classe qui va afficher des caractéristques au
    // livre.
    public void afficher() {
	System.out.println(this.fond + "/" + this.numSerie + "/" + this.rayonnage);
    }
}
