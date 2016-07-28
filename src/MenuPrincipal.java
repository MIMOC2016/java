import java.util.Scanner;

import com.mysql.jdbc.Driver;

	public class MenuPrincipal 
	{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			int idEmp = 0;
			int sousmenu = 0;
			boolean quitter = false;
			
			while (!quitter) {
				
				System.out.println("Menu Principal : ");
				System.out.println("-1- Gestion des salariés ");
				System.out.println("-2- Gestion des congés ");
				System.out.println("-3- Gestion de la paie ");
				System.out.println("-4- Consultation ");
				System.out.println("-0- Quitter ");
				System.out.print("Choix : ");
				sousmenu = sc.nextInt();
				
				switch (sousmenu){
					case 1:
					{
						System.out.println("Gestion des salariés ");
						int sousmenu2 = 0;
						System.out.println("-1- Ajouter un nouveau salarié ");
						System.out.println("-2- Modifier les informations personnelles d'un salarié ");
						System.out.println("-3- Cloturer le dossier d'un salarié "); /* Comment on va faire ?? Le plus simple : calcpaie =0 */
						System.out.println("-0- Retour au menu principal ");
						System.out.print("Choix : ");
						sousmenu2 = sc.nextInt();
						
						switch (sousmenu2)
						{
							case 1:
							{
								System.out.println(" Ajouter un nouveau salarié ");
								int choix = 0;		
									System.out.println("-1- Ajouter un cadre CDI");
									System.out.println("-2- Ajouter un CDD");
									System.out.println("-3- Ajouter un stagiaire");
									System.out.println("-4- Ajouter un alternant");
									System.out.println("-0- Retour au menu principal ");					
									System.out.print("Choix : ");
								choix = sc.nextInt();
								
								switch (choix)
								{
								  case 1:
								  {
									  sc.nextLine();
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
										sc.nextLine();
										String dateNaissance = sc.nextLine();
										System.out.print("Tel : ");
										int tel = sc.nextInt();
										System.out.print("Email : ");
										sc.nextLine();
										String email = sc.nextLine();
										System.out.print("Taux journalier : ");
										float tauxJour = sc.nextFloat();
										
										
										Cadre cadr = new Cadre (idEmp, nom,prenom,dateEmbauche,etabAffectation, dateNaissance, tel, email, tauxJour); 
										System.out.println("Cadre créé");
										AjoutCadre(nom, prenom, dateEmbauche, etabAffectation, dateNaissance, tel, email, tauxJour);

										break;
								  } /* Fin ajout cadre CDI/ case 1 */ 
								  
								  case 2 :
								   {
								    sc.nextLine();
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
								    sc.nextLine();
									String dateNaissance = sc.nextLine();
									System.out.print("Tel : ");
									int tel = sc.nextInt();
									System.out.print("Email : ");
								    sc.nextLine();
									String email = sc.nextLine();
									System.out.print("Date Fin de Contrat : ");
									String dateFinContrat = sc.nextLine();
									System.out.print("Salaire fixe : ");
									float salaireFixe = sc.nextFloat();
									System.out.print("Salaire variable : ");
									float salaireVariable = sc.nextFloat();
										
									Cdd cd = new Cdd(nom,prenom,dateEmbauche,etabAffectation, dateNaissance, tel, email, dateFinContrat, salaireFixe, salaireVariable); 
									System.out.println("CDD créé");
									break;
										   
								   }
								   
								  case 3 : 					   
								   {
									sc.nextLine();
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
								    sc.nextLine();
									String dateNaissance = sc.nextLine();
									System.out.print("Tel : ");
									int tel = sc.nextInt();
									System.out.print("Email : ");
								    sc.nextLine();
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
									System.out.println("Stagiaire créé");
									break;
										   
								   }
								   
								  case 4 : 
									   
								   {
									sc.nextLine();									   
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
								    sc.nextLine();
									String dateNaissance = sc.nextLine();
									System.out.print("Tel : ");
									int tel = sc.nextInt();
									System.out.print("Email : ");
								    sc.nextLine();
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
									System.out.println("Alternant créé");
									break;
										   
								   }	
								  case 0 :
								  {
									  break;
								  }
								  default : 
								  {
									System.out.println("Choix invalide");
								  }			   
								} /*fin switch type de salarié à ajouter (switch choix) */	
								break;
						    } /*fin case 1 : ajout d'un nouveau salarié */
							
							case 2:
							{
								System.out.println("Modifier les informations personnelles d'un salarié ");
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
										int choix2 = 0;
								
										System.out.println("Quel salarié voulez vous modifier? ");
										System.out.println("-1- Choix du salarié par son identifiant");
										System.out.println("-2- Choix du salarié par son nom");
										System.out.println("-0- Retour au menu principal");
								
										choix2 = sc.nextInt();
								
										switch (choix2)
										{
											case 1:
												{
													sc.nextLine();
													System.out.print("Saisir l'identifiant du salarié: ");
													int id = sc.nextInt();
													/* FONCTION DE RECHERCHE ALLANT CHERCHER DANS UN ARRAYLIST CDI ISSUE DE LA BDD et compare l'id saisi avec tout ceux dans l'arraylist*/
													break;
												} /* fin du case 1 : par l'identifiant */
											case 2 :
												{
													System.out.print("Saisir le nom du salarié: ");
													String nomrecherche = sc.nextLine();
													/*FONCTION DE RECHERCHE ET COMPARAISON AVEC LE NOM SAISI */
													/* Si plusieurs résultats trouvé : afficher la liste des resultats + identifiant des psn */ 
													/* appeler ensuite la fonction du case 1 : modif avec la saisi de l'identifiant */ 
												}/* fin du case 2 : par le nom */ 
											case 0 :
												{
													break;
												}
											default : 
								 			 {
													System.out.println("Choix invalide");
											 }	
										} /* fin du switch(choix) comment on va retrouver le salarié (id, nom)*/ 
								
										/*on retrouve un ID de la personne au final */ 
										
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
										
										switch(c)
										{
											case 1:
											{
											sc.nextLine();
											System.out.println("Modifier le nom");
											System.out.print("Nom : ");
											String nom = sc.nextLine();
											id.setNom(nom);
											System.out.println("Modification effectuée");
											break;
											}
										case 2:
											{
											sc.nextLine();
											System.out.println("Modifier le prénom ");
											System.out.print("Prenom : ");
											String prenom = sc.nextLine();
											id.setPrenom(prenom);
											System.out.println("Modification effectuée");
											break;
											}
										case 3:
											{
											sc.nextLine();	
											System.out.println("Modifier la date d'embauche ");
											System.out.print("Date d'embauche : ");
											String dateEmbauche = sc.nextLine();
											id.setDateEmbauche(dateEmbauche);
											System.out.println("Modification effectuée");
											break;
											}
										case 4:
											{
											sc.nextLine();
											System.out.println("Modifier l'etablissement d'affectation ");
											System.out.print("Etablissement d'affectation : ");
											int etabAffectation = sc.nextInt();
											sc.nextInt();
											id.setEtabAffectation(etabAffectation);
											System.out.println("Modification effectuée");
											break;
											}
										case 5:
											{
											sc.nextLine();
											System.out.println("Modifier la date de naissance ");
											System.out.print("Date de naissance : ");
											String dateNaissance = sc.nextLine();
											id.setDateNaissance(dateNaissance);
											System.out.println("Modification effectuée");
											break;
											}
										case 6:
											{
											sc.nextLine();
											System.out.println("Modifier le tel  ");
											System.out.print("Tel : ");
											int tel = sc.nextInt();
											sc.nextLine();
											id.setTel(tel);
											System.out.println("Modification effectuée");
											break;
											}
										case 7:
											{
											sc.nextLine();
											System.out.println("Modifier l'email ");
											System.out.print("Email : ");
											String email = sc.nextLine();
											id.setEmail(email);
											System.out.println("Modification effectuée");
											break;
											}
										case 8:
											{
											sc.nextLine();
											System.out.println("Modifier le salaire fixe ");
											System.out.print("Salaire fixe : ");
											float salaireFixe = sc.nextFloat();
											sc.nextLine();
											id.setSalaireFixe(salaireFixe);
											System.out.println("Modification effectuée");

											break;
											}
										case 9:
											{
											sc.nextLine();
											System.out.println("Modifier le salaire variable ");
											System.out.print("Salaire variable : ");
											float salaireVariable = sc.nextFloat();
											sc.nextLine();
											id.setSalaireVariable(salaireVariable);
											System.out.println("Modification effectuée");
											break;
											}
										case 0:
											{
											break;
											}
										default : 
								  			{
												System.out.println("Choix invalide");
								 			}	
										}/* fin du switch(c) qu'est ce qu'on souhaite modif au CDI*/
									} /* fin du case 1 : modifier les info d'un CDI */
									
									case 2:
									{
										System.out.println("Modifier les informations personnelles d'un CDD ");
										int choix2 = 0;
								
										System.out.println("Quel salarié voulez vous modifier? ");
										System.out.println("-1- Choix du salarié par son identifiant");
										System.out.println("-2- Choix du salarié par son nom");
										System.out.println("-0- Retour au menu principal");
								
										choix2 = sc.nextInt();
								
										switch (choix2)
										{
											case 1:
												{
													sc.nextLine();
													System.out.print("Saisir l'identifiant du salarié: ");
													int id = sc.nextInt();
													/* FONCTION DE RECHERCHE ALLANT CHERCHER DANS UN ARRAYLIST CDD ISSUE DE LA BDD et compare l'id saisi avec tout ceux dans l'arraylist*/
													break;
												} /* fin du case 1 : par l'identifiant */
											case 2 :
												{
													System.out.print("Saisir le nom du salarié: ");
													String nomrecherche = sc.nextLine();
													/*FONCTION DE RECHERCHE ET COMPARAISON AVEC LE NOM SAISI */
													/* Si plusieurs résultats trouvé : afficher la liste des resultats + identifiant des psn */ 
													/* appeler ensuite la fonction du case 1 : modif avec la saisi de l'identifiant */ 
												}/* fin du case 2 : par le nom */ 
											case 0 :
												{
													break;
												}
								 		   default : 
								 			   {
													System.out.println("Choix invalide");
											   }													
										} /* fin du switch(choix) comment on va retrouver le salarié (id, nom)*/ 
								
										/*on retrouve un ID de la personne au final */ 
										
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
										
										switch(c)
										{
											case 1:
											{
											sc.nextLine();
											System.out.println("Modifier le nom");
											System.out.print("Nom : ");
											String nom = sc.nextLine();
											id.setNom(nom);
											System.out.println("Modification effectuée");
											break;
											}
										case 2:
											{
											sc.nextLine();
											System.out.println("Modifier le prénom ");
											System.out.print("Prenom : ");
											String prenom = sc.nextLine();
											id.setPrenom(prenom);
											System.out.println("Modification effectuée");
											break;
											}
										case 3:
											{
											sc.nextLine();	
											System.out.println("Modifier la date d'embauche ");
											System.out.print("Date d'embauche : ");
											String dateEmbauche = sc.nextLine();
											id.setDateEmbauche(dateEmbauche);
											System.out.println("Modification effectuée");
											break;
											}
										case 4:
											{
											sc.nextLine();
											System.out.println("Modifier l'etablissement d'affectation ");
											System.out.print("Etablissement d'affectation : ");
											int etabAffectation = sc.nextInt();
											sc.nextInt();
											id.setEtabAffectation(etabAffectation);
											System.out.println("Modification effectuée");
											break;
											}
										case 5:
											{
											sc.nextLine();
											System.out.println("Modifier la date de naissance ");
											System.out.print("Date de naissance : ");
											String dateNaissance = sc.nextLine();
											id.setDateNaissance(dateNaissance);
											System.out.println("Modification effectuée");
											break;
											}
										case 6:
											{
											sc.nextLine();
											System.out.println("Modifier le tel  ");
											System.out.print("Tel : ");
											int tel = sc.nextInt();
											sc.nextLine();
											id.setTel(tel);
											System.out.println("Modification effectuée");
											break;
											}
										case 7:
											{
											sc.nextLine();
											System.out.println("Modifier l'email ");
											System.out.print("Email : ");
											String email = sc.nextLine();
											id.setEmail(email);
											System.out.println("Modification effectuée");
											break;
											}
										case 8:
											{
											sc.nextLine();
											System.out.println("Modifier le salaire fixe ");
											System.out.print("Salaire fixe : ");
											float salaireFixe = sc.nextFloat();
											sc.nextLine();
											id.setSalaireFixe(salaireFixe);
											System.out.println("Modification effectuée");

											break;
											}
										case 9:
											{
											sc.nextLine();
											System.out.println("Modifier le salaire variable ");
											System.out.print("Salaire variable : ");
											float salaireVariable = sc.nextFloat();
											sc.nextLine();
											id.setSalaireVariable(salaireVariable);
											System.out.println("Modification effectuée");
											break;
											}
										case 0:
											{
											break;
											}
									   default : 
								 		   {
												System.out.println("Choix invalide");
								 		   }	
										}/* fin du switch(c) qu'est ce qu'on souhaite modif au CDD*/
									} /* fin du case 2 : modifier les info d'un CDD */									case 3:
									
									case 3:
									{
										System.out.println("Modifier les informations personnelles d'un stagiaire ");
										int choix2 = 0;
								
										System.out.println("Quel salarié voulez vous modifier? ");
										System.out.println("-1- Choix du salarié par son identifiant");
										System.out.println("-2- Choix du salarié par son nom");
										System.out.println("-0- Retour au menu principal");
								
										choix2 = sc.nextInt();
								
										switch (choix2)
										{
											case 1:
												{
													sc.nextLine();
													System.out.print("Saisir l'identifiant du salarié: ");
													int id = sc.nextInt();
													/* FONCTION DE RECHERCHE ALLANT CHERCHER DANS L'ARRAYLIST STAGIAIRE ISSUE DE LA BDD et compare l'id saisi avec tout ceux dans l'arraylist*/
													break;
												} /* fin du case 1 : par l'identifiant */
											case 2 :
												{
													System.out.print("Saisir le nom du salarié: ");
													String nomrecherche = sc.nextLine();
													/*FONCTION DE RECHERCHE ET COMPARAISON AVEC LE NOM SAISI */
													/* Si plusieurs résultats trouvé : afficher la liste des resultats + identifiant des psn */ 
													/* appeler ensuite la fonction du case 1 : modif avec la saisi de l'identifiant */ 
												}/* fin du case 2 : par le nom */ 
											case 0 :
												{
													break;
												}
											default : 
						      	   			    {
													System.out.println("Choix invalide");
												}	
										} /* fin du switch(choix) comment on va retrouver le salarié (id, nom)*/ 
								
										/*on retrouve un ID de la personne au final */ 
										
									    int c = 0;	
										System.out.println("-1- Modifier le nom");
										System.out.println("-2- Modifier le prenom");
										System.out.println("-3- Modifier la date d'embauche");
										System.out.println("-4- Modifier l'établissement d'affectation");
										System.out.println("-5- Modifier la date de naissance");
										System.out.println("-6- Modifier le tel");
										System.out.println("-7- Modifier l'email");
										System.out.println("-8- Modifier l'école");
										System.out.println("-9- Modifier la date de fin du contrat");
										System.out.println("-10- Modifier le cursus suivi");
										System.out.println("-11- Modifier la gratification");
										c = sc.nextInt();
										
										switch(c)
										{
											case 1:
											{
											sc.nextLine();
											System.out.println("Modifier le nom");
											System.out.print("Nom : ");
											String nom = sc.nextLine();
											id.setNom(nom);
											System.out.println("Modification effectuée");
											break;
											}
										case 2:
											{
											sc.nextLine();
											System.out.println("Modifier le prénom ");
											System.out.print("Prenom : ");
											String prenom = sc.nextLine();
											id.setPrenom(prenom);
											System.out.println("Modification effectuée");
											break;
											}
										case 3:
											{
											sc.nextLine();	
											System.out.println("Modifier la date d'embauche ");
											System.out.print("Date d'embauche : ");
											String dateEmbauche = sc.nextLine();
											id.setDateEmbauche(dateEmbauche);
											System.out.println("Modification effectuée");
											break;
											}
										case 4:
											{
											sc.nextLine();
											System.out.println("Modifier l'etablissement d'affectation ");
											System.out.print("Etablissement d'affectation : ");
											int etabAffectation = sc.nextInt();
											sc.nextInt();
											id.setEtabAffectation(etabAffectation);
											System.out.println("Modification effectuée");
											break;
											}
										case 5:
											{
											sc.nextLine();
											System.out.println("Modifier la date de naissance ");
											System.out.print("Date de naissance : ");
											String dateNaissance = sc.nextLine();
											id.setDateNaissance(dateNaissance);
											System.out.println("Modification effectuée");
											break;
											}
										case 6:
											{
											sc.nextLine();
											System.out.println("Modifier le tel  ");
											System.out.print("Tel : ");
											int tel = sc.nextInt();
											sc.nextLine();
											id.setTel(tel);
											System.out.println("Modification effectuée");
											break;
											}
										case 7:
											{
											sc.nextLine();
											System.out.println("Modifier l'email ");
											System.out.print("Email : ");
											String email = sc.nextLine();
											id.setEmail(email);
											System.out.println("Modification effectuée");
											break;
											}
										case 8:
											{
											sc.nextLine();
											System.out.println("Modifier l'école");
											System.out.print("Ecole : ");
											String ecole = sc.nextLine();
											id.setEcole(ecole);
											System.out.println("Modification effectuée");
											break;
											}
										case 9:
											{
											sc.nextLine();
											System.out.println("Modifier la date de fin du contrat ");
											System.out.print("Fin contrat : ");
											String dateFinContrat = sc.nextLine();
											id.setDateFinContrat(dateFinContrat);
											System.out.println("Modification effectuée");
											break;
											}
										case 10:
											{
											sc.nextLine();
											System.out.println("Modifier le cursus");
											System.out.print("Cursus : ");
											String cursus = sc.nextLine();
											id.setCursus(cursus);
											System.out.println("Modification effectuée");
											break;
											}
										case 11:
											{
											sc.nextLine();
											System.out.println("Modifier la gratification");
											System.out.print("Gratification : ");
											float gratification = sc.nextFloat();
											sc.nextLine();
											id.setGratification(gratification);
											System.out.println("Modification effectuée");
											break;
											}																					
										case 0:
											{
											break;
											}
										default : 
								 		   {
												System.out.println("Choix invalide");
										   }	
										}/* fin du switch(c) qu'est ce qu'on souhaite modif au stagiaire*/
									} /* fin du case 3 : modifier les info d'un stagiaire */
									
									case 4:
									{
										System.out.println("Modifier les informations personnelles d'un alternant ");
										int choix2 = 0;
								
										System.out.println("Quel salarié voulez vous modifier? ");
										System.out.println("-1- Choix du salarié par son identifiant");
										System.out.println("-2- Choix du salarié par son nom");
										System.out.println("-0- Retour au menu principal");
								
										choix2 = sc.nextInt();
								
										switch (choix2)
										{
											case 1:
												{
													sc.nextLine();
													System.out.print("Saisir l'identifiant du salarié: ");
													int id = sc.nextInt();
													/* FONCTION DE RECHERCHE ALLANT CHERCHER DANS L'ARRAYLIST STAGIAIRE ISSUE DE LA BDD et compare l'id saisi avec tout ceux dans l'arraylist*/
													break;
												} /* fin du case 1 : par l'identifiant */
											case 2 :
												{
													System.out.print("Saisir le nom du salarié: ");
													String nomrecherche = sc.nextLine();
													/*FONCTION DE RECHERCHE ET COMPARAISON AVEC LE NOM SAISI */
													/* Si plusieurs résultats trouvé : afficher la liste des resultats + identifiant des psn */ 
													/* appeler ensuite la fonction du case 1 : modif avec la saisi de l'identifiant */ 
												}/* fin du case 2 : par le nom */ 
											case 0 :
												{
													break;
												}
											default : 
								  				{
													System.out.println("Choix invalide");
								 			    }	
										} /* fin du switch(choix) comment on va retrouver le salarié (id, nom)*/ 
								
										/*on retrouve un ID de la personne au final */ 
										
									    int c = 0;	
										System.out.println("-1- Modifier le nom");
										System.out.println("-2- Modifier le prenom");
										System.out.println("-3- Modifier la date d'embauche");
										System.out.println("-4- Modifier l'établissement d'affectation");
										System.out.println("-5- Modifier la date de naissance");
										System.out.println("-6- Modifier le tel");
										System.out.println("-7- Modifier l'email");
										System.out.println("-8- Modifier l'école");
										System.out.println("-9- Modifier la date de fin du contrat");
										System.out.println("-10- Modifier le cursus suivi");
										System.out.println("-11- Modifier le salaire");
										c = sc.nextInt();
										
										switch(c)
										{
											case 1:
											{
											sc.nextLine();
											System.out.println("Modifier le nom");
											System.out.print("Nom : ");
											String nom = sc.nextLine();
											id.setNom(nom);
											System.out.println("Modification effectuée");
											break;
											}
										case 2:
											{
											sc.nextLine();
											System.out.println("Modifier le prénom ");
											System.out.print("Prenom : ");
											String prenom = sc.nextLine();
											id.setPrenom(prenom);
											System.out.println("Modification effectuée");
											break;
											}
										case 3:
											{
											sc.nextLine();	
											System.out.println("Modifier la date d'embauche ");
											System.out.print("Date d'embauche : ");
											String dateEmbauche = sc.nextLine();
											id.setDateEmbauche(dateEmbauche);
											System.out.println("Modification effectuée");
											break;
											}
										case 4:
											{
											sc.nextLine();
											System.out.println("Modifier l'etablissement d'affectation ");
											System.out.print("Etablissement d'affectation : ");
											int etabAffectation = sc.nextInt();
											sc.nextInt();
											id.setEtabAffectation(etabAffectation);
											System.out.println("Modification effectuée");
											break;
											}
										case 5:
											{
											sc.nextLine();
											System.out.println("Modifier la date de naissance ");
											System.out.print("Date de naissance : ");
											String dateNaissance = sc.nextLine();
											id.setDateNaissance(dateNaissance);
											System.out.println("Modification effectuée");
											break;
											}
										case 6:
											{
											sc.nextLine();
											System.out.println("Modifier le tel  ");
											System.out.print("Tel : ");
											int tel = sc.nextInt();
											sc.nextLine();
											id.setTel(tel);
											System.out.println("Modification effectuée");
											break;
											}
										case 7:
											{
											sc.nextLine();
											System.out.println("Modifier l'email ");
											System.out.print("Email : ");
											String email = sc.nextLine();
											id.setEmail(email);
											System.out.println("Modification effectuée");
											break;
											}
										case 8:
											{
											sc.nextLine();
											System.out.println("Modifier l'école");
											System.out.print("Ecole : ");
											String ecole = sc.nextLine();
											id.setEcole(ecole);
											System.out.println("Modification effectuée");
											break;
											}
										case 9:
											{
											sc.nextLine();
											System.out.println("Modifier la date de fin du contrat ");
											System.out.print("Fin contrat : ");
											String dateFinContrat = sc.nextLine();
											id.setDateFinContrat(dateFinContrat);
											System.out.println("Modification effectuée");
											break;
											}
										case 10:
											{
											sc.nextLine();
											System.out.println("Modifier le cursus");
											System.out.print("Cursus : ");
											String cursus = sc.nextLine();
											id.setCursus(cursus);
											System.out.println("Modification effectuée");
											break;
											}
										case 11:
											{
											sc.nextLine();
											System.out.println("Modifier le salaire");
											System.out.print("Salaire : ");
											float gratification = sc.nextFloat();
											sc.nextLine();
											id.setSalaire(salaire);
											System.out.println("Modification effectuée");
											break;
											}																					
										case 0:
											{
											break;
											}
										default : 
								  			{
											System.out.println("Choix invalide");
										    }	
										}/* fin du switch(c) qu'est ce qu'on souhaite modif à l'alternant*/
									} /* fin du case 4 : modifier les info d'un alternant */
								}	/* fin du switch(choix) type d'employé à modifier*/
							} /* Fin:  modifier les informations perso d'un salarié */
						    
						    case 3:
							{
								System.out.println("Cloturer le dossier d'un salarié ");
								int choix = 0;
								System.out.println("-1- Cloturer le dossier d'un cadre CDI");
								System.out.println("-2- Cloturer le dossier d'un CDD");
								System.out.println("-3- Cloturer le dossier d'un stagiaire");
								System.out.println("-4- Cloturer le dossier d'un alternant");
								
								choix = sc.nextInt();
								
								switch (choix)
								{
									// MOHAMMED : CHOIX COMMENT CLOTURER DOSSIER 
									
								} /* fin du switch(choix) type d'employé - cloturer le dossier */
							} /* Fin du case 3 : cloturer le dossier d'un salarié */
							
							case 0:
							{
								break;
							}
					    } /*fin case Gestion des salariés ( switch sousmenu2)*/
						break;
					}
					
					case 2:
					{
						System.out.println(" Gestion des congés ");	
						int sousmenu2 = 0;
						System.out.println("-1- Mettre une personne en congé");
						System.out.println("-2- Inscrire un retour de congé");
						System.out.println("-3- Afficher les personnes en congé ");
						System.out.println("-0- Retour au menu principal");
						System.out.print("Choix : ");
						sousmenu2 = sc.nextInt();
						
						switch (sousmenu2)
						{
							case 1:
							{
								System.out.println("Quel salarié vient de partir en congé? : ");
								int choix2 = 0;  //recherche de la personne (id)
								System.out.println("-1- Choix du salarié par son identifiant");
								System.out.println("-2- Choix du salarié par son nom");
								System.out.println("-0- Retour au menu principal");
								
								choix2 = sc.nextInt();
								
								switch (choix2)
								{
									case 1:
									{
										sc.nextLine();
										System.out.print("Saisir l'identifiant du salarié : ");
										int id = sc.nextInt();
										/* FONCTION DE RECHERCHE ALLANT CHERCHER DANS L'ARRAYLIST AVEC TOUS LES SALARIES ISSUE DE LA BDD et compare l'id saisi avec tout ceux dans l'arraylist*/
										break;
									} /* fin du case 1 : par l'identifiant */
									
									case 2 :
									{
										System.out.print("Saisir le nom du salarié : ");
										String nomrecherche = sc.nextLine();
										/*FONCTION DE RECHERCHE ET COMPARAISON AVEC LE NOM SAISI */
										/* Si plusieurs résultats trouvé : afficher la liste des resultats + identifiant des psn */ 
										/* appeler ensuite la fonction du case 1 : modif avec la saisi de l'identifiant */ 
									}/* fin du case 2 : par le nom */ 
									case 0 :
									{
										break;
									}
									default : 
								    {
									   System.out.println("Choix invalide");
								    }	
								} /* fin du switch(choix) comment on va retrouver le salarié (id, nom)*/ 
								 /*on retrouve un id de la personne au final */ 

								sc.nextLine();
								id.debutConge();
								System.out.println("Congé pris en compte");
							}/* fin du case 1 : mettre une personne en congé */
							
							case 2:
							{
								System.out.println("Quel salarié vient de revenir de congé? : ");
								int choix2 = 0;  //recherche de la personne (id)
								System.out.println("-1- Choix du salarié par son identifiant");
								System.out.println("-2- Choix du salarié par son nom");
								System.out.println("-0- Retour au menu principal");
								
								choix2 = sc.nextInt();
								
								switch (choix2)
								{
									case 1:
									{
										sc.nextLine();
										System.out.print("Saisir l'identifiant du salarié : ");
										int id = sc.nextInt();
										/* FONCTION DE RECHERCHE ALLANT CHERCHER DANS L'ARRAYLIST AVEC TOUS LES SALARIES ISSUE DE LA BDD et compare l'id saisi avec tout ceux dans l'arraylist*/
										break;
									} /* fin du case 1 : par l'identifiant */
									
									case 2 :
									{
										System.out.print("Saisir le nom du salarié  : ");
										String nomrecherche = sc.nextLine();
										/*FONCTION DE RECHERCHE ET COMPARAISON AVEC LE NOM SAISI */
										/* Si plusieurs résultats trouvé : afficher la liste des resultats + identifiant des psn */ 
										/* appeler ensuite la fonction du case 1 : modif avec la saisi de l'identifiant */ 
									}/* fin du case 2 : par le nom */ 
									case 0 :
									{
										break;
									}
									default : 
								  	{
										System.out.println("Choix invalide");
								  	}	
								} /* fin du switch(choix) comment on va retrouver le salarié (id, nom)*/ 
								 /*on retrouve un id de la personne au final */ 

								sc.nextLine();
								id.finConge();
								System.out.println("Retour pris en compte");
							}/* fin du case 2 : inscrire un retour de congé */
							
							case 3:
							{
								System.out.println("Afficher les personnes en congé");
								// RECUPERER LE GROUPE DE SALARIES : ARRAY LIST DE GROUPE 
								System.out.println(grp.employesEnConge());
							}
							
							case 0: 
							{
								break;
							}
							default : 
						   {
								System.out.println("Choix invalide");
						   }	
						} /* fin du switch(sousmenu2) gestion des congés*/
						break;
					}/*fin case 2 : Gestion des congés*/
					
					case 3:
					{
						System.out.println("Gestion de la paie ");	
						break;
					}/*fin case Gestion de la paie*/
					case 4:
					{
						System.out.println("Consultation des informations relatives au groupe ");	
						int sousmenu2 = 0;
						// Retrouver dans la BDD l'arraylist correspondant au groupe
						System.out.println("-1- Afficher le nombre de salariés");
						System.out.println("-2- Afficher la masse salariale");
						System.out.println("-3- Afficher le nombre de personnes en congé aujourd'hui");
						System.out.print("Choix : ");
						sousmenu2 = sc.nextInt();
						
						switch (sousmenu2)
						{
							case 1:
							{
								sc.nextLine();
								// recupérer l'arraylist d'employés (ds classe Groupe) --> récupérer idEmp
								int nbsalaries = idEmp+1; // car idEmp commence à 0
								System.out.println("Il y a " +nbsalaries+" dans le groupe");
							} // fin case 1 : afficher nb de salariés du groupe
							
							case 2:
							{
								// récupérer l'arraylist d'employés (ds classe Groupe)
								sc.nextLine();
								int nbconges= grp.nbemployesEnConge();
								System.out.println("Il y a "+nbconges+ " salariés du groupe en congés"); 
							}
						} /* fin du switch(sousmenu2) : consultation des info du groupe*/
						
						break;
					}/*fin case Consultation*/

					case 0: 
					{
						quitter = true;
						System.out.println("Au revoir");
						break;
					}
					default : 
					{
						System.out.println("Choix invalide");
					}
						
			} /* fin du while : gros menu */
		}
   }

	

		
			
		}




	

