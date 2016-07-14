
public class Etablissement 
{
 private int idEtab;
 private String adr;

 
 public Etablissement (int idEtab, String adr)
 {
 	 this.idEtab = idEtab;
	 this.adr = adr;
 }
 
 public String toString() {
	 return "n°Etab : " + idEtab+"\n"+
			 "Adresse : "+ adr +"\n";
 }

}
