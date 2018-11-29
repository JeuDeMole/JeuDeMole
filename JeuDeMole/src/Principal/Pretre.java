package Principal;

import Competences.Competence;

public class Pretre extends PJ{
	
	public Pretre(final int pv,final int lvl,final int armure,final int initiative,final int po,final int degats,int force, int sagesse, Competence competences){
		super(pv, lvl, armure, initiative, po, degats, force, sagesse, competences);
	}
	
	@Override
	public String getEntete (){
		return ("Pretre");
	}

}
