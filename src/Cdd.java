public class Cdd extends Employe implements Conge
{
 private String dateFinContrat;
 private boolean enCong = false;
 
//--------ATTRIBUTS CALCULPAIE--------/
 
public class Cdd extends EmployeConge
{
	private String dateFinContrat;
	private float salaireVariable;
	private float salaireFixe;
	private String perpaie;
	private float salaireMensuel;

	public Cdd (String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance, int tel, String email, String dateFinContrat, float salaireFixe, float salaireVariable)
	{
		super(nom,prenom,dateEmbauche, etabAffectation, dateNaissance,tel,email);
		this.dateFinContrat = dateFinContrat;
		this.salaireFixe = salaireFixe;
		this.salaireVariable = salaireVariable;
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
		return super.toString()+"\n"+ "salaire Mensuel (Fixe: "+salaireFixe+ " + Variable : "+salaireVariable+ ") = "+ salaireMensuel+ "\n";
	
	}
	

	//----------------------------METHODE CALCUL PAIE CDD---------------------------//

	public Paie calculPaie()
	{	
		return new Paie(this.perpaie,this.salaireMensuel, this.salaireFixe , this.salaireVariable);
	}

	public float getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(float salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}


}
}
