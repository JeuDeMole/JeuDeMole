package Modele;

public class Animal extends Ennemi {
	public Animal(){
		super();
	}
	
	@Override
	public String getEntete(){
		String s = "Loup";
		return(s);
	}
}
