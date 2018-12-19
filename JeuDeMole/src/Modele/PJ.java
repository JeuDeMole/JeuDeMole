package Modele;


abstract class PJ extends PersoAction{
	
	
	/* ********************************************CONSTRUCTOR *************************************************/
	
	
	public PJ(String nom, int pv, int lvl, int armure, int initiative, int po, int degats, int force, int sagesse) {
		super(nom, pv, lvl, armure, initiative, po, degats, force, sagesse);
	}
	
	/* ********************************************ACCESSEUR *************************************************/
	
	//useless
	
	
	/* ********************************************METHOD *************************************************/

	abstract String getEntete();
	
	

}
