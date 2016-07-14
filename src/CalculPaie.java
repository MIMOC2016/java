
public class CalculPaie 
{
 public float paie;

	private float salaireVariable;
	 private float salaireFixe;
	 private String perpaie;



 //constructeur
	
	
	public Paie calculPaie(){
		return new Paie(this.perpaie, this.salaireFixe, this.salaireVariable);
	}
	



 public void setperpaie(String Pperpaie)
 {
	this.perpaie = Pperpaie ;
 }
 
 public void setsalaireFixe(float salaireFixe)
 {
	this.salaireFixe = salaireFixe ; 
 }
 
 public void setsalaireVariable(float salaireVariable)
 {
	this.salaireVariable = salaireVariable; 
 }
 
}
