package fr.istic.m1.aco.miniediteur.v1.receiver;

public class MoteurEditionImpl implements MoteurEdition {

	public Buffer buffer;
	public PressePapier pressePapier;
	public Selection selection;


	public MoteurEditionImpl(){
		this.buffer = new Buffer();
		this.pressePapier = new PressePapier();
		this.selection = new Selection();
	}


	public void couper(){
		//La s�lection s'appelle selection (Selection = nom objet)
		int debut = selection.getSelectionDebut();
		int fin = selection.getSelectionFin();

		if(debut != fin){
			//prend selection, efface du Buffer, copie dans presse papier
			StringBuffer chaine = buffer.getBuffer();
			String souschaine = chaine.substring(debut, fin);

			pressePapier.setText(souschaine);

			//renvoi la chaine sans la sous chaine
			buffer.setBuffer(chaine.delete(debut,fin));
		}
	}


	public void copier(){
		int debut = selection.getSelectionDebut();
		int fin = selection.getSelectionFin();

		if(debut != fin){
			//prend selection, copie dans presse papier
			StringBuffer chaine = buffer.getBuffer();
			String souschaine = chaine.substring(debut, fin);

			pressePapier.setText(souschaine);
		}
	}

	//colle PressePapier
	public void coller(){
		int debut = selection.getSelectionDebut();
		int fin = selection.getSelectionFin();

		StringBuffer chaine = buffer.getBuffer();

		String acoller = pressePapier.getText();

		//si quelque chose est d�j� s�lectionn�
		if(debut != fin){
			//supprime selection et insere texte du pressepapier
			buffer.setBuffer(chaine.delete(debut,fin).insert(debut, acoller));
			//insererTexte()
		}
		else{
			buffer.setBuffer(chaine.insert(debut, acoller));
		}
	}


	public void selectionner(int deb, int fin){
		selection.setSelectionDebut(deb);
		selection.setSelectionFin(fin);
	}

	//insère texte en paramètre
	public void insererTexte(String txt){
		int debut = selection.getSelectionDebut();
		int fin = selection.getSelectionFin();

		/*
		if(debut != fin){
			//supprime selection et insere texte du pressepapier
			buffer.setBuffer(chaine.delete(debut,fin).insert(debut, acoller));
			//insererTexte()
		}
		else{
			buffer.setBuffer(chaine.insert(debut, acoller));
			selection.setSelectionFin(debut);
		}
		*/


		//si debut dif de fin supprime

		//insert(debut, txt);
	}


}
