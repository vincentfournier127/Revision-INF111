package dictionnaire;

public class Dictionnaire {

	private String[] dict;
	private int nbMots;
	
	/**
	 * Constructeur 
	 * @param taille, taille initiale du dictionnaire
	 */
	public Dictionnaire(int taille) {
		dict = new String[taille];
	}
	
	/**
	 * Cette méthode ajoute le mot au dictionnaire, à l'endroit
	 * spécifié par son ordre naturel (ordre alphabétique)
	 * @param mot le mot à ajouter au dictionnaire
	 */
	public void ajouterMot(String mot) {

		// à compléter
		
	}

	/**
	 * Méthode qui affiche le contenu du dictionnaire
	 */
	public void afficherContenu() {
		for(int i=0;i<nbMots;i++) {
			System.out.println(dict[i]);
		}
	}
	
	
}
