package Modele;

public class Pretre extends PJ {

	public Pretre(final String nom, final int pv,final int lvl,final int armure,final int initiative,final int po,final int degats, int force, int sagesse){
		super(nom, pv, lvl, armure, initiative, po, degats, force, sagesse);
		System.out.println("A new chalenger approaches:"+this.getNom()+"\n");
	}
	
	//Bénédictions
	public void benediction(PJ recevant)
	{
		System.out.println(this.getNom + " entonne un chant de guerre et se motive lui et tout ses alliés");
		recevant.setForce(recevant.getForce() + 1);
		recevant.setSagesse(recevant.getSagesse() + 1);
		this.setForce(this.getForce() + 1);
		this.setSagesse(this.getSagesse() + 1);

	}
	public void finBenediction(PJ recevant)
	{
		recevant.setForce(recevant.getForce() - 1);
		recevant.setSagesse(recevant.getSagesse() - 1);
		this.setForce(this.getForce() - 1);
		this.setSagesse(this.getSagesse() - 1);
	}
	
	//Bouclier de la foi
	public void BouclierDeLaFoi()
	{
		System.out.println("Vous inscrivez le symbole de votre foi sur votre bouclier afin d'augmenter sa résistance");
		this.setArmure(this.getArmure() + 2);
	}
	
	//Soin Léger
	public void soinLeger(PJ recevant)
	{
		System.out.println("Vous poser vos mains sur la blessure et vous sentez les plaies se guerir sous vos doigts");
		recevant.setPV(recevant.getPV() + this.getSagesse());
		if (recevant.getPV() > recevant.getPVMax())
		{
			recevant.setPV(recevant.getPVmax());
		}
	}

	@Override
	public String getEntete(){
		return ("Pretre");
}
	

}
