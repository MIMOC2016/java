import java.util.Scanner;

public class TestEmploye {

	public static void main(String[] args) 
	
	
	{
		Scanner sc = new Scanner(System.in);

//--------------saisir une paie---------------------------//
		/*fonctionne pas
		 * 
		Paie paiefev = new Paie("2016/02", 1000, 200);
		String paie = paiefev.toString();
		System.out.println(paie);
		paiefev.setperpaie("2017/02");
		System.out.println(paie);
		*/
		
	    Cadre c1= new Cadre("Jean", "Bernard", "01/04/2010", 1, "07/01/1974", 06651420032, "jb@gmail.com", 47000, 4000);
	    Cadre c2= new Cadre("Mathieu", "Rimel", "01/07/2012", 2, "14/09/1984", 0604210547, "mr@gmail.com", 41000, 3500);
	    Cdd cdd1= new Cdd("Racha", "Iskan", "15/08/2016", 1, "05/12/1990", 0741254615, "ri@gmail.com", "01/07/2017", 28000, 1400);
	    Cdd cdd2= new Cdd("Sarah", "Tarram", "01/07/2016", 1, "07/08/1994", 0741254132, "st@gmail.com", "14/09/2017", 35000,(float) 1700.5 );
	    Alternant a1= new Alternant("Sophia", "Dephline", "09/09/2016", 2, "12/11/1997", 0666514201, "sd@gmail.com", "La Sorbonne", "14/09/2017", "ingenierie", 12000);
	    Stagiaire s1= new Stagiaire ("Alexandre", "Sylvie", "04/10/2016", 1, "04/07/1996", 0641052741, "as@gmail.com", "Paris 7 ", "17/12/2017", "Marketing",(float) 12000);
	     /*------------ afficher les info perso des salariés initiés  ----------*/
	    
	    System.out.println(c1);
	    System.out.println(c2);
	    System.out.println(cdd1);
	    System.out.println(cdd2);
	    System.out.println(a1);
	    System.out.println(s1);
	       /*------------ Changer le salaire de l'alternant  ----------*/
	    float salaire = a1.getSalaire();
	    System.out.println(salaire);
	    a1.setSalaire(2000);
	    a1.toString();
	         /*------------ Mettre le cadre c1 en congé et le faire revenir de ce dernier  ----------*/
	    c1.debutConge();
	    c1.toString();
	    c1.finConge();
	    System.out.println(c1.enConge());
	    c1.toString();
		
	}

	
}
