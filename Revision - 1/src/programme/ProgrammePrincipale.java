package programme;
import java.util.Random;
import java.util.Vector;

import arbre.Arbre;
import courriel.Courriel;
import courriel.Utilitaires;
import dictionnaire.Dictionnaire;
import matrices.Matrice;

public class ProgrammePrincipale {

	static Random rand = new Random();
	
	/**
	 * Programme principale, activer le test voulu.
	 * @param args, n/a
	 */
	public static void main(String[] args) {
		

		// System.out.println("Q1--------------");
		// Q1();

		System.out.println("Q2--------------");
		Q2();

		//System.out.println("Q3--------------");
		//Q3();

		//System.out.println("Q4--------------");
		//Pas de test disponible

		//System.out.println("Q5--------------");
		//Q5();
	}

	// arbre (cha�nage)
	private static void Q1() {

		// reste � ajouter les liens
		Arbre arbre = new Arbre();
		arbre.afficherArbre();
	}

	// courriels (Collection)
	private static void Q2() {
		// reste à compléter
		Vector<Courriel> courriels = new Vector<Courriel>(25);
		
		for(int i=0;i<20;i++) {
			double randNb = rand.nextDouble();
			
			if(randNb < 0.33) {
				courriels.add(new Courriel(true,false));
			}else if(randNb < 0.66) {
				courriels.add(new Courriel(false,true));
			}else {
				courriels.add(new Courriel(false,false));
			}
		}
		
		System.out.println("Avant");
		Utilitaires.afficherCourriels(courriels);
		Utilitaires.trierCourriels(courriels);
		System.out.println("Apres");
		Utilitaires.afficherCourriels(courriels);
	}
	

	// (Tableau 2D)
	private static void Q3() {
		Matrice A = new Matrice(4,5);

		System.out.println("avant");
		A.afficherMatrice();
		A.trierMatrice();
		System.out.printf("\naprès\n");
		A.afficherMatrice();
	}

	
	// dictionnaire (Liste statique et String)
	private static void Q5() {

		Dictionnaire dict = new Dictionnaire(10);
		
		dict.ajouterMot("allo");
		dict.ajouterMot("toi");
		dict.ajouterMot("comment");
		dict.ajouterMot("ca");
		dict.ajouterMot("va");
		dict.afficherContenu();
	}
	
}
