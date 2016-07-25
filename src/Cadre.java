import java.util.ArrayList;

public class Cadre extends EmployeConge implements Conge{
 	 
		private float salaireVariable;
		private float salaireFixe;
		private float salaireMensuel;
		private String perpaie;
		float tauxJour;
		int jourPresence;
		private boolean enCong;
		
	public Cadre(String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance, int tel, String email,float tauxJour)
	{
		super(nom,prenom,dateEmbauche,etabAffectation, dateNaissance,tel,email);
		this.tauxJour = tauxJour;
	}
 
//--------------METHODES PAIE-------------------------//
	
	public float getSalaireFixe(){
		return salaireFixe;
	}

 
	public float getSalaireVariable(){
		return this.salaireVariable;
	}
 
	
	public void setSalaireFixe(float salaireFixe){
		this.salaireFixe = salaireFixe;
	}

	public void setSalaireVariable(float salaireVariable){
		this.salaireVariable = salaireVariable;
	}
	
	public String toString(){
		return "n°" + idEmp+"\n"+
				nom + prenom + "né le" + dateNaissance+ "\n"+
				"tel: "+ tel + "\n"+
				"email: "+email+ "\n"+
				"date d'Embauche : " +dateEmbauche+ "\n"+
				"salaire Mensuel (Fixe + Variable) : "+ salaireFixe + salaireVariable +" = "+ salaireMensuel+ "\n";
	
	}
	

	public Paie calculPaie()
	{	
		return new Paie(this.perpaie,this.salaireMensuel = tauxJour * jourPresence,this.salaireFixe , this.salaireVariable);
	}

	public float getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(float salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

	public float calculPaie (int tauxJour, int jourPresence, float salaireVariable)
 {
 	 this.tauxJour = tauxJour;
 	 this.jourPresence = jourPresence;
 	 this.salaireFixe = this.tauxJour * this.jourPresence;
 	 this.salaireMensuel = this.salaireFixe + this.salaireVariable;
	 return this.salaireMensuel;
 }
 
 public float getTauxJour(){
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

