public class Cdd extends Employe implements Conge
{
 private String dateFinContrat;
 private boolean enCong;

 public Cdd (String nom, String prenom, String dateEmbauche, String dateNaissance, String tel, String email, String dateFinContrat)
 {
	 super(nom,prenom,dateEmbauche,dateNaissance,tel,email);
 	 this.dateFinContrat = dateFinContrat;
 }
 
public String getDateFinContrat(){
   return dateFinContrat;
}
public void setDateFinContrat(String df){
 this.dateFinContrat = df;
}

public void debutConge() {
 this.enCong=true;
}

public void finConge() {
 this.enCong=false;
}

public boolean enConge() {
 return this.enCong;
}

}
