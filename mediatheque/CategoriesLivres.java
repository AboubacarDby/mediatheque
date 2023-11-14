package mediatheque;

public enum CategoriesLivres {
    // attribut qui sont spécifiques à cette classe

    ROM("Romance"), POL("Polar"), AUTO("Autobiographie");

    String nom;

    private CategoriesLivres(String nom) {
	this.nom = nom;
    }

}
