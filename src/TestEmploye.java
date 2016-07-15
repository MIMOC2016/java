 
import java.util.Scanner;


public class TestEmploye {

	public static void main(String[] args) 
	
	
	{
		
		Scanner sc = new Scanner(System.in);

//--------------saisir une paie---------------------------//
		Paie paiefev = new Paie("2016/02", 1000, 200);
		String paie = paiefev.ToString();
		System.out.println(paie);
		paiefev.setperpaie("2018/02");
		paie = paiefev.ToString();
		System.out.println(paie);

}

	
}
