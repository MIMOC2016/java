
import java.util.Scanner;

	public class Menu {

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
									   
									System.out.println("Ajout d'un CDD: ");
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
									System.out.print("Date Fin de Contrat : ");
									String dateFinContrat = sc.nextLine();
									System.out.print("Salaire fixe : ");
									float salaireFixe = sc.nextFloat();
									System.out.print("Salaire variable : ");
									float salaireVariable = sc.nextFloat();
										
									Cdd cd = new Cdd(nom,prenom,dateEmbauche,etabAffectation, dateNaissance, tel, email, dateFinContrat, salaireFixe, salaireVariable); 
									break;
										   
								   }
								   
								   case 3 : 
									   
								   {
									   
									System.out.println("Ajout d'un stagiaire : ");
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
									System.out.print("Ecole : ");
									String ecole = sc.nextLine(); 
									System.out.print("Cursus : ");
									String cursus = sc.nextLine();
									System.out.print("Date Fin de Contrat : ");
									String dateFinContrat = sc.nextLine();
									System.out.print("Salaire fixe : ");
									float salaireFixe = sc.nextFloat();
										
									Stagiaire Stag = new Stagiaire(nom,prenom,dateEmbauche,etabAffectation, dateNaissance, tel, email, ecole, cursus, dateFinContrat, salaireFixe); 
									break;
										   
								   }
								   
								   case 4 : 
									   
								   {
									   
									System.out.println("Ajout d'un alternant : ");
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
									System.out.print("Ecole : ");
									String ecole = sc.nextLine(); 
									System.out.print("Date Fin de Contrat : ");
									String dateFinContrat = sc.nextLine();
									System.out.print("Cursus : ");
									String cursus = sc.nextLine();
									System.out.print("Salaire fixe : ");
									float salaireFixe = sc.nextFloat();
										
									Alternant altern = new Alternant(nom,prenom,dateEmbauche, etabAffectation, dateNaissance,tel, email, ecole, dateFinContrat,cursus, salaireFixe); 
									break;
										   
								   }
								}
								
							} /*fin case 1*/
 /*------------ a completer (comment acceder a un employe avec son idEmp????) ----------*/
							case 2:
							{
								int choix = 0;		
									System.out.println("-1- Modifier les informations personnelles d'un cadre CDI");
									System.out.println("-2- Modifier les informations personnelles d'un CDD");
									System.out.println("-3- Modifier les informations personnelles d'un stagiaire");
									System.out.println("-4- Modifier les informations personnelles d'un alternant");
								choix = sc.nextInt();
								
								switch (choix)
								{
								  	case 1:
								  	{
										System.out.println("Modifier les informations personnelles d'un cadre CDI: ");
										Scanner id = new Scanner(System.in);
										System.out.println("Saisir l'identifiant du salarié : ");
										idEmp = id.nextInt();
										int c = 0;	
											System.out.println("-1- Modifier le nom");
											System.out.println("-2- Modifier le prenom");
											System.out.println("-3- Modifier la date d'embauche");
											System.out.println("-4- Modifier l'établissement d'affectation");
											System.out.println("-5- Modifier la date de naissance");
											System.out.println("-6- Modifier le tel");
											System.out.println("-7- Modifier l'Email");
											System.out.println("-8- Modifier le salaire fixe");
											System.out.println("-9- Modifier le salaire variable");
										c = sc.nextInt();
									
										switch (c)
								  			{
											case 1:
												{
												System.out.print("Modifier le nom : ");
												System.out.print("Nom : ");
												String nom = sc.nextLine();
												break;
												}
											case 2:
												{
												System.out.print("Modifier le prénom : ");
												System.out.print("Prenom : ");
												String prenom = sc.nextLine();
												break;
												}
											case 3:
												{
												System.out.print("Modifier la date d'embauche : ");
												System.out.print("Date d'embauche : ");
												String dateEmbauche = sc.nextLine();
												break;
												}
											case 4:
												{
												System.out.print("Modifier l'etablissement d'affectation : ");
												System.out.print("Etablissement d'affectation : ");
												int etabAffectation = sc.nextLine();
												break;
												}
											case 5:
												{
												System.out.print("Modifier la date de naissance : ");
												System.out.print("Date de naissance : ");
												String dateNaissance = sc.nextLine();
												break;
												}
											case 6:
												{
												System.out.print("Modifier le tel : ");
												System.out.print("Tel : ");
												int tel = sc.nextLine();
												break;
												}
											case 7:
												{
												System.out.print("Modifier l'Email : ");
												System.out.print("Email : ");
												String email = sc.nextLine();
												break;
												}
											case 8:
												{
												System.out.print("Modifier le salaire fixe : ");
												System.out.print("Salaire fixe : ");
												int salaireFixe = sc.nextLine();
												break;
												}
											case 9:
												{
												System.out.print("Modifier le salaire variable : ");
												System.out.print("Salaire variable : ");
												int salaireVariable = sc.nextLine();
												break;
												}
								  			}
								  	}
								 
								  	case 2:
								  	{
										System.out.println("Modifier les informations personnelles d'un CDD: ");
										Scanner id = new Scanner(System.in);
										System.out.println("Saisir l'identifiant du salarié : ");
										idEmp = id.nextInt();
										int c = 0;	
											System.out.println("-1- Modifier le nom");
											System.out.println("-2- Modifier le prenom");
											System.out.println("-3- Modifier la date d'embauche");
											System.out.println("-4- Modifier l'établissement d'affectation");
											System.out.println("-5- Modifier la date de naissance");
											System.out.println("-6- Modifier le tel");
											System.out.println("-7- Modifier l'Email");
											System.out.println("-8- Modifier le salaire fixe");
											System.out.println("-9- Modifier le salaire variable");
											System.out.println("-10- Modifier la date de fin de contrat");
										c = sc.nextInt();
									
										switch (c)
								  			{
											case 1:
												{
												System.out.print("Modifier le nom : ");
												System.out.print("Nom : ");
												String nom = sc.nextLine();
												break;
												}
											case 2:
												{
												System.out.print("Modifier le prénom : ");
												System.out.print("Prenom : ");
												String prenom = sc.nextLine();
												break;
												}
											case 3:
												{
												System.out.print("Modifier la date d'embauche : ");
												System.out.print("Date d'embauche : ");
												String dateEmbauche = sc.nextLine();
												break;
												}
											case 4:
												{
												System.out.print("Modifier l'etablissement d'affectation : ");
												System.out.print("Etablissement d'affectation : ");
												int etabAffectation = sc.nextLine();
												break;
												}
											case 5:
												{
												System.out.print("Modifier la date de naissance : ");
												System.out.print("Date de naissance : ");
												String dateNaissance = sc.nextLine();
												break;
												}
											case 6:
												{
												System.out.print("Modifier le tel : ");
												System.out.print("Tel : ");
												int tel = sc.nextLine();
												break;
												}
											case 7:
												{
												System.out.print("Modifier l'Email : ");
												System.out.print("Email : ");
												String email = sc.nextLine();
												break;
												}
											case 8:
												{
												System.out.print("Modifier le salaire fixe : ");
												System.out.print("Salaire fixe : ");
												int salaireFixe = sc.nextLine();
												break;
												}
											case 9:
												{
												System.out.print("Modifier le salaire variable : ");
												System.out.print("Salaire variable : ");
												int salaireVariable = sc.nextLine();
												break;
												}
											case 10:
												{
												System.out.print("Modifier la date de fin de contrat : ");
												System.out.print("La date de fin de contrat : ");
												String dateFinContrat = sc.nextLine();
												break;
												}
								  			}
								  	}
								}
								
							} /*fin case 2*/
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

