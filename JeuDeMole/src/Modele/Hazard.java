package Modele;

import java.util.Random;

public class Hazard extends Random {

	private static final long serialVersionUID = 1L;
	private int _jetDeDe;
	
	public Hazard(){
		this._jetDeDe =  new Random().nextInt(20);
		System.out.println("le hazard a donné: "+this._jetDeDe);
	}
	
	public Hazard(int tauxDecrit){
		
		this._jetDeDe =  new Random().nextInt(tauxDecrit);
		System.out.println("le hazard a donné: "+this._jetDeDe);
	}
	
	public int HazToInt() {
		return this._jetDeDe;
		
	}
}
