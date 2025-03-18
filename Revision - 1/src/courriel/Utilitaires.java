package courriel;

import java.util.Vector;

public class Utilitaires {
	
	public static void trierCourriels(Vector<Courriel> boiteReception) { 
		for(int i = boiteReception.size(); i > 0; i--){
			Courriel currentCourriel = boiteReception.get(i);
			if(currentCourriel.estImportant()){
				boiteReception.remove(i);
				boiteReception.add(0, currentCourriel);
			} else if (currentCourriel.estIndesirable()){
				boiteReception.remove(i);
			}
		}
		
	}
	

	public static void afficherCourriels(Vector<Courriel> boiteReception) { 
		
		for(Courriel courriel : boiteReception) {
			System.out.println(courriel.toString());
		}
	}
}
