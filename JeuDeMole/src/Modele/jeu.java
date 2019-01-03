package MiniJeu;
import java.io.*;

public class jeu {
	static int gagne = 1;
	static int perdu = 1;
	static int nbLancer = 0;
	static int point = 0;
	
	
	public static void main (String [] args) throws IOException{
	boolean ok, rejouer;
	
	do 
	{
		ok = true;
		
		do 
		{
			if (Jeu() != 2)
				ok = false;
	System.out.println("Nombre de lancé : " + (nbLancer));
//	if (nbLancer == 1)
	System.out.println("Partie gagnée : " + (perdu==0?"0": (double) ((double) nbLancer - (double) perdu /* + (double) gagne*/)));
	System.out.println("Partie perdue : " + (gagne==0?"0": (double) ((double) nbLancer - (double) gagne /* + (double) perdu*/))); 
		} while (ok == true);
	
		
	
	
	rejouer = getRejouer();
	
	}while (rejouer == true);
	
	
}

	static boolean getRejouer() throws IOException{
		
		char valeur = 0;
		boolean ok = true;
		
			do{
				System.out.println("Souhaitez-vous rejouer ? (o/n) : ");
				valeur = (new BufferedReader(new InputStreamReader(System.in)).readLine()).charAt(0);
			
				if (valeur == 'o' || valeur == 'O' || valeur == 'y' || valeur == 'Y')
					return true;
				else if (valeur == 'n' || valeur == 'N')
			    	return false;
				else System.out.println("Souhaitez-vous rejouer ? (o/n) : ");
					return false;
			}while (ok == false);
					
	}
	
	
	static int Jeu(){
		int d1, d2;
		
		System.out.println("Veuillez lancer les deux dés : ");
		d1 = (int)(Math.random() * 5 + 1);
		d2 = (int)(Math.random() * 5 + 1);
		nbLancer++;
		
		if ((d1 + d2) == 2 || (d1 + d2) == 3 || (d1 + d2) == 12)
		{
			System.out.println("Jeté : " + d1 + " + " + d2 + " = " + (d1 + d2) + " ---> Perdu");
			perdu++;
			System.out.println("YOLO");
			point = 0;
			return 0;
		}
		else if ((d1 + d2) == 7 || (d1 + d2) == 11 /* || (d1 + d2) == point*/)
		{
			System.out.println("Jeté : " + d1 + " + " + d2 + " = " + (d1 + d2) + " ---> Gagné");
			gagne++;
			System.out.println("YOLO");
			point = 0;
			return 1;
			
		}
		else if (point == 0)
		{
			point = (d1 + d2);
			System.out.println("Jeté : " + d1 + " + " + d2 + " = " + (d1 + d2) + " ---> Recommence");
			System.out.println("YOLO");
			return 2;
		}
		return 2;
	}
	
	/*static void Afficher(String s){
		System.out.println("Nombre de lancé : " + (nbLancer));
		System.out.println("Partie gagnée : " + (perdu==0?"0": (double) ((double) nbLancer/(double) gagne)));
		System.out.println("Partie perdue : " + (gagne==0?"0": (double) ((double) nbLancer/(double) perdu)));
	}*/
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	