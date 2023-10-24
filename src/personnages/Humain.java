package personnages;

public class Humain {
	protected String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("<< " + texte + " >>");
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ getNom() +" et j'aime boire du "+ this.boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de "+ this.boisson +" ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix < argent) {
			parler("J'ai "+ getArgent()+" sous en poche. Je vais pourvoir m'offrir un(e) "+ bien +" à "+ prix +"sous");
		} else {
			parler("Je n'ai plus que "+ getArgent()+" sous en poche. Je ne peux même m'offrir un(e) "+ bien +" à "+ prix +"sous");
		}
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
