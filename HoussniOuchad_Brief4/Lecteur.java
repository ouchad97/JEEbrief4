package jeBiref4;

import java.util.ArrayList;

public class Lecteur extends Personne {

	private static int count=1;
	private static int id;
	
	public Lecteur() {}
	public Lecteur(String nom, String prenom, String email, int num) {
		super(nom, prenom, email, num);
		// TODO Auto-generated constructor stub
		this.id=count++;
	}

	public int getId() {return id;}
	public void SetId(int Id) {this.id=Id;}
	@Override
	public String toString() {
		return "[" + this.id + "," + super.toString() + "]";
	}
	
	/* Ajout Lecteur*/
	public static void AjouterLecteur(Lecteur Lecteur, ArrayList<Lecteur> Lect ) {
		Lect.add(Lecteur);
		System.out.println("l'ajout de lecteur avec succes  :" + Lect);
	}
	
	/* Supprission Lecteur*/
	public static void supprimerLecteur(ArrayList<Lecteur> listLecteur ,int id) {
		for(int j=0;j<listLecteur.size();j++) {
			  if(id==listLecteur.get(j).getId()) {
				  listLecteur.remove(j);
				  System.out.println("Supprission de lecteur avec succes  de id =" + id); 
			  }
			  else {System.out.println("Aucun lecteur avec cette ID");}
		}
	}

	/* Modifier Lecteur*/
	public static void modifierLecteur(ArrayList<Lecteur> ListLecteur,  String Nom, String prenom, String email, int num) {
		for(int j=0;j<ListLecteur.size();j++) {
			if(id==ListLecteur.get(j).getId()) {
				ListLecteur.get(j).setNom(Nom);
				ListLecteur.get(j).setPrenom(prenom);
				ListLecteur.get(j).setEmail(email);
				ListLecteur.get(j).setNum(num);
				System.out.println("Modification de lecteur avec succes id =" + id + " et lecteur : \n" + ListLecteur.get(j).toString());
			}
			else {System.out.println("Aucun lecteur avec cette ID");}
		}
	}
}
