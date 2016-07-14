
public class Paie 
{
	 public float salaireVariable;
	 public float salaireFixe;
	 public String perpaie;
	 
	 public Paie()
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
		 return this.perpaie +" "+ (this.salaireFixe + this.salaireVariable);
	 }
	 

}
