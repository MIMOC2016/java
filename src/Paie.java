public class Paie implements hisFicheDePaie
{
 public float salaireVariable;
 public float salaireFixe;
 public String dateDeb;
 public String dateDeb;

 //constructeur
 public Paie (String dateDeb, String dateFin, float salaireVariable, float salaireFixe)
 {
	 this.dateDeb = dateDeb;
	 this.datFin = dateFin;
 	 this.salaireVariable = salaireVariable;
 	 this.salaireFixe = salaireFixe;
 }

 //calcul de la paie
 public float somme (float salaireVariable, float salaireFixe)
 {
	return paie = this.salaireVariable + this.salaireFixe;
 }
 
 
}
