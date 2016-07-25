import java.util.ArrayList;

public class Alternant extends Etudiant implements Conge
{

	private float salaire;
	private boolean enCong;

//--------ATTRIBUTS CALCULPAIE--------//
 
	private ArrayList<Paie> paies=new ArrayList<Paie>();
 
	private float salaireVariable;
	private float salaireFixe;
	private String perpaie;
	private boolean enCong=false;


	public Alternant (String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance,int tel, String email, String ecole, String dateFinContrat, String cursus, float salaire){
		super(nom,prenom,dateEmbauche, etabAffectation, dateNaissance,tel,email,ecole, dateFinContrat, cursus);		
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
		  return ( enConge() ? " en congé" : "")+" "+ super.toString()+"salaire : "+salaire+"\n";
					
		}
	
	public Paie calculPaie()
	{	
		return new Paie(this.perpaie,this.salaire);
	}
}
