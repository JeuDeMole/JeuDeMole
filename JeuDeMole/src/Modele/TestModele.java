package Modele;

public class TestModele {

	public static void main(String[] args) {
		Guerrier ragnar = new Guerrier("ragnar", 30, 1, 16, 3, 10, 5, 3, 0);
		Guerrier rollo = new Guerrier("rollo", 30, 1, 16, 3, 10, 5, 3, 0);
		do {
		ragnar.Attack(rollo);
		System.out.println(rollo.getPV());
		
		}while(rollo.estVivant()==true);
	}

}
