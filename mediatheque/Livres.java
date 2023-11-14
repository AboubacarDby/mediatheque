package mediatheque;

public class Livres extends Ouvrage {
    // création d'un attribut qui sera spécifique à cette classe.
    private CategoriesLivres catLiv;
    private String numIsbn;

    // création du constructeur avec ses paramètres Mais pas de getters et setters
    // pour cette classe.
    public Livres(String titreLivre, String nomAuteur, int numLivre, Emplct emplct, CategoriesLivres catLiv,
	    String numIsbn) {
	super(titreLivre, nomAuteur, numLivre, emplct);
	this.catLiv = catLiv;
	this.numIsbn = numIsbn;
    }

    public CategoriesLivres getCatLiv() {
	return catLiv;
    }

    public void setCatLiv(CategoriesLivres catLiv) {
	this.catLiv = catLiv;
    }

    public String getNumIsbn() {
	return numIsbn;
    }

    public void setNumIsbn(String numIsbn) {
	this.numIsbn = numIsbn;
    }
}
