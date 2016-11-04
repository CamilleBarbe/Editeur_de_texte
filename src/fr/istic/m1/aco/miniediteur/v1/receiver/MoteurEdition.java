package fr.istic.m1.aco.miniediteur.v1.receiver;

public interface MoteurEdition {

	public void couper();

	public void copier();

	public void coller();

	public void selectionner(int i, int j);

	public void insererTexte(String i);


}
