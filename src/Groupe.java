import java.util.ArrayList;


public class Groupe {
	private ArrayList<Employe> employes=new ArrayList<Employe>();
	
	public void ajoutEmploye(Employe a){
		employes.add(a);
	}
	/*
	public CalculPaie calculPaieTotale(){
		CalculPaie p = new CalculPaie();
		for(CalculPaie p : employes ){
				p= p.somme(a.calculpaie());
		}
		return r;
	}	
	*/
	
	public String toString(){
		String s = new String();
		for(Employe a : employes ){
				s= s+"\n"+a;
		}
		return s;
	}
	
	public String employesEnConge(){
		String s = new String();
		for(Employe a : employes ){
			if (a instanceof Conge)
				if (((Conge) a).enConge())
					s= s+"\n"+a;
		}
		return s;
	}
	
	
	
	
}
