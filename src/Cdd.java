public class Cdd extends Employe implements Conge
{
 private String dateFinContrat;
 private boolean enCong;
 
//--------ATTRIBUTS CALCULPAIE--------//
 
	private float salaireVariable;
	private float salaireFixe;
	private String perpaie;
	private float salaireMensuel;

 public Cdd (String nom, String prenom, String dateEmbauche, String dateNaissance, String tel, String email, String dateFinContrat,float salaireMensuel)
{
	 super(nom,prenom,dateEmbauche,dateNaissance,tel,email);
	 this.dateFinContrat = dateFinContrat;
	 this.salaireMensuel = this.salaireFixe + this.salaireVariable;

 }
 
public String getDateFinContrat(){
   return dateFinContrat;
}
public void setDateFinContrat(String df){
 this.dateFinContrat = df;
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
