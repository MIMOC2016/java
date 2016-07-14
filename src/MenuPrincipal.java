import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int idEmp = 0;
		int sousmenu = 0;
		boolean quitter = false;
		
		while (!quitter) {
			
			System.out.println("Menu Principal :  choix : ");
			System.out.println("-1- Gestion des salariés ");
			System.out.println("-2- Gestion des congés ");
			System.out.println("-3- Gestion de la paie ");
			System.out.println("-4- Consultation ");
			System.out.println("-0- Quitter ");
			sousmenu = sc.nextInt();
			
			switch (sousmenu){
				case 1:
				{
					int sousmenu2 = 0;
					System.out.println("-1- Ajouter un nouveau salarié ");
					System.out.println("-2- Modifier les informations personnelles d'un salarié ");
					System.out.println("-3- Cloturer le dossier d'un salarié "); /* Comment on va faire ?? Le plus simple : calcpaie =0 */
					System.out.println("-0- Retour au menu principal ");
					sousmenu = sc.nextInt();
					switch (sousmenu2)
					{
						case 1:
						{
							int choix = 0;		
								System.out.println("-1- Ajouter un cadre CDI");
								System.out.println("-2- Ajouter un CDD");
								System.out.println("-3- Ajouter un stagiaire");
								System.out.println("-4- Ajouter un alternant");
							choix = sc.nextInt();
							
							switch (choix)
							{
							  case 1:
							  {
								System.out.println("Ajout d'un cadre: ");
								System.out.print("Nom : ");
								String nom = sc.nextLine();
								System.out.print("Prenom : ");
								String prenom = sc.nextLine();
								System.out.print("Date Embauche : ");
								String dateEmbauche = sc.nextLine();
								System.out.print("Etablissement d'affectation (identifiant) : ");
								int etabAffectation = sc.nextInt();
								System.out.print("Date de naissance : ");
								String dateNaissance = sc.nextLine();
								System.out.print("Tel : ");
								int tel = sc.nextInt();
								System.out.print(" Email : ");
								String email = sc.nextLine();
								System.out.print("Salaire fixe : ");
								float salaireFixe = sc.nextFloat();
								System.out.print("Salaire variable : ");
								float salaireVariable = sc.nextFloat();
								
								Cadre cadr = new Cadre(nom,prenom,dateEmbauche,etabAffectation, dateNaissance, tel, email, salaireFixe, salaireVariable); 
								break;
							   }
							
							   case 2 :
							   {
								/* BLABLABLABLABLABLA*/
							   }
							}
						} /*fin case 1*/
						case 2: 
						{
								Scanner id = new Scanner(System.in);
								System.out.println("Saisir l'identifiant du salarié : ");
								idEmp = id.nextInt();
								
						}
						
				
					}
					

					
					
			}

		}


		}
	}
}

