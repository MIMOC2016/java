public class Cdd extends Employe implements Conge
{
 String dateFinContrat;
 String typeContrat;
 Private boolean enCong;

 
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
