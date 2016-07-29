	import java.util.ArrayList;

public class gestionCadre 


{
		static ArrayList <Cadre> cadres = null;
	
	// création liste cadres si aucun cadre
	public gestionCadre(){
	if(cadres==null)
		cadres = new ArrayList<Cadre>();
	}
		
	// ajouter cadre
	public void ajoutCadre(Cadre C){
		cadres.add(C);
	}
	
	// afficher les CADRES
	public String toString(){
		String s= ""; 
		for(Cadre C : cadres){
			s+=C.toString();
		}
	    return s;   
	}
		
	// recherche cadre
	public Cadre rechCadre(int i){
		int j=0;
		Cadre res = null;
		while (j<cadres.size() && res == null){
			if(cadres.get(j).idEmp==i)
				res = cadres.get(j);
			j++;
		}
		return res;
	}
}

