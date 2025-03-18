package arbre;

import java.util.Vector;

public class Arbre {
	
	public static final int NIVEAU_MAX = 3;

	// un noeud de l'arbre
	class Noeud{
		
		int niveau;
		Noeud parent;
		Noeud enfant;
		
		// constructeur
		public Noeud(int niveau) {
			this.niveau = niveau;
		}

		public Noeud(int niveau, Noeud autreNoeud){
			this.niveau = niveau;
			if(niveau == NIVEAU_MAX){
				this.parent = autreNoeud;
			} else {
				this.enfant = autreNoeud;
			}
		}

		public Noeud(int niveau, Noeud parent, Noeud enfant){
			this.niveau = niveau;
			this.parent = parent;
			this.enfant = enfant;
		}

		public void setParent(Noeud parent) {
			this.parent = parent;
		}

		public void setEnfant(Noeud enfant) {
			this.enfant = enfant;
		}

	}	
	
	// collection des noeuds qui forment l'arbre
	Vector<Noeud> vecNoeud  = new Vector<Noeud>();
	
	/**
	 * constructeur qui assemble l'arbre
	 */
	public Arbre() {
		
		// initialise le premier noeud
		initialiserArbre();

		// ajoute les autres noeuds de mani�re it�rative
		int i = 0;
		while(developperNoeud(vecNoeud.get(i))){
			i++;
		}
		
	}

	/**
	 * m�thode qui crée le premier noeud
	 */
	public void initialiserArbre() {
		vecNoeud.add(new Noeud(0));
	}

	/**
	 * M�thode qui développe un noeud parent en 2 noeuds enfants
	 * @param parent, le noeud parent � d�velopper
	 * @return true, si développé false sinon.
	 */
	public boolean developperNoeud(Noeud parent) {
		
		// ajuste le niveau (niveau parent + 1)
		int nouveauNiveau = parent.niveau+1;
		
		// v�rifie si on a atteint la limite de l'arbre
		if(nouveauNiveau>=NIVEAU_MAX) {
			return false;
		}

		// crée noeud enfant gauche et droit
		Noeud gauche = new Noeud(nouveauNiveau, parent);
		Noeud droit = new Noeud(nouveauNiveau, parent);
		
		parent.setEnfant(gauche);
		parent.setEnfant(droit);

		// ajoute à la collection
		vecNoeud.add(gauche);
		vecNoeud.add(droit);

		return true;
	}
	
	/**
	 * affiche les détails de l'arbre
	 */
	public void afficherArbre() {
		
		for(Noeud noeud: vecNoeud) {
			System.out.println(noeud.niveau);
		}
	}
}
