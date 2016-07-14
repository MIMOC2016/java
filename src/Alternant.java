public class Alternant extends Etudiant implements Conge
{
 private boolean enCong;

//--------ATTRIBUTS CALCULPAIE--------//
 
	private float salaireVariable;
	private float salaireFixe;
	private String perpaie;
	private float salaireMensuel;

 
 public Alternant (String nom, String prenom, String dateEmbauche, String dateNaissance, String tel, String email, String ecole, String dateFinContrat, String cursus, float salaireMensuel)
 {
   super(nom,prenom,dateEmbauche,dateNaissance,tel,email,ecole,dateFinContrat,cursus);
 	 this.salaireMensuel = this.salaireFixe + this.salaireVariable;
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
