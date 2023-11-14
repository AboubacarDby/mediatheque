package mediatheque;

import java.time.LocalDate;

public class MediathequeObjet {

    public static void main(String[] args) {
	// creation des variables avec les données que l'on veut attribuer à notre
	// lecteur, toujours utiliser le "new" pour créer.
	Abonnement passSimple = new Abonnement("simple", 4, false);
	Abonnement passMulti = new Abonnement("multimédia", 8, true);
	Lecteur lecteur = new Lecteur("Jean", "Dupont", 1, passSimple);
	Lecteur lecteur2 = new Lecteur("Jeannette", "Dupont", 2, passSimple);
	Bibliothecaire bibliothecaire = new Bibliothecaire("Michelle", "Lelong");
	Emplct emplctJeux = new Emplct(1, 1, "Jeux");
	Emplct emplctLivres = new Emplct(1, 2, "Livres");
	Jeux jeuCatane = new Jeux("Catane", "Paolo Paola", 1, emplctJeux, CategoriesJeux.FAM);
	Jeux jeuUno = new Jeux("Uno", "Frantz Licht", 2, emplctJeux, CategoriesJeux.FAM);
	// respecter l'ordre décrit dans le constructeur sinon risque de ne pas
	// reconnaître ce qui est décrit.
	Livres livreCarrie = new Livres("Carrie", "Stephen King", 1, emplctLivres, CategoriesLivres.POL,
		"978-2-11-224-4");
	Livres livre = new Livres("L'Amour est dans le Pré", "Penelope Douglas", 2, emplctLivres, CategoriesLivres.ROM,
		"978-2-11-226-4");
	Catalogue catalogue = new Catalogue();
	// Lorsque l'on veut ajouter, on utilise ".add" suivie de ce que l'on veut
	// ajouter entre parenthèses
	catalogue.getJeux().add(jeuUno);
	catalogue.getJeux().add(jeuCatane);
	catalogue.getLivres().add(livreCarrie);
	catalogue.getLivres().add(livre);
	catalogue.afficher();
	Emprunts emprunt = lecteur.emprunter(livreCarrie);
	// Pour aller chercher une information dans une autre, on utilise le "." après
	// l'élèment dans lequel on veut chercher cette information.
	System.out.println(emprunt.getDateEmprunt().toString() + " " + emprunt.getLecteur().getNom() + " "
		+ emprunt.getLivre().getTitre());
	Emprunts emprunt2 = lecteur.emprunter(jeuUno);
	System.out.println(emprunt2.getDateEmprunt().toString() + " " + emprunt2.getLecteur().getNom() + " "
		+ emprunt2.getJeu().getTitre());
	Acteur cat1 = new Acteur();
	cat1.rechercher(catalogue, "", "", CategoriesJeux.FAM);
	cat1.rechercher(catalogue, "", "", CategoriesLivres.POL);
	lecteur.retourJeu(LocalDate.now(), emprunt2);
	System.out.println(emprunt2.getDateEmprunt().toString() + " " + emprunt2.getDateRetour().toString());

    }

}
