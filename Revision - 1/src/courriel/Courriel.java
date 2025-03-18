package courriel;

public class Courriel {

	private boolean indesirable = false;
	private boolean important = false;
	
	public Courriel(boolean indesirable, boolean important) {
		this.indesirable = indesirable;
		this.important = important;
	}
	
	public boolean estIndesirable() {
		return indesirable;
	}
	
	public boolean estImportant() {
		return important;
	}

	public String toString() {
		String retour = "";

		retour += "Courriel ";
		
		if(indesirable) {
			retour += "est indesirable ";
		}
		if(important) {
			retour += "est important ";
		}
		
		return retour;
	}
}
