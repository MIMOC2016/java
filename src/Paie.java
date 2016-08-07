
public class Paie {
	public int idEmp;
	public float salaireVariable;
	public float salaireFixe;
	public float salaireMensuel;
	public float tauxJour;
	public String perpaie;

	public Paie() {
		idEmp = 0;
		perpaie = "";
		salaireFixe = 0;
		salaireVariable = 0;
		salaireMensuel = 0;
	}

	public Paie(int idEmp, String perpaie, float salaireMensuel, float salaireFixe, float salaireVariable) {
		this.idEmp = idEmp;
		this.perpaie = perpaie;
		this.salaireFixe = salaireFixe;
		this.salaireVariable = salaireVariable;
		this.salaireMensuel = salaireFixe + salaireVariable;
	}

	public String ToString() {
		return "Identifiant de l'employé : " + this.idEmp + "Période de paie : " + this.perpaie + " Salaire mensuel : "
				+ this.salaireMensuel + " Montant du salaire fixe : " + this.salaireFixe + " Part variable : "
				+ this.salaireVariable;
	}

	public Paie somme(Paie that) {
		return new Paie(this.idEmp, this.perpaie, this.salaireFixe + that.salaireFixe,
				this.salaireVariable + that.salaireVariable, this.salaireMensuel + that.salaireMensuel);
	}

	public Paie cloturePaie(Paie that) {
		return new Paie(this.idEmp, this.perpaie = "31/12/2999", this.salaireMensuel = 0, this.salaireFixe = 0,
				this.salaireVariable = 0);
	}

	// -----------------------------Modifier l'objet Paie-----------------------//

	public void setperpaie(String Pperpaie) {
		this.perpaie = Pperpaie;
	}

	public void setsalaireFixe(float salaireFixe) {
		this.salaireFixe = salaireFixe;
	}

	public void setsalaireVariable(float salaireVariable) {
		this.salaireVariable = salaireVariable;
	}

	public void setTauxJour(float tauxJour) {
		this.tauxJour = tauxJour;
	}

}
