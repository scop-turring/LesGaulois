package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Gaulois obelix = new Gaulois("Ob�lix", 16);
		Romain minus = new Romain("Minus", 6);
		asterix.parler("Bonjour " + obelix.getNom() + ".");
		obelix.parler("Bonjour " + asterix.getNom() + ". Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui tr�s bonne id�e.");
		System.out.println("Dans la for�t " + asterix.getNom() + " et " + obelix.getNom()
				+ " tombe nez � nez sur le romain " + minus.getNom() + ".");
	
		for(int i=0;i<3;i++){
			asterix.frapper(minus);
		}

	}
}
