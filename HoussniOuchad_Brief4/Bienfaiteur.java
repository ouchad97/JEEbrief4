package jeBiref4;

import java.util.ArrayList;

public class Bienfaiteur extends Personne {

	private static int count=1;
	private static int id;
	public Bienfaiteur() {}
	
	public Bienfaiteur(String nom, String prenom, String email, int num) {
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
	
		/* Ajout Bienfaiteur*/
	public static void Ajouterbienfaiteur(Bienfaiteur Bienfaiteur, ArrayList<Bienfaiteur> Bienf ) {
		Bienf.add(Bienfaiteur);
		System.out.println("Ajouter bienfaiteur avec succes  :" + Bienf);
	}
	
	/* Supprission Bienfaiteur*/
	public static void supprimerBienfaiteur(ArrayList<Bienfaiteur> listBienfaiteur ,int id) {
		for(int j=0;j<listBienfaiteur.size();j++) {
			  if(id==listBienfaiteur.get(j).getId()) {
				  listBienfaiteur.remove(j);
				  System.out.println("supprimer bienfaiteur avec succes  de id =" + id); 
			  }
			  else {System.out.println("Aucun bienfaiteur avec cette ID");}
		}
	}

	/* Modifier Bienfaiteur*/
	public static void modifierBienfaiteur(ArrayList<Bienfaiteur> ListBienfaiteur, String Nom,String prenom,String email, int num) {
		for(int j=0;j<ListBienfaiteur.size();j++) {
			if(id==ListBienfaiteur.get(j).getId()) {
				ListBienfaiteur.get(j).setNom(Nom);
				ListBienfaiteur.get(j).setPrenom(prenom);
				ListBienfaiteur.get(j).setEmail(email);
				ListBienfaiteur.get(j).setNum(num);
				System.out.println("Modifier avec succes id =" + id + " et lecteur : \n" + ListBienfaiteur.get(j).toString());
			}
			else {System.out.println("Aucun bienfaiteur avec cette ID");}
		}
	}
}
