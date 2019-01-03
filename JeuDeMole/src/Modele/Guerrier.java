package Modele;

public class Guerrier extends PJ {
	
	
	public Guerrier(final String nom, final int pv,final int lvl,final int armure,final int initiative,final int po,final int degats, int force, int sagesse){
		super(nom, pv, lvl, armure, initiative, po, degats, force, sagesse);
		System.out.println("A new chalenger approaches:"+this.getNom()+"\n");
	}
	
	//attaque double
	public void attaqueDouble(PersoAction recevant)
	{
		System.out.println(this.getNom() + " fait une double attaque !!");
		for(int i =0; i<2;i++)
		{
			this.attack(recevant);
		}
	}
	//Armure naturelle
	public void armureNaturelle()
	{
		System.out.println("Vos reflexes deviennent plus vifs et vous confèrent une meilleure defense en combat");
		this.setArmure(this.getArmure() + 2);
	}
	//Science du critique
	public void scienceDuCritique()
	{
		System.out.println("Votre precision s'accrue ce qui vous permet d'augmenter vos chances des faire des degats critique");
		this.setCritique(19);
	}
	@Override
	public String getEntete(){
		return ("Guerrier");
}

}
