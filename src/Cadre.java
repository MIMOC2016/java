
public class Cadre extends Employe implements Conge
{
 int tauxJour;
 int jourPresence;
 private boolean enCong;
 
 public Cadre (int tauxJour, int jourPresence)
 {
   super();
 	 this.tauxJour = tanxJour;
 	 this.jourPresence = jourPresence;
 }
 
 public int getTauxJour(){
  return tauxJour;
 }
 
  public int getJourPresence(){
  return jourPresence;
 }
 public void setTauxJour(int tj){
   this.tauxJour = tj;
}

 public void setJourPresence(int jp){
   this.jourPresence = jp;
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
