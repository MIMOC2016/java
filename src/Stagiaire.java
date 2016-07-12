public class Stagiaire extends Etudiant
{
 float gratification;

 
 public Stagiaire (float gratification)
 {
   super();
 	 this.gratification = gratification;
 }
public float getGratification(){
   return gratification;
}

public void setGratification(float g){
 this.gratification = g;
}
}
