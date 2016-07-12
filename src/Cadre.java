
public class Cadre extends Employe
{
 int tauxJour;
 int jourPresence
 
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
}
