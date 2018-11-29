package Principal;

//import Competences.*;

public abstract class PersoAction {
	
	// Attributs d'instance
		private int _PV;
		private int _LVL;
		private int _armure;
		private int _initiative;
		private int _PO;
		private int _degat;

		// Métdodes d'instance
		private void initialiser(){
			this.setPV(0);
			this.setLVL(0);
			this.setArmure(0);
			this.setInitiative(0);
			this.setPO(0);
			this.setDegats(0);
		}

		public PersoAction( int pv, int lvl, int armure, int initiative, int po, int degats){
			super();
			this.initialiser();
			this.setPV(pv);
			this.setLVL(lvl);
			this.setArmure(armure);
			this.setInitiative(initiative);
			this.setPO(po);
			this.setDegats(degats);
		}

		// Accesseurs
		// PV
		public void setPV(int v){
			this._PV = v;
		}
		public int getPV(){
			return (this._PV);
		}

		// LVL
		public void setLVL(int v){
			this._LVL = v;
		}
		public int getLVL(){
			return (this._LVL);
		}

		// Armure
		public void setArmure(int v){
			_armure = v;
		}
		public int getArmure(){
			return _armure;
		}

		// Initiative
		public void setInitiative(int v){
			this._initiative = v;
		}
		public int getInitiative(){
			return (this._initiative);
		}

		// PO
		public void setPO(int v){
			_PO = v;
		}
		public int getPO(){
			return _PO;
		}

		// Dégats
		public void setDegats(int v){
			_degat = v;
		}
		public int getDegats(){
			return (_degat);
		}
		
		abstract String getEntete();
		
		// AJOUTER LA METHODE COMBAT

	}

