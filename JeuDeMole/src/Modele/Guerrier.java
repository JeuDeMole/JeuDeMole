package Modele;

public class Guerrier extends PJ {
	
	
	public Guerrier(final String nom, final int pv,final int lvl,final int armure,final int initiative,final int po,final int degats, int force, int sagesse){
		super(nom, pv, lvl, armure, initiative, po, degats, force, sagesse);
		System.out.println("A new chalenger approaches:"+this.getNom()+"\n");
	}

	@Override
	public String getEntete(){
		return ("Guerrier");
}

}
