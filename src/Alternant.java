public class Alternant extends Etudiant implements Conge
{
 private float salaire;
 private boolean enCong;

 
 public Alternant (float salaire)
 {
   super();
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
