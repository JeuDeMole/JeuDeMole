package Principal;


public class Lieux {

	private String _nom;
	private int _nbPNJ;
	private int _nbEnnemi;
	private String _description;
	private int _coordonneeX;
	private int _coordonneeY;
	private String _biome;
	
	private void Initialiser(){
		this._nom=null;
		this._description=null;
		this._biome=null;
		this._nbPNJ=0;
		this._nbEnnemi=0;
		this._coordonneeX=0;
		this._coordonneeY=0;
	}
	
	public Lieux(){
		this.Initialiser();
	}

	public String getNom() {
		return _nom;
	}

	public void setNom(String _nom) {
		this._nom = _nom;
	}

	public int getNbPNJ() {
		return _nbPNJ;
	}

	public void setNbPNJ(int _nbPNJ) {
		this._nbPNJ = _nbPNJ;
	}

	public int getNbEnnemi() {
		return _nbEnnemi;
	}

	public void setNbEnnemi(int _nbEnnemi) {
		this._nbEnnemi = _nbEnnemi;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String _description) {
		this._description = _description;
	}

	public int getCoordonneeX() {
		return _coordonneeX;
	}

	public void setCoordonneeX(int _coordonneeX) {
		this._coordonneeX = _coordonneeX;
	}

	public int getCoordonneeY() {
		return _coordonneeY;
	}

	public void setCoordonneeY(int _coordonneeY) {
		this._coordonneeY = _coordonneeY;
	}

	public String getBiome() {
		return _biome;
	}

	public void setBiome(String _biome) {
		this._biome = _biome;
	}
	
	
}
