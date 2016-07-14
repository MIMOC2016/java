
public class Cadre extends EmployeConge {
	int tauxJour;
	int jourPresence;
 
	//--------ATTRIBUTS CALCULPAIE--------//
	 
		private float salaireVariable;
		private float salaireFixe;
		private String perpaie;
		private float salaireMensuel;
		
	public Cadre(String nom, String prenom, String dateEmbauche, String dateNaissance, String tel, String email,int tauxJour, int jourPresence)
	{
		super(nom,prenom,dateEmbauche,dateNaissance,tel,email);
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
