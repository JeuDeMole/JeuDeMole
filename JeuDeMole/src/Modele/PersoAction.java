package Modele;

public abstract class PersoAction extends Personnage{
	
	// Attributs d'instance
		private int _PV;
		private int _LVL;
		private int _armure;
		private int _initiative;
		private int _PO;
		private int _degat;
		private int _force;
		private int _sagesse;

		// Métdodes d'instance
		private void initialiser(){
			this.setPV(0);
			this.setLVL(0);
			this.setArmure(0);
			this.setInitiative(0);
			this.setPO(0);
			this.setDegats(0);
			this.setForce(0);
			this.setSagesse(0);
		}

		public PersoAction(String nom,  int pv, int lvl, int armure, int initiative, int po, int degats, int force, int sagesse){
			super(nom);
			this.initialiser();
			this.setPV(pv);
			this.setLVL(lvl);
			this.setArmure(armure);
			this.setInitiative(initiative);
			this.setPO(po);
			this.setDegats(degats);
			this.setForce(force);
			this.setSagesse(sagesse);
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
		
		abstract String getEntete();
		
		public void RecevoirDegats(int degat) {
			this.setPV(this.getPV() - degat);
			this.estVivant();
		}
		
		public void Attack(PersoAction recevant) {
			int jetDeDe;
			
			System.out.println("attack");
			
			jetDeDe = new Hazard().HazToInt();
			jetDeDe += this.getForce();
			if(jetDeDe>recevant.getArmure()) {
				if (jetDeDe==20) {
					System.out.println("Cout critique !!! Les degats sont doubles");
					recevant.RecevoirDegats(this.getDegats()*2);
					System.out.println("Les degats sont de "+this.getDegats()*2);
				}
				else {
					System.out.println("L'attque a reussi");
					System.out.println("Les degats sont de "+this.getDegats());
					recevant.RecevoirDegats(this.getDegats());
				}	
			}
			else {
				System.out.println("L'attaque a echoue");
			}
		}
		
		public boolean estVivant()
		{
			if(this.getPV() == 0)
			{
				System.out.println(this.getNom()+" est mort !");
				return false;
			}
			else
				return true;
		}
		
		

}
