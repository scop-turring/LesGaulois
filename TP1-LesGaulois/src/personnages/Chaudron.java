package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public boolean resterPotion() {
		if (quantitePotion <= 0) {
			return false;
		} else {
			return true;
		}
	}

	public int prendreLouche() {
		if (resterPotion()) {
			quantitePotion -= 1;
			return forcePotion + 1;
		} else {
			forcePotion = 0;
			return forcePotion;
		}
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;

	}

}
