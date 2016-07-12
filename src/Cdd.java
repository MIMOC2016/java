public class Cdd extends Employe
{
 String dateFinContrat;
 String typeContrat;

 
 public Cdd (String dateFinContrat, String typeContrat)
 {
   super();
 	 this.dateFinContrat = dateFinContrat;
 	 this.typeContrat = typeContrat;
 }
public String getDateFinContrat(){
   return dateFinContrat;
}
public String getTypeContrat(){
   return typeContrat;
}
public void setDateFinContrat(String df){
 this.dateFinContrat = df;
}

public void setTypeContrat(String tf){
 this.typeContrat = tf;
}
}
