
public class Cadre extends EmployeConge {

		private float salaireVariable;
		private float salaireFixe;
		private String perpaie;
		private float salaireMensuel;
		
	public Cadre(String nom, String prenom, String dateEmbauche, String dateNaissance, int tel, String email,float salaireFixe, float salaireVariable)
	{
		super(nom,prenom,dateEmbauche,dateNaissance,tel,email);
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
	
	public String toString(){
		return "n°" + idEmp+"\n"+
				nom + prenom + "né le" + dateNaissance+ "\n"+
				"tel: "+ tel + "\n"+
				"email: "+email+ "\n"+
				"date d'Embauche : " +dateEmbauche+ "\n"+
				"salaire Mensuel (Fixe + Variable) : " salaireFixe + salaireVariable +" = "+ salaireMensuel+ "\n";
	
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
