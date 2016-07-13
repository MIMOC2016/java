 


public class TestEmploye {

	public static void main(String[] args) 
	
	
	{
//--------------saisir une paie---------------------------//

		CalculPaie paiefev = new CalculPaie();
		String paie = paiefev.ToString();
		
		paiefev.modifsalaireVariable();
		String paie2 = paiefev.ToString();
		System.out.println(paie);
		//
		
}

	
}
