package jeBiref4;
import java.util.ArrayList;

public class Livre {
	private static int count=1;
	private static int id, date_edition;
	private String titre, edition;
 //
	
	public Livre() {};
	public Livre(String Titre,String Edition,int Date_edition) {
		this.id=count++;
		this.titre=Titre;
		this.edition=Edition;
		this.date_edition=Date_edition;

}
	
	
	//gettersSetters
	public static int getCount() {return count;}
	public static void setCount(int count) {Livre.count = count;}
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public int getDate_edition() {return date_edition;}
	public void setDate_edition(int date_edition) {this.date_edition = date_edition;}
	public String getTitre() {return titre;}
	public void setTitre(String titre) {this.titre = titre;}
	public String getEdition() {return edition;}
	public void setEdition(String edition) {this.edition = edition;}
	
	
		@Override
	public String toString() {
		return  "["+ this.id + "," +this.titre + "," + this.edition +"," + this.date_edition+"]" ;
	}
		
	/*Ajouter livre*/
		public static void  ajouterLivre( Livre livre,ArrayList<Livre> listLivre ) {
			listLivre.add(livre);
			 System.out.println("Ajouter liver avec succes");
			 System.out.println(" livre " + listLivre);
			
		}
		
	/*Supprission*/
		public static void supprimerLivre(Livre livre,ArrayList<Livre> listLivre ,int id) {
		for(int j=0;j<listLivre.size();j++) {
			  
			  if(id==listLivre.get(j).getId()) {
				  listLivre.remove(j);
				  System.out.println("Supprimer avec succes id =" + id);
				  
			  }
			  else {
				  System.out.println("Aucun livre avec cette ID");
			  }
			  }
		}
		
	/*Modification*/
		public static void modifierLivre(ArrayList<Livre> listLiver ,String Titre,String Edition,int Date_edition) {
			for(int j=0;j<listLiver.size();j++) {
				  
				  if(id==listLiver.get(j).getId()) {
					  listLiver.get(j).setTitre(Titre);
					  listLiver.get(j).setEdition(Edition);
					  listLiver.get(j).setDate_edition(Date_edition);
					  System.out.println("Modifier avec succes id =" + id + " et livre : \n " + listLiver.get(j).toString());
				  }else {
					  System.out.println("Aucun livre avec cette ID");
				  }
				  }
			}
			  
}
