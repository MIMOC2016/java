import java.util.ArrayList;


public class Groupe 
{
	private ArrayList<Employe> employes=new ArrayList<Employe>();
	private ArrayList<Cadre> Cadres=new ArrayList<Cadre>();

	
	public void ajoutEmploye(Employe E)
	{
		employes.add(E);
	}

	public void ajoutCadre(Cadre C)
	{
		Cadres.add(C);
	}

	public Paie calculPaieTotale(){
		Paie p = new Paie();
		for(Employe a : employes ){
				p= p.somme(a.calculPaie());
		}
		return p;
	}	
	
	
	
	public String toString(){
		String s = new String();
		for(Employe a : employes ){
				s= s+"\n"+a;
		}
		return s;
	}
	
	public String employesEnConge(){
		String s = new String();
		s = "En congé : ";
		for(Employe a : employes ){
			if (a instanceof Conge)
				if (((Conge) a).enConge())
					s= s+"n°"+a.idEmp +" "+ a.nom+ a.prenom +" ; ";
		}
		return s;
	}
	
	
	
	
}
