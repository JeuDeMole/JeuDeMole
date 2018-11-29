package Principal;

public abstract class Personnage {
	private final static String DEFAULT = "xxxx";

	private String _nom;
	//private static int _crit;
	
	private void Initialiser(){
		this._nom = DEFAULT;
	}
	public Personnage(){
		this.Initialiser();
	}
	public String getNom() {
		return _nom;
	}
	public void setNom(String _nom) {
		this._nom = _nom;
	}
	protected String getEntete(){
		String s = "";
		return (s);
	}
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
	