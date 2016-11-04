package fr.istic.m1.aco.miniediteur.v1.receiver;

public class Selection {

	private int debutSelection;
	private int finSelection;

	//construteur
	public Selection(){
		this.debutSelection = 0;
		this.finSelection = 0;
	}

	//getters
	public int getSelectionDebut(){
		return debutSelection;
	}

	public int getSelectionFin(){
		return finSelection;
	}

	//setters pour chaque (debut/fin) et pour les deux
	public void setSelectionDebut(int deb){
		this.debutSelection = deb;
	}

	public void setSelectionFin(int fin){
		this.finSelection = fin;
	}

	public void setSelection(int deb, int fin){
		setSelectionDebut(deb);
		setSelectionFin(fin);
	}

}
