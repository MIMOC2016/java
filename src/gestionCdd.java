import java.util.ArrayList;

public class gestionCdd 
{

		static ArrayList <Cdd> cdds = null;
	
	// création liste cdd si aucun cdd
	public gestionCdd()
	{
	if(cdds==null)
		cdds = new ArrayList<Cdd>();
	}
		
	// ajouter cadre
	public void ajoutCdd(Cdd D){
		cdds.add(D);
	}
	
	// afficher les CDD
	public String toString(){
		String s= ""; 
		for(Cdd C : cdds){
			s+=C.toString();
		}
	    return s;   
	}
		
	// recherche CDD
	public Cdd rechCdd(int i){
		int j=0;
		Cdd res = null;
		while (j<cdds.size() && res == null){
			if(cdds.get(j).idEmp==i)
				res = cdds.get(j);
			j++;
		}
		return res;
	}
}



