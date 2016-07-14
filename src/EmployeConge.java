public class EmployeConge extends Employe implements Conge {
	private boolean enCong=false;
	
	public EmployeConge(String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance, int tel, String email){
		super(nom,prenom,dateEmbauche,etabAffectation, dateNaissance,tel,email);
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
	/*a faire*/
	public Paie calculPaie(){
		return calculPaie();
	}

}
