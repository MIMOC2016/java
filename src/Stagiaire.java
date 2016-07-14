public class Stagiaire extends Etudiant
{
	private float gratification;
	private String perpaie;

	public Stagiaire(String nom, String prenom, String dateEmbauche, String dateNaissance, int tel, String email, String ecole, String dateFinContrat, String cursus, float gratification)
 		{
	 		super(nom,prenom,dateEmbauche,dateNaissance,tel,email,ecole, dateFinContrat, cursus);
	 		this.gratification = gratification;
 		}
 
	public float getGratification(){
		return gratification;
	}

	public void setGratification(float g){
		this.gratification = g;
	}
	
	public String toString(){
		return "n°" + idEmp+"\n"+
				nom + prenom + "né le " + dateNaissance+ "\n"+
				"tel: "+ tel + "\n"+
				"email: "+email+ "\n"+
				"date d'Embauche" +dateEmbauche+ "\n"+
				"date Fin Contrat : "+ dateFinContrat +"\n"+
				"école : "+ ecole+"\n"+
				"cursus : "+cursus+"\n"+
				"gratification : "+gratification+"\n";
		
	}
	
	//----------------------------METHODE CALCUL PAIE CADRE---------------------------//

		public Paie calculPaie()
		{	
			return new Paie(this.perpaie,this.gratification);
		}
	
}
