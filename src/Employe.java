
public abstract class Employe 
{
 private int idEmp;
 private static int cpt=0;
 private String nom;
 private String prenom;
 private String dateEmbauche;
 private String dateNaissance;
 private String tel;
 private String email;
 
 public Employe (String nom, String prenom, String dateEmbauche, String dateNaissance, String tel, String email)
 {
	 this.nom = nom;
	 this.prenom = prenom;
	 this.dateEmbauche = dateEmbauche;
	 this.dateNaissance = dateNaissance;
	 this.tel = tel;
	 this.email = email;
 	 this.idEmp = cpt++;

 }
 
 public abstract Paie calculPaie();


}
