package Principal;

public class Guerrier extends PJ{
	
	public Guerrier(final int pv,final int lvl,final int armure,final int initiative,final int po,final int degats){
		super(pv, lvl, armure, initiative, po, degats, degats, degats, null);
	}
	
	@Override
	public String getEntete(){
		return ("Guerrier");
	}
	
	
	
}
