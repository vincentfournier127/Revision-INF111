package grille;

import java.util.Random;

public class GrilleDeJeu {
	
	public final int CODE_MINE = -1;
	
	private final char SYMBOLE_MINE = '⛯';
	private final char SYMBOLE_CACHE = 'X';
	
	private int[][] solution;
	private boolean[][] masque;
	
	private Random rand = new Random(1);
	
	/**
	 * constructeur de la grille de jeu, initialise la grille avec des 0.
	 * @param nbLignes nombre de lignes de la grille
	 * @param nbColonnes nombre de colonnes de la grille
	 * @param nbMines nombre de mines � placer
	 */
	public GrilleDeJeu(int nbLignes, int nbColonnes, int nbMines) {
		solution = new int[nbLignes][nbColonnes];
		masque = new boolean[nbLignes][nbColonnes];
		
		for(int i=0;i<nbLignes;i++) {
			for(int j=0;j<nbColonnes;j++) {
				solution[i][j] = 0;
				masque[i][j] = false;
			}
		}
		
		// place les mines
		placerMines(nbMines);
		
		// place les comptes
		placerComptes();
	}
	
	public int getNbLignes() {
		return solution.length;
	}

	public int getNbColonnes() {
		return solution[0].length;
	}
	
	/**
	 * Dispose un ensemble de mines dans la grille
	 * @param nbMines nombre de mines � placer
	 */
	private void placerMines(int nbMines) {
		
		int nbMinesPlacees = 0;
		
		while(nbMinesPlacees < nbMines) {

			int ligne = rand.nextInt(solution.length);
			int colonne = rand.nextInt(solution[0].length);

			if(solution[ligne][colonne] != CODE_MINE) {
				solution[ligne][colonne] = CODE_MINE;
				nbMinesPlacees++;
			}
		}
	}
	
	/**
	 * Place les comptes dans la grille. Chaque compte est 
	 * indicatif du nombre de mines adjacentes � la case
	 */
	private void placerComptes() {

		// à complàter
	}
	

	public boolean revelerCase(int i, int j) {
		masque[i][j] = true;
		return solution[i][j]==CODE_MINE;
	}
	
	/**
	 * m�thode qui affiche la grille
	 * @param afficherSolution indique si la solution doit �tre affich�
	 */
	public void afficherGrille(boolean afficherSolution) {
		
		for(int i=0;i<solution.length;i++) {
			for(int j=0;j<solution[0].length;j++) {
				if(masque[i][j] || afficherSolution) {
					if(solution[i][j]==CODE_MINE) {
						System.out.print(SYMBOLE_MINE);
					}else {
						System.out.print(solution[i][j]);
					}
					
				}else {
					System.out.print(SYMBOLE_CACHE);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
