 
import java.util.Scanner;


public class TestEmploye {

	public static void main(String[] args) 
	
	
	{
		
		Scanner sc = new Scanner(System.in);

//--------------saisir une paie---------------------------//
		CalculPaie paiefev = new CalculPaie("2016/02", 1000, 200);
		String paie = paiefev.toString();
		System.out.println(paie);
		paiefev.setperpaie("2017/02");
		System.out.println(paie);

}

	
}
