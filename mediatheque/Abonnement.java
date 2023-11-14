package mediatheque;

public class Abonnement {
    // les attributs, ici, sont spécifiques uniquement à cette classe.
    private String nomAbo;
    private int nbEmpruntMax;
    private boolean logitheque;

    // création du constructeur
    public Abonnement(String nomAbo, int nbEmpruntMax, boolean logitheque) {
	super();
	this.nomAbo = nomAbo;
	this.nbEmpruntMax = nbEmpruntMax;
	this.logitheque = logitheque;
    }

    // création des getters et des setters.
    public String getNomAbo() {
	return nomAbo;
    }

    public void setNomAbo(String nomAbo) {
	this.nomAbo = nomAbo;
    }

    public int getNbEmpruntMax() {
	return nbEmpruntMax;
    }

    public void setNbEmpruntMax(int nbEmpruntMax) {
	this.nbEmpruntMax = nbEmpruntMax;
    }

    public boolean isLogitheque() {
	return logitheque;
    }

    public void setLogitheque(boolean logitheque) {
	this.logitheque = logitheque;
    }

}
