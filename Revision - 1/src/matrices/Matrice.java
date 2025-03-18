package matrices;

import java.util.Random;

public class Matrice {

	private double[][] matrice;
	private Random rand = new Random();
	
	public Matrice(int nbLignes, int nbColonnes) {
		
		matrice = new double[nbLignes][nbColonnes];
		
		for(int i=0;i<nbLignes;i++) {
			for(int j=0;j<nbColonnes;j++) {
				matrice[i][j] = rand.nextDouble();
			}
		}
	}
	
	public double getSommeLigne(int ligne) throws Exception{
		if(ligne < 0 || ligne >= matrice.length)
			throw new Exception("La ligne dont vous desirez la somme n'existe pas");


		double somme = 0.0;
		for(int i = 0; i < matrice[ligne].length; i++){
			somme += matrice[ligne][i];
		}
		
		return somme;
	}

	public void permuterLignes(int ligneA, int ligneB) throws Exception{
		if( ligneA < 0 || ligneB < 0 || ligneA >= matrice.length || ligneB >= matrice.length)

		for(int i = 0; i< matrice[0].length; i++){
			double temp = matrice[ligneB][i];
			matrice[ligneB][i] = matrice[ligneA][i];
			matrice[ligneA][i] = temp;
		}
	}
	

	public void trierMatrice(){
		for(int i = 0; i < matrice.length - 1; i++){
			for(int j = i + 1; j < matrice.length; j++){
				try{
					if(getSommeLigne(i) > getSommeLigne(j))
						permuterLignes(i, j);
				} catch (Exception e){
					System.err.println(e);
				}

			}
		}
	}
	

	public void afficherMatrice(){
		for(int i=0;i<matrice.length;i++) {

			try {
				System.out.printf("%3.2f: ", getSommeLigne(i));

				for(int j=0;j<matrice[0].length;j++) {
					System.out.printf("%3.2f ",matrice[i][j]);
				}
				System.out.println();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
