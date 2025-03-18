package graph;

import java.util.Random;
import java.util.Vector;


public class SmallWorldNetwork {

	Random rand = new Random();
	
	class Noeud{

		// position du noeud
		int index = 0;
		
		public Noeud(int index) {
			this.index = index;
		}
		
		public void afficherNoeud() {
			System.out.println("Noeud: " + index);
			System.out.println("connecté à");
			
			// affiche les noeuds auxquels ce noeud est connecté
			// à compléter
		}
		
	}	
	
	// frontière entre proche et loin
	int LIMITE_DISTANCE_PROCHE = 3;
	// probabilité des connexions courtes distances
	double[] PROB_VS_DIST_PROCHE = {0.0,0.85,0.66,0.33};
	// probabilité des connexions longues distances
	double PROB_VS_DIST_GRANDE = 0.02;
		
	Vector<Noeud> vecNoeud;
	
	/**
	 * Constructeur du graph: small world network 
	 * @param nbNoeuds nombre de noeud du graph
	 */
	public SmallWorldNetwork(int nbNoeuds) {
		
		// construit la collection de noeuds
		vecNoeud  = new Vector<Noeud>(nbNoeuds);

		// créé les noeuds
		for(int i=0;i<nbNoeuds;i++) {
			vecNoeud.add(new Noeud(i));
		}
		
		// parcour toutes les combinaisons, sans passer 2 fois sur la même paire
		for(int i=0;i<vecNoeud.size()-1;i++) {
			for(int j=i+1;j<vecNoeud.size();j++) {
				
				// calcul la distance entre les deux noeuds
				int distance = distanceEntreNoeud(vecNoeud.get(i), vecNoeud.get(j));
				
				// vérifie si les noeuds sont près, ou éloigné
				if(distanceEntreNoeud(vecNoeud.get(i), vecNoeud.get(j)) <= LIMITE_DISTANCE_PROCHE) {
					
					// détermine s'ils doivent être connectés
					if(rand.nextDouble() < PROB_VS_DIST_PROCHE[distance]) {
						
						// oui, à complàter
					}
				}else {
					
					// dàtermine s'ils doivent être connectés
					if(rand.nextDouble() < PROB_VS_DIST_GRANDE) {
						
						// oui, à compléter
					}
				}
			}
		}
		
	}

	/**
	 * Calcul la distance entre deux noeuds
	 * @param a un des noeud
	 * @param b l'autre noeud
	 * @return la distance entre les noeuds
	 */
	private int distanceEntreNoeud(Noeud a, Noeud b) {
		
		int nbNoeuds = Math.abs(vecNoeud.size());
		
		// calcul les candidats à la distance minimale et trouve
		// la valeur minimale
		int distance = Math.min(Math.min(
					   Math.abs(a.index-b.index),
					   Math.abs((a.index-nbNoeuds)-b.index)),
					   Math.abs(a.index-(b.index-nbNoeuds)));
		
		return distance;
	}
	
	/**
	 * Affiche les relations du réseau
	 */
	public void afficherGraph() {

		// pour tous les noeuds
		for(Noeud noeud:vecNoeud) {
			
			// affiche l'information
			noeud.afficherNoeud();
			System.out.println("");
			System.out.println("");
		}
	}
	
	
}
