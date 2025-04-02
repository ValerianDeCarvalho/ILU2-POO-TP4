package produit;

public class Poisson extends Produit{
	private String datePeche;
	
	public Poisson(String datePeche) {
		super("poisson", Unite.pi�ce);
		this.datePeche = datePeche;
	}
	
	@Override
	public void decrireProduit() {
		System.out.println(getNom() +" p�ch�s " + datePeche);
	}
	
}