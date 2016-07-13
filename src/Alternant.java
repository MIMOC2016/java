public class Alternant extends Etudiant implements Conge
{
 private float salaire;
 private boolean enCong;

 
 public Alternant (String nom, String prenom, String dateEmbauche, String dateNaissance, String tel, String email, String ecole, String dateFinContrat, String cursus, float salaire)
 {
   super(nom,prenom,dateEmbauche,dateNaissance,tel,email,ecole,dateFinContrat,cursus);
 	 this.salaire = salaire;
 }
public float getSalaire(){
   return salaire;
}

public void setSalaire(float s){
 this.salaire = s;
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

}
