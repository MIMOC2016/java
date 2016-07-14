
public abstract class Employe 
{
 private int idEmp;
 private static int cpt=0;
 private String nom;
 private String prenom;
 private String dateEmbauche;
 private String dateNaissance;
 private int tel;
 private String email;
 
 public Employe (String nom, String prenom, String dateEmbauche, String dateNaissance, int tel, String email)
  {
	 this.nom = nom;
	 this.prenom = prenom;
	 this.dateEmbauche = dateEmbauche;
	 this.dateNaissance = dateNaissance;
	 this.tel = tel;
	 this.email = email;
 	 this.idEmp = cpt++;

  }

	public String getNom(){
		return nom;
	}

	public void setNom(String nom){
		this.nom = nom;
	}
	
	public String getPrenom(){
		return prenom;
	}

	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	
	public String getDateEmbauche(){
		return dateEmbauche;
	}

	public void setDateEmbauche(String dateEmbauche){
		this.dateEmbauche = dateEmbauche;
	}
	
	public String getDateNaissance(){
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance){
		this.dateNaissance = dateNaissance;
	}
	
	public int getTel(){
		return tel;
	}

	public void setTel(int tel){
		this.tel = tel;
	}
	
	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}
		
 public String toString(){
		return "n°" + idEmp+"\n"+
				nom + prenom + "né le" + dateNaissance+ "\n"+
				"tel:"+ tel + "\n"+
				"email:"+email+ "\n"+
				"date d'Embauche" +dateEmbauche+ "\n";
	}

 public abstract Paie calculPaie();
}
