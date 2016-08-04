import java.util.ArrayList;

public class gestionAlternant  
{

		static ArrayList <Alternant> alternants = null;
	
	// création liste alternants si aucun alternant
	public gestionAlternant()
	{
	if(alternants==null)
		alternants = new ArrayList<Alternant>();
	}
		
	// ajouter alternant
	public void ajoutAlternant(Alternant altern){
		alternants.add(altern);
	}
	
	// afficher les alternants
	public String toString(){
		String s= ""; 
		for(Alternant C : alternants){
			s+=C.toString();
		}
	    return s;   
	}
		
	// recherche alternant
	public Alternant rechAlternant(int i){
		int j=0;
		Alternant res = null;
		while (j<alternants.size() && res == null){
			if(alternants.get(j).idEmp==i)
				res = alternants.get(j);
			j++;
		}
		return res;
	}


}



