

public class Cdd extends Employe implements Conge
{
 private String dateFinContrat;
 private boolean enCong = false;
 
//--------ATTRIBUTS CALCULPAIE--------/
 
	private float salaireVariable;
	private float salaireFixe;
	private String perpaie;
	private float salaireMensuel;

	public Cdd (String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance, int tel, String email, String dateFinContrat, float salaireFixe, float salaireVariable)
	{
		super(nom,prenom,dateEmbauche, etabAffectation, dateNaissance,tel,email);
		this.dateFinContrat = dateFinContrat;
		this.salaireMensuel = this.salaireFixe + this.salaireVariable;
	}
 
	public float getSalaireVariable(){
		return salaireVariable;
	}
 
	public float getSalaireFixe(){
		return salaireFixe;
	}

	public void setSalaireFixe(float salaireFixe){
		this.salaireFixe = salaireFixe;
	}

	public void setSalaireVariable(float salaireVariable){
		this.salaireVariable = salaireVariable;
	}
 
	public String getDateFinContrat(){
		return dateFinContrat;
	}

	public void setDateFinContrat(String dateFinContrat){
		this.dateFinContrat = dateFinContrat;
	}

	public String toString(){
		return "n°" + idEmp+"\n"+
				nom + prenom + "né le" + dateNaissance+ "\n"+
				"tel: "+ tel + "\n"+
				"email: "+email+ "\n"+
				"date d'Embauche : " +dateEmbauche+ "\n"+
				"salaire Mensuel (Fixe + Variable) : "+ salaireFixe + salaireVariable +" = "+ salaireMensuel+ "\n";
	
	}
	

	//----------------------------METHODE CALCUL PAIE CDD---------------------------//

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

	//Mettre un employé en congé
	public void debutConge() {
      this.enCong = true;		
	}

	//Sortir un employé de congé
	public void finConge() {
      this.enCong = false;		
	}

	//Savoir qui sont les employés en congés
	public boolean enConge() {
		return this.enCong;
	}


}
