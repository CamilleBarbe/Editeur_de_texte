package fr.istic.m1.aco.miniediteur.v1.receiver;

public class Buffer {

	public Buffer(){}

	private StringBuffer zoneDeTexte;

	public StringBuffer getBuffer(){
		return zoneDeTexte;
	}

	public void setBuffer(StringBuffer zt){
		this.zoneDeTexte = zt;
	}

}

