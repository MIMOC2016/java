public class Etudiant extends Employe
{
 private String ecole;
 private String dateFinContrat;
 private String cursus;

 
 public Etudiant (String nom, String prenom, String dateEmbauche, String dateNaissance, String tel, String email, String ecole, String dateFinContrat, String cursus)
 {
	 super(nom,prenom,dateEmbauche,dateNaissance,tel,email);
 	 this.ecole = ecole;
 	 this.dateFinContrat = dateFinContrat;
 	 this.cursus = cursus;
 }

public String getEcole(){
   return ecole;
}

public String getDateFinContrat(){
   return dateFinContrat;
}
public String getCursus(){
   return cursus;
}

public void setEcole(String e){
 this.ecole = e;
}


public void setDateFinContrat(String df){
 this.dateFinContrat = df;
}

public void setCursus(String c){
 this.cursus = c;
}

}
