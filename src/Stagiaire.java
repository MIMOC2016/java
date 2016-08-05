
public class Stagiaire extends EtudiantConge
{
	private float salaireFixe;
	private String perpaie;
	private float salaireMensuel;

	public Stagiaire(String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance, int tel, String email, String ecole, String dateFinContrat, String cursus, float salaireFixe)
 		{
	 		super(nom,prenom,dateEmbauche, etabAffectation, dateNaissance,tel,email,ecole, dateFinContrat, cursus);
	 		this.salaireFixe = salaireFixe;
 		}
 

	
	public String toString(){
		return super.toString()+ "gratification : "+this.salaireFixe+"\n";
	}
	
	//----------------------------METHODE CALCUL PAIE STAGIAIRE---------------------------//

	//le stagiaire n'a qu'un salaire fixe : c'est sa gratification
	
         public float getSalaireFixe()
         {
            return salaireFixe;
         }

         public void setSalaireFixe(float g)
         {
            this.salaireFixe = g;
         }

		public Paie calculPaie(int idEmp, String perpaie, float salaireFixe) 
		{
			return new Paie(this.idEmp,this.perpaie, this.salaireMensuel = this.salaireFixe, 0, 0);
		}



		

}
