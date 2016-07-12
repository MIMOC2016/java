public class stagiaire extends etudiant
{
 float gratification;

 
 public stagiaire (float gratification)
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
