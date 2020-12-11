package jeBiref4;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		ArrayList<Lecteur> ListLecteur= new ArrayList<Lecteur>();
		ArrayList<Livre> listLivre= new ArrayList<Livre>();
		ArrayList<Bienfaiteur> ListBienfaiteur= new ArrayList<Bienfaiteur>();
		
		String nom, prenom, email, titre, edition;
		int id, num, date_edition;
		
		Lecteur _Lecteur = new Lecteur();
		Livre _Livre = new Livre();
		Bienfaiteur _Bienfaiteur = new Bienfaiteur();
		
		Scanner sc= new Scanner(System.in);
		while(true) {
			
			 System.out.println("Menu :\n Ajouter : 1 / Modifier : 2 / Supprimer : 3");
			 String Menu=sc.next();
			 String Options="";
			 
			 switch(Menu) {
			 		case "1": System.out.println("Ajouter Lecteur -> 11  /  Ajouter Livre-> 12   /  Ajouter Livre->13");
			 			Options= sc.next();
			 				switch(Options) {
			 					case "11":
			 						 System.out.println("Entrer le nom de lecteur");
									 nom= sc.next();
									 System.out.println("Entrer le prenom de lecteur");
									 prenom= sc.next();
									 System.out.println("Entrer le email de lecteur");
									 email= sc.next();
									 System.out.println("Entrer le numero de lecteur");
									 num= sc.nextInt();
									 _Lecteur= new Lecteur(nom, prenom, email, num);
									 Lecteur.AjouterLecteur(_Lecteur, ListLecteur);
								break;
			 						case "12":
				 						 System.out.println("Entrer le titre de livre");
										  titre= sc.next();
										 System.out.println("Entrer l'edition de livre");
										  edition= sc.next();
										 System.out.println("Entrer la date d'edition de livre");
										  date_edition= sc.nextInt();
										  _Livre = new Livre(titre, edition, date_edition);
										  Livre.ajouterLivre(_Livre, listLivre);
			 						break;
			 							case "13":
			 								System.out.println("Entrer le nom de bienfaiteur");
			 								nom= sc.next();
			 								System.out.println("Entrer le prenom de bienfaiteur");
			 								prenom= sc.next();
			 								System.out.println("Entrer le email de bienfaiteur");
			 								email= sc.next();
			 								System.out.println("Entrer le numero de bienfaiteur");
			 								num= sc.nextInt();
			 								_Bienfaiteur = new Bienfaiteur(nom, prenom, email, num);
			 								Bienfaiteur.Ajouterbienfaiteur(_Bienfaiteur, ListBienfaiteur);
			 							break;
						   }
			 		break;
			 			case "2": System.out.println("Modifier Lecteur -> 21  /  Modifier Livre-> 22   /  Modifier Livre->23");
			 				Options= sc.next();
			 				switch(Options) {
		 						case "21":
		 		  					if(ListLecteur.size()>0) {
		 		  						System.out.println("La liste des lecteur " + ListLecteur);
		 		  						System.out.println("Entrer l id quel dois modifier ");
		 		  		  				id= sc.nextInt();
		 		  						System.out.println("Entrer le nom de lecteur");
		 		  						nom= sc.next();
		 		  						System.out.println("Entrer le prenom de lecteur");
		 		  						prenom= sc.next();
		 		  						System.out.println("Entrer le email de lecteur");
		 		  						email= sc.next();
		 		  						System.out.println("Entrer le numero de lecteur");
		 		  						num= sc.nextInt();
		 		  						Lecteur.modifierLecteur(ListLecteur, nom, prenom, email, num);
		 		  						System.out.println("les Lecteur  : \n " + ListLecteur);
		 		  						}else {
		 			  						System.out.println("List des lecteurs est vide Ajouter des lecteurs");
		 			  					}
		 						break;
		 							case "22":
			 		  					if(listLivre.size()>0) {
			 		  						System.out.println("La liste des livres " + listLivre); 
			 		  						System.out.println("Entrer l id quel dois modifier ");
			 		  		  				id= sc.nextInt();
			 		  						System.out.println("Entrer le titre de livre");
			 		  						titre= sc.next();
			 		  						System.out.println("Entrer l'edition de livre");
			 		  						edition= sc.next();
			 		  						System.out.println("Entrer la date d edition de livre");
			 		  						date_edition= sc.nextInt();
			 		  						Livre.modifierLivre(listLivre, titre, edition, date_edition);
			 		  						System.out.println("les Livre  : \n " + listLivre);
		 								}else {
		 			  						System.out.println("List des livres est vide Ajouter des livres");
		 			  					}
		 							break;
		 							case "23":
			 		  					if(ListBienfaiteur.size()>0) {
			 		  						System.out.println("La liste des bienfaiteur " + ListBienfaiteur); 
			 		  						System.out.println("Entrer l id quel dois modifier ");
			 		  		  				id= sc.nextInt();
			 		  						System.out.println("Entrer le nom de bienfaiteur");
			 		  						nom= sc.next();
			 		  						System.out.println("Entrer le prenom de bienfaiteur");
			 		  						prenom= sc.next();
			 		  						System.out.println("Entrer le email de bienfaiteur");
			 		  						email= sc.next();
			 		  						System.out.println("Entrer le numero de bienfaiteur");
			 		  						num= sc.nextInt();
			 		  						Bienfaiteur.modifierBienfaiteur(ListBienfaiteur, nom, prenom, email, num);
			 		  						System.out.println("les Bienfaiteurs  : \n " + ListBienfaiteur);
		 								}else {
		 			  						System.out.println("List des Bienfaiteurs est vide Ajouter des Bienfaiteurs");
		 			  					}
										break;
		 						}
			 				break;
			 			case "3": System.out.println("Supprimer Lecteur -> 31  /  Supprimer Livre-> 32   /  Supprimer Livre->33");
			 				Options= sc.next();
			 					switch(Options) {
			 						case "31":
			 							if(ListLecteur.size()>0) {
			 				  			System.out.println("Liste des Lecteurs  : \n " + ListLecteur); 
			 				  			System.out.println("Entrer l id quel dois supprimer ");
			 				  			id= sc.nextInt();
			 				  			Lecteur.supprimerLecteur(ListLecteur, id);
			 				  			}else {
			 				  				System.out.println("Liste lecteur est vide Ajouter des lecteurs");
			 				  			}
			 						break;	
			 						case "32":
			 							if(listLivre.size()>0) {
			 				  			System.out.println("Liste des Livre  : \n " + listLivre); 
			 				  			System.out.println("Entrer l id quel dois supprimer ");
			 				  			id= sc.nextInt();
			 				  			Livre.supprimerLivre(_Livre, listLivre, id);
			 				  			}else {
			 				  				System.out.println("Liste Livre est vide Ajouter des Livre");
			 				  			}
			 						break;
			 						case "33":
			 							if(ListBienfaiteur.size()>0) {
			 				  			System.out.println("Liste des Bienfaiteur  : \n " + ListBienfaiteur); 
			 				  			System.out.println("Entrer l id quel dois supprimer ");
			 				  			id= sc.nextInt();
			 				  			Bienfaiteur.supprimerBienfaiteur(ListBienfaiteur, id);
			 				  			}else {
			 				  				System.out.println("Liste Bienfaiteur est vide Ajouter des Bienfaiteur");
			 				  			}
			 						break;
			 						default:

			 						}
			 			  default:
		}
	}
}
}
