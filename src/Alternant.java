
public class Alternant extends Etudiant implements Conge
{

	private float tauxHoraire;
	private boolean enCong = false;
	private float horairemensuel = (float) 151.66;

//--------ATTRIBUTS CALCULPAIE--------//
  
	private float salaireVariable;
	private float salaireFixe;
	private float salaireMensuel;
	private String perpaie;


	public Alternant (String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance,int tel, String email, String ecole, String dateFinContrat, String cursus, float tauxHoraire){
		super(nom,prenom,dateEmbauche, etabAffectation, dateNaissance,tel,email,ecole, dateFinContrat, cursus);		
		this.tauxHoraire = tauxHoraire;
	}

	public float getSalaireFixe(){
		return salaireFixe;
	}

	public void setSalaireFixe(float salaireFixe){
		this.salaireFixe = salaireFixe;
	}
	
	public float getSalaireVariable(){
		return salaireVariable;
	}

	public void setSalaireVariable(float salaireVariable){
		this.salaireVariable = salaireVariable;
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
		  return ( enConge() ? " en congé" : "")+" "+ super.toString()+"salaire : "+salaireMensuel+"\n";
					
		}
	
	public Paie calculPaie(String perpaie, float salaireVariable)
	{	
		this.salaireFixe = tauxHoraire * horairemensuel;
		this.salaireMensuel = this.salaireFixe + this.salaireVariable;
		return new Paie();
	}
}
