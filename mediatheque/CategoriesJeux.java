package mediatheque;

public enum CategoriesJeux {
    // attribut qui sont spécifiques à cette classe
    STR("Stratégie"), FAM("Familiale"), TRAD("Traditionel");

    String nom;

    private CategoriesJeux(String nom) {
	this.nom = nom;
    }

}
