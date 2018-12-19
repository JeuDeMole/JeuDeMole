package Modele;

public abstract class PNJ extends Personnage{
	private final static String DEFAULT = "xxxx";
	private String _description;
	private String _dialogue;
	
	private void Initialiser(){
		this._description = DEFAULT;
		this._dialogue = DEFAULT;
	}
	public PNJ(){
		this.Initialiser();
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String _description) {
		this._description = _description;
	}
	public String get_dialogue() {
		return _dialogue;
	}
	public void set_dialogue(String _dialogue) {
		this._dialogue = _dialogue;
	}
	
	protected String getCaracteristique(){
		String s = "";
		return(s);
	}
	@Override
	public String toString() {
		 
		String s = super.toString()+"\n"
		+get_description()+"\n" 
		+get_dialogue()+"\n"
		+getCaracteristique();
		return(s);
	}
	protected abstract String getEntete();
}