package personnages;

import personnages.Yakuza;


public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentdonner = getArgent()/10;
		parler(beneficiaire.getNom() +" prends ces "+ argentdonner +" sous");
		beneficiaire.recevoir(argentdonner);
		perdreArgent(argentdonner);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		if (force > adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
			int argentgagne = adversaire.getArgent();
			gagnerArgent(argentgagne);
			honneur++;
		}else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(getArgent());
			int argentperdu = adversaire.getArgent();
			perdreArgent(argentperdu);
			honneur--;
		}
	}
}
