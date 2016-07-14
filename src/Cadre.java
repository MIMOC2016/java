
public class Cadre extends Employe implements Conge
{
 int tauxJour;
 int jourPresence;
 private boolean enCong;
 
//--------ATTRIBUTS CALCULPAIE--------//
 
	private float salaireVariable;
	private float salaireFixe;
	private String perpaie;
	private float salaireMensuel;

 public Cadre (int tauxJour, int jourPresence, float salaireMensuel)
 {
   super();
 	 this.tauxJour = tauxJour;
 	 this.jourPresence = jourPresence;
 	 this.salaireMensuel = this.salaireFixe + this.salaireVariable;
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


//----------------------------METHODE CALCUL PAIE CADRE---------------------------//

public Paie calculPaie()
{	
	return new Paie(this.perpaie,this.salaireFixe , this.salaireVariable);
}

public float getSalaireMensuel() {
	return salaireMensuel;
}

public void setSalaireMensuel(float salaireMensuel) {
	this.salaireMensuel = salaireMensuel;
}


}
