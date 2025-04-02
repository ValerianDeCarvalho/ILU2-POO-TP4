package produit;

public class Sanglier extends Produit{
	private String chasseur;
	private int poids;
	
	public Sanglier(String chasseur, int poids) {
		super("sanglier", Unite.kilogramme);
		this.chasseur = chasseur;
	    this.poids = poids;
	}
	
	@Override
	public void decrireProduit() {
		System.out.println(getNom() +" de " + poids + getUnite().getString() + " chassé par " + chasseur);
	}

}