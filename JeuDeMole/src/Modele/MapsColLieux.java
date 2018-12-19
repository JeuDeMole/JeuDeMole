package Modele;

import java.util.ArrayList;

public class MapsColLieux {
	
	private static final String NOMLIEUXDEFAUT =" ";
	
	private String _nom = NOMLIEUXDEFAUT; 
	private ArrayList<Lieux> _listeLieux;
	
	private void Initialiser(){
		this._listeLieux = new ArrayList<Lieux>();
	}
	
	public MapsColLieux(){
		this.Initialiser();
	}
	
	public String getNom(){
		return(this._nom);
	}
	
	public Lieux AjouterLieux() {
		Lieux X;
		X =new Lieux();
		this._listeLieux.add(X);
		return (X);
	}

	
	//supprime TOUS les lieux 
	public final void SupprimerLieux() {
		this._listeLieux.clear();
	}
}