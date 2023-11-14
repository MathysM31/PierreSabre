package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 4;
	
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	
	public int getReputation() {
		return reputation;
	}


	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		int argentvole = victime.getArgent();
		victime.seFaireExtorquer();
		this.reputation++;
		gagnerArgent(argentvole);
		parler("J'ai piqu� les "+ argentvole +" sous de "+ victime.getNom() +", ce qui me fait "+ this.getArgent()+ " sous dans ma\r\n"
				+ "poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argentperdu = getArgent();
		reputation--;
		parler("J�ai perdu mon duel et mes "+ argentperdu +" sous, snif... J'ai d�shonor� le clan de "+ this.clan);
		perdreArgent(argentperdu);
		return reputation;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre "+ getNom() +" du clan de "+ this.clan +" ? Je l'ai d�pouill� de ses "+ gain +" sous.");
	}
	
	
}
