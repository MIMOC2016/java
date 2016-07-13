import java.util.Scanner;

public class CalculPaie 
{
 public float salaireVariable;
 public float salaireFixe;
 public String perpaie;
 public float paie;
 
	Scanner sc = new Scanner(System.in);


 //constructeur
 public CalculPaie ()
 {
		System.out.println("Veuillez saisir une periode de paie, format AAAA/MM : ");
		this.perpaie = sc.next();
	 
	 System.out.println("Veuillez saisir un montant pour le salaire fixe : ");
	    this.salaireFixe = sc.nextInt();

		System.out.println("Veuillez saisir un montant pour le salaire variable :  ");
	    this.salaireVariable = sc.nextInt(); 

 	 this.paie = salaireFixe + salaireVariable;
 }

 public String ToString ()
 {
	 return this.perpaie +" "+ this.paie;
 }


 
}
