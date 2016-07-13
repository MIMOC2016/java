public class Etudiant extends Employe
{
 private String ecole;
 private String dateDebContrat;
 private String dateFinContrat;
 private String cursus;

 
 public Etudiant (String ecole, String dateDebContrat, String dateFinContrat, String cursus)
 {
 	 this.ecole = ecole;
 	 this.dateDebContrat = dateDebContrat;
 	 this.dateFinContrat = dateFinContrat;
 	 this.cursus = cursus;
 }

public String getEcole(){
   return ecole;
}
public String getDateDebContrat(){
   return dateDebContrat;
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

public void setDateDebContrat(String dd){
 this.dateDebContrat = dd;
}

public void setDateFinContrat(String df){
 this.dateFinContrat = df;
}

public void setCursus(String c){
 this.cursus = c;
}

}
