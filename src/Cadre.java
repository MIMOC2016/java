
public class Cadre extends EmployeConge {
 	 
		private float salaireVariable;
		private float salaireFixe;
		private String perpaie;
		private float salaireMensuel;
		
	public Cadre(String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance, int tel, String email,float salaireFixe, float salaireVariable)
	{
		super(nom,prenom,dateEmbauche,etabAffectation, dateNaissance,tel,email);
		this.salaireFixe = salaireFixe;
		this.salaireVariable = salaireVariable;
		this.salaireMensuel = this.salaireFixe + this.salaireVariable;
	}
 
	public double getSalaireVariable(){
		return salaireVariable;
	}
 
	public double getSalaireFixe(){
		return salaireFixe;
	}

	public void setSalaireFixe(float salaireFixe){
		this.salaireFixe = salaireFixe;
	}

	public void setSalaireVariable(float salaireVariable){
		this.salaireVariable = salaireVariable;
	}
	
	public String toString(){
		return super.toString()+"\n"+
				"salaire Mensuel (Fixe: "+salaireFixe+ " + Variable : "+salaireVariable+ ") = "+ salaireMensuel+ "\n";
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
