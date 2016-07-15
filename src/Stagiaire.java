
public class Stagiaire extends Etudiant
{
	private float salaireFixe;
	private String perpaie;

	public Stagiaire(String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance, int tel, String email, String ecole, String dateFinContrat, String cursus, float salaireFixe)
 		{
	 		super(nom,prenom,dateEmbauche, etabAffectation, dateNaissance,tel,email,ecole, dateFinContrat, cursus);
	 		this.salaireFixe = salaireFixe;
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
				"gratification : "+salaireFixe+"\n";
		
	}
	
	//----------------------------METHODE CALCUL PAIE STAGIAIRE---------------------------//

	//le stagiaire n'a qu'un salaire fixe : c'est sa gratification
	
         public float getGratification()
         {
            return salaireFixe;
         }

         public void setGratification(float g)
         {
            this.salaireFixe = g;
         }

		public Paie calculPaie() 
		{
			return new Paie(this.perpaie, this.salaireFixe,0);
		}



}
