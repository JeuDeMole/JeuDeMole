
public class CompetencesSpe 
{
	//attaque double
	public void attaqueDouble(PersoAction recevant)
	{
		System.out.println(this.getNom + " fait une double attaque !!");
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
}
