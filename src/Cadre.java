import java.util.ArrayList;

<<<<<<< Updated upstream
public class Cadre extends EmployeConge {
 	 
		private float salaireVariable;
		private float salaireFixe;
		private String perpaie;
		private float salaireMensuel;
		
	public Cadre(String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance, int tel, String email,float salaireFixe, float salaireVariable)
	{
		super(nom,prenom,dateEmbauche,etabAffectation, dateNaissance,tel,email);
		this.salaireMensuel = this.salaireFixe + this.salaireVariable;
	}
=======
public class Cadre extends Employe implements Conge
{
 int tauxJour;
 int jourPresence;
 private boolean enCong;

>>>>>>> Stashed changes
 
	public float getSalaireVariable(){
		return salaireVariable;
	}
 
<<<<<<< Updated upstream
	public float getSalaireFixe(){
		return salaireFixe;
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
=======
	private ArrayList<Paie> paies=new ArrayList<Paie>();

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


>>>>>>> Stashed changes
}
