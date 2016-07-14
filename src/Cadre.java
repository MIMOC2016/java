
public class Cadre extends EmployeConge {
	int tauxJour;
	int jourPresence;
 
	//--------ATTRIBUTS CALCULPAIE--------//
	 
		private float salaireVariable;
		private float salaireFixe;
		private String perpaie;
		private float salaireMensuel;
		
	public Cadre(String nom, String prenom, String dateEmbauche, String dateNaissance, String tel, String email,float salaireFixe, float salaireVariable)
	{
		super(nom,prenom,dateEmbauche,dateNaissance,tel,email);
		this.salaireMensuel = this.salaireFixe + this.salaireVariable;
	}
 
	public int getSalaireVariable(){
		return salaireVariable;
	}
 
	public int getSalaireFixe(){
		return salaireFixe;
	}

	public void setSalaireFixe(float salaireFixe){
		this.salaireFixe = SalaireFixe;
	}

	public void setSalaireVariable(int salaireVariable){
		this.salaireVariable = salaireVariable;
	}
	
	public String toString(){
		return "n°" + idEmp+"\n"+
				nom + prenom + "né le" + dateNaissance+ "\n"+
				"tel: "+ tel + "\n"+
				"email: "+email+ "\n"+
				"date d'Embauche : " +dateEmbauche+ "\n"+
				"taux jour : "+ tauxJour+ "jour présence : "+ jourPresence +"\n";
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
