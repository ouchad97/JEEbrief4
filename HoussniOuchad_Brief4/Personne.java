package jeBiref4;


public class Personne{
		private String nom, prenom, email;
		private int num;
			public Personne() {}
		

			
			public Personne(String nom, String prenom, String email, int num) {
				super();
				this.nom = nom;
				this.prenom = prenom;
				this.email = email;
				this.num = num;
			}


			public String getNom() {
				return nom;
			}



			public void setNom(String nom) {
				this.nom = nom;
			}



			public String getPrenom() {
				return prenom;
			}



			public void setPrenom(String prenom) {
				this.prenom = prenom;
			}



			public String getEmail() {
				return email;
			}



			public void setEmail(String email) {
				this.email = email;
			}








			public int getNum() {
				return num;
			}



			public void setNum(int num) {
				this.num = num;
			}



			@Override
			public String toString(  ) {
					return   this.nom + "," + this.prenom + "," + this.email ;
			}

			
}


