
public class Paie 
{
	 public float salaireVariable;
	 public float salaireFixe;
	 public String perpaie;
	 
	 public Paie( )
		{
			perpaie = "";
			salaireFixe = 0;
			salaireVariable = 0;
		}
	 
	 public Paie (String perpaie, float salaireFixe, float salaireVariable)
	 {
		 this.perpaie = perpaie;
		 this.salaireFixe = salaireFixe;
		 this.salaireVariable = salaireVariable;
	 }

	
	 public String ToString ()
	 {
		 return this.perpaie +" "+ this.salaireFixe +" "+ this.salaireVariable;
	 }
	 
	 
	 public Paie somme(Paie that){
			return new Paie(this.perpaie,this.salaireFixe+that.salaireFixe, 
					this.salaireVariable+that.salaireVariable);
		}
	 
	 
//-----------------------------Modifier l'objet Paie-----------------------//

	 public void setperpaie(String Pperpaie)
	 {
		this.perpaie = Pperpaie ;
	 }
	 
	 public void setsalaireFixe(float PsalaireFixe)
	 {
		this.salaireFixe = PsalaireFixe ; 
	 }
	 
	 public void setsalaireVariable(float PsalaireVariable)
	 {
		this.salaireVariable = PsalaireVariable; 
	 }

}
