package produit;

public enum Unite {
	gramme ("g"),
	kilogramme ("kg"),
	litre ("l"),
	centilitre ("cl"),
	millilitre ("ml"),
	pièce("pièce");

	private final String string;
	
	Unite(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
	
}
