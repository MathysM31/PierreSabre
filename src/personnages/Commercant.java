package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	
	
	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...");
		perdreArgent(getArgent());
		return getArgent();
	}
	
	public void recevoir(int argentrecu) {
		parler(argentrecu + " sous ! Je te remercie genereux donateur !");
		gagnerArgent(argentrecu);
	}
	
}
