public class Alternant extends Etudiant implements Conge
{
	private float salaire;
	private String perpaie;
	private boolean enCong=false;


	public Alternant (String nom, String prenom, String dateEmbauche, String dateNaissance,int tel, String email, String ecole, String dateFinContrat, String cursus, float salaire){
		super(nom,prenom,dateEmbauche,dateNaissance,tel,email,ecole, dateFinContrat, cursus);		
		this.salaire = salaire;
	}

	public float getSalaire(){
		return salaire;
	}

	public void setSalaire(float salaire){
		this.salaire = salaire;
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
		
	public String toString(){
		  return super.toString()+ ( enConge() ? ", en congé" : "");
					
		}
	
	public Paie calculPaie()
	{	
		return new Paie(this.perpaie,this.salaire);
	}
}
