
public class Cadre extends EmployeConge {

	private float salaireVariable;
	private float salaireFixe;
	private float salaireMensuel;
	private String perpaie;
	float tauxJour;
	int jourPresence;

	public Cadre(String nom, String prenom, String dateEmbauche, int etabAffectation, String dateNaissance, int tel,
			String email, float tauxJour, float salaireVariable) {
		super(nom, prenom, dateEmbauche, etabAffectation, dateNaissance, tel, email);
		this.tauxJour = tauxJour;
		this.salaireVariable= salaireVariable;
	}

	// ---------------------------------------METHODES PAIE------------------------------------------//

	public String toString() {
		return super.toString() + "\n" + "Période de paie : " + perpaie + "salaire Mensuel (Fixe: " + salaireFixe
				+ " + Variable : " + salaireVariable + ") = " + salaireMensuel + "\n";

	}

	public Paie calculPaie(int idEmp, String perpaie, int jourPresence, float tauxJour, float salaireVaribale) {
		this.idEmp = idEmp;
		this.salaireVariable = salaireVariable;
		this.salaireFixe = tauxJour * jourPresence;
		this.salaireMensuel = this.salaireFixe + this.salaireVariable;

		return new Paie(this.idEmp, this.perpaie, this.salaireMensuel, this.salaireFixe, this.salaireVariable);
	}

	public float getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(float salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

	public float getSalaireFixe() {
		return salaireFixe;
	}

	public void setSalaireFixe(float salaireFixe) {
		this.salaireFixe = salaireFixe;
	}

	public float getSalaireVariable() {
		return salaireVariable;
	}

	public void setSalaireVariable(float SalaireVariable) {
		this.salaireVariable = SalaireVariable;
	}

	public float getTauxJour() {
		return tauxJour;
	}

	public float setTauxJour(float tauxJour) {
		return this.tauxJour = tauxJour;
	}

	public int getJourPresence() {
		return jourPresence;
	}

	public void setJourPresence(int jp) {
		this.jourPresence = jp;
	}

}
