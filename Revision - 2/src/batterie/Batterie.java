package batterie;

public class Batterie {

	private double charge = 0.0;
	private String noSerie;
	
	public Batterie(String noSerie, double chargeInitiale) {
		this.noSerie = noSerie;
		this.charge = chargeInitiale;
	}
	
	public double getCharge() {
		return charge;
	}
	
	public String toString() {
		return String.format("Batterie %.1f %%",charge*100);
	}
}
