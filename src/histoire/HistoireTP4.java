package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;


public class HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco",15);
		Ronin roro = new Ronin("Roro","shochu",54);
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",45,"Warsong");
		roro.provoquer(yaku);

	}

}
