package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("Printemps", 1),
	ETE("Eté",2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver",4);
	
	private String libelle;
	private int ordre;
	
	
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public int getOrdre() {
		return ordre;
	}


	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	
	public static Saison getInstancelibel(String libelle) {
		for(Saison maSaison : Saison.values()) {
			if(maSaison.getLibelle().equals(libelle)) {
				return maSaison;
			}
		}
		return null;
	}
	
	
	
	
}
