package programme;

import java.util.Random;
import java.util.Vector;

import batterie.Batterie;
import batterie.Utilitaires;
import feuxCirculation.Boulevard;
import feuxCirculation.TypeFeu;
import graph.SmallWorldNetwork;
import grille.GrilleDeJeu;
import tda.FilePriorite;

public class ProgrammePrincipal {
	
	public static final int NB_ELEMENTS_LISTE = 15;
	static Random rand = new Random();

	public static void main(String[] args) {
		//Q1();
		//Q2();
		//Q3();
		//Q5();
	}

	// small world network (chaînage + collection)
	private static void Q1() {
		SmallWorldNetwork smallWorld = new SmallWorldNetwork(15);
		smallWorld.afficherGraph();
	}
	

	// démineur (Tableau 2D)
	private static void Q2() {
		
		GrilleDeJeu grilleDeJeu = new GrilleDeJeu(10, 10, 10);
		grilleDeJeu.afficherGrille(true);

	}

	// batteries Us�e (Collection)
	private static void Q3() {

		Vector<Batterie> batteries = new Vector<Batterie>();
		
		for(int i=0;i<15;i++) {
			batteries.add(new Batterie(String.format("%d",i),rand.nextDouble()));
		}
		
		Vector<Batterie> batteriesACharger = Utilitaires.trierBatteries(batteries);

		System.out.println("Batterie à garder");
		for(Batterie batterie : batteries) {
			System.out.println(batterie.toString());
		}

		if(batteriesACharger != null) {
			System.out.println("Batterie à charger");
			for(Batterie batterie : batteriesACharger) {
				System.out.println(batterie.toString());
			}
		}
	}

	private static void Q5() {
		FilePriorite<Integer> file = new FilePriorite<Integer>();
		
		for(int i=0;i<NB_ELEMENTS_LISTE;i++) {
			file.enfiler(new Integer(rand.nextInt(1000)));
		}
		
		for(int i=0;i<NB_ELEMENTS_LISTE;i++) {
			try {
				System.out.println(file.defiler());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	
}
