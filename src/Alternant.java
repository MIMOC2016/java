public class Alternant extends Etudiant 
{
 float salaire;

 
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
}
