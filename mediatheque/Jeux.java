package mediatheque;

public class Jeux extends Ouvrage {
    private CategoriesJeux catJeux;

    public Jeux(String titre, String nomAuteur, int numJeux, Emplct emplct, CategoriesJeux catJeux) {
	super(titre, nomAuteur, numJeux, emplct);
	this.catJeux = catJeux;
    }

    public CategoriesJeux getCatJeux() {
	return catJeux;
    }

    public void setCatJeux(CategoriesJeux catJeux) {
	this.catJeux = catJeux;
    }
}
