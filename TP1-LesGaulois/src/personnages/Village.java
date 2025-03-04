package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;
	private int NB_VILLAGEOIS_MAX;

	public String getNom() {
		return nom;
	}

	public Village(String nom, Gaulois chef, int nB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.chef = chef;
		NB_VILLAGEOIS_MAX = nB_VILLAGEOIS_MAX;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}

	public Gaulois trouverVillageois(int numeroVillageois) {
		if ((numeroVillageois < 1) || (numeroVillageois > nbVillageois)) {
			System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			return null;
		} else {
			return villageois[numeroVillageois - 1];
		}
	}
}
