package Competences;

import Principal.*;;


public class BouclierDeLaFoi implements Competence {
	
	public void Complvl1(PersoAction perso){
		int defenseSup = 2;
		
		defenseSup += perso.getArmure();
		perso.setArmure( defenseSup);
		//System.out.println(defenseSup);
	}
}
