public class Cdd extends Employe implements Conge
{
 private String dateFinContrat;
 private boolean enCong;

 
 public Cdd (String dateFinContrat)
 {
   super();
 	 this.dateFinContrat = dateFinContrat;
 	 this.typeContrat = typeContrat;
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
