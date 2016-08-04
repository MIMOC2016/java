import java.util.ArrayList;

public class gestionStagiaire 
{

		static ArrayList <Stagiaire> stagiaires = null;
	
	// création liste stagiaires si aucun stagiaire
	public gestionStagiaire()
	{
	if(stagiaires==null)
		stagiaires = new ArrayList<Stagiaire>();
	}
		
	// ajouter stagiaire
	public void ajoutStagiaire(Stagiaire S){
		stagiaires.add(S);
	}
	
	// afficher les stagiaires
	public String toString(){
		String s= ""; 
		for(Stagiaire C : stagiaires){
			s+=C.toString();
		}
	    return s;   
	}
		
	// recherche stagiaire
	public Stagiaire rechStagiaire(int i){
		int j=0;
		Stagiaire res = null;
		while (j<stagiaires.size() && res == null){
			if(stagiaires.get(j).idEmp==i)
				res = stagiaires.get(j);
			j++;
		}
		return res;
	}
}
