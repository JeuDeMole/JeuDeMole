package Modele;


public abstract class Personnage {
	
	private final static String DEFAULT = "xxxx";

	private String _nom;
	
	private void Initialiser(){
		this._nom = DEFAULT;
	}
	public Personnage(){
		this.Initialiser();
	}
	
	public Personnage(String nom) {
		this.Initialiser();
		this.setNom(nom);
	}
	
	public String getNom() {
		return _nom;
	}
	public void setNom(String _nom) {
		this._nom = _nom;
	}
	abstract String getEntete();
	
	protected String getCaracteristique(){
		String s = "";
		return(s);
	}
	
	@Override
	public String toString() {
		String s = "Personnage:\n nom: "+getNom()
				+ "\nclasse: "+getEntete()
				+ "\ncaracteristiques: "+getCaracteristique();
		 return (s);
	}
}