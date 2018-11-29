package Principal;

import Competences.*;

import java.util.ArrayList;
import java.util.List;

abstract class PJ extends PersoAction{
	
	private int _sagesse;
	private int _force;
	private List<Competence> _listComp; 
	
	/* ********************************************CONSTRUCTOR *************************************************/
	
	
	public PJ(int pv, int lvl, int armure, int initiative, int po, int degats, int force, int sagesse, Competence competences) {
		super(pv, lvl, armure, initiative, po, degats);
		this._force = force;
		this._sagesse = sagesse;
		this._listComp = new ArrayList<Competence>();
	}
	
	/* ********************************************ACCESSEUR *************************************************/
	
	public int getSagesse() {
		return _sagesse;
	}

	public void setSagesse(int _sagesse) {
		this._sagesse = _sagesse;
	}

	public int getForce() {
		return _force;
	}

	public void setForce(int _force) {
		this._force = _force;
	}
	
	
	/* ********************************************METHOD *************************************************/

	abstract String getEntete();
	
	public void addComp(Competence competences){
		_listComp = new ArrayList<Competence>(); 
		
		_listComp.add(competences);		
	}

}
