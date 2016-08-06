import java.util.Scanner;

public class MenuPrincipal {
	public static void main(String[] args) {
		Groupe employes = new Groupe();

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

			switch (sousmenu) {
			case 1: {
				System.out.println("Gestion des salariés ");
				int sousmenu2 = 0;
				System.out.println("-1- Ajouter un nouveau salarié ");
				System.out.println("-2- Modifier les informations personnelles d'un salarié ");
				System.out.println("-3- Cloturer le dossier d'un salarié ");
				System.out.println("-0- Retour au menu principal ");
				System.out.print("Choix : ");
				sousmenu2 = sc.nextInt();

				switch (sousmenu2) {
				case 1: {
					System.out.println(" Ajouter un nouveau salarié ");
					int choix = 0;
					System.out.println("-1- Ajouter un cadre CDI");
					System.out.println("-2- Ajouter un CDD");
					System.out.println("-3- Ajouter un stagiaire");
					System.out.println("-4- Ajouter un alternant");
					System.out.println("-0- Retour au menu principal ");
					System.out.print("Choix : ");
					choix = sc.nextInt();

					switch (choix) {
					case 1: {
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
						sc.nextLine();
						System.out.print("SalaireVariable: ");
						float salaireVariable = sc.nextFloat();
						sc.nextLine();

						Cadre C1 = new Cadre(nom, prenom, dateEmbauche, etabAffectation, dateNaissance, tel, email,
								tauxJour, salaireVariable);
						employes.ajoutEmploye(C1);
						DriverAjout.ConnAjoutCadre(idEmp, nom, prenom, dateEmbauche, etabAffectation, dateNaissance,
								tel, email, tauxJour, salaireVariable, false, false);
						System.out.println("Cadre créé");

						break;

					} /* Fin ajout cadre CDI/ case 1 */

					case 2: {
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

						Cdd cd = new Cdd(nom, prenom, dateEmbauche, etabAffectation, dateNaissance, tel, email,
								dateFinContrat, salaireFixe, salaireVariable);
						employes.ajoutEmploye(cd);
						DriverAjout.ConnAjoutCDD(idEmp, nom, prenom, dateEmbauche, etabAffectation, dateNaissance, tel,
								email, dateFinContrat, salaireFixe, salaireVariable, false, false);
						System.out.println("CDD créé");

						break;

					}

					case 3: {
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

						Stagiaire Stag = new Stagiaire(nom, prenom, dateEmbauche, etabAffectation, dateNaissance, tel,
								email, ecole, cursus, dateFinContrat, salaireFixe);
						employes.ajoutEmploye(Stag);
						DriverAjout.ConnAjoutStagiaire(idEmp, nom, prenom, dateEmbauche, etabAffectation, dateNaissance,
								tel, email, ecole, cursus, dateFinContrat, salaireFixe, false);
						System.out.println("Stagiaire créé");

						break;

					}

					case 4:

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

						Alternant altern = new Alternant(nom, prenom, dateEmbauche, etabAffectation, dateNaissance, tel,
								email, ecole, dateFinContrat, cursus, salaireFixe);
						employes.ajoutEmploye(altern);
						DriverAjout.ConnAjoutAlternant(idEmp, nom, prenom, dateEmbauche, etabAffectation, dateNaissance,
								tel, email, ecole, dateFinContrat, cursus, salaireFixe, false, false);
						System.out.println("Alternant créé");

						break;

					}
					case 0: {
						break;
					}
					default: {
						System.out.println("Choix invalide");
					}
					} /* fin switch type de salarié à ajouter (switch choix) */
					break;
				} /* fin case 1 : ajout d'un nouveau salarié */

				case 2: {
					System.out.println("Modifier les informations personnelles d'un salarié ");
					int choix = 0;
					System.out.println("-1- Modifier les informations personnelles d'un cadre CDI");
					System.out.println("-2- Modifier les informations personnelles d'un CDD");
					System.out.println("-3- Modifier les informations personnelles d'un stagiaire");
					System.out.println("-4- Modifier les informations personnelles d'un alternant");
					System.out.println("-0- Retour");
					System.out.print("Choix : ");

					choix = sc.nextInt();

					switch (choix) {
					case 1: {
						// CDI nul qu'on va utiliser par la suite
						Cadre id = new Cadre(null, null, null, 0, null, 0, null, 0,0);

						System.out.println("Modifier les informations personnelles d'un cadre CDI: ");
						DriverLecture.afficheCadre();
						sc.nextLine();
						System.out.println("Saisir l'idEmp du Cadre");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idCadre(idrech); // Retrouve le CDI
															// dans la Bdd

						/* on retrouve un ID de la personne au final */

						int c = 0;
						System.out.println("-1- Modifier le nom");
						System.out.println("-2- Modifier le prenom");
						System.out.println("-3- Modifier la date d'embauche");
						System.out.println("-4- Modifier l'établissement d'affectation");
						System.out.println("-5- Modifier la date de naissance");
						System.out.println("-6- Modifier le tel");
						System.out.println("-7- Modifier l'Email");
						System.out.println("-8- Modifier le taux jour");
						System.out.println("-9- Modifier le salaire variable");
						System.out.println("-0- Retour");
						System.out.print("Choix : ");

						c = sc.nextInt();

						switch (c) {
						case 1: {
							sc.nextLine();
							System.out.println("Modifier le nom");
							System.out.print("Nom : ");
							String nom = sc.nextLine();
							id.setNom(nom);
							System.out.println("Modification effectuée");
							DriverModifier.idCadreNom(id.idEmp, nom);
							break;
						}
						case 2: {
							sc.nextLine();
							System.out.println("Modifier le prénom ");
							System.out.print("Prenom : ");
							String prenom = sc.nextLine();
							id.setPrenom(prenom);
							System.out.println("Modification effectuée");
							DriverModifier.idCadrePrenom(id.idEmp, prenom);
							break;
						}
						case 3: {
							sc.nextLine();
							System.out.println("Modifier la date d'embauche ");
							System.out.print("Date d'embauche : ");
							String dateEmbauche = sc.nextLine();
							id.setDateEmbauche(dateEmbauche);
							System.out.println("Modification effectuée");
							DriverModifier.idCadreEmbauche(id.idEmp, dateEmbauche);
							break;
						}
						case 4: {
							sc.nextLine();
							System.out.println("Modifier l'etablissement d'affectation ");
							System.out.print("Etablissement d'affectation : ");
							int etabAffectation = sc.nextInt();
							sc.nextInt();
							id.setEtabAffectation(etabAffectation);
							System.out.println("Modification effectuée");
							DriverModifier.idCadreEtabAffectation(id.idEmp, etabAffectation);
							break;
						}
						case 5: {
							sc.nextLine();
							System.out.println("Modifier la date de naissance ");
							System.out.print("Date de naissance : ");
							String dateNaissance = sc.nextLine();
							id.setDateNaissance(dateNaissance);
							System.out.println("Modification effectuée");
							DriverModifier.idCadreDateNaissance(id.idEmp, dateNaissance);
							break;
						}
						case 6: {
							sc.nextLine();
							System.out.println("Modifier le tel  ");
							System.out.print("Tel : ");
							int tel = sc.nextInt();
							sc.nextLine();
							id.setTel(tel);
							System.out.println("Modification effectuée");
							DriverModifier.idCadreTel(id.idEmp, tel);
							break;
						}
						case 7: {
							sc.nextLine();
							System.out.println("Modifier l'email ");
							System.out.print("Email : ");
							String email = sc.nextLine();
							id.setEmail(email);
							System.out.println("Modification effectuée");
							DriverModifier.idCadreEmail(id.idEmp, email);
							break;
						}
						case 8: {
							sc.nextLine();
							System.out.println("Modifier le taux jour ");
							System.out.print("Taux jour : ");
							float tauxJour = sc.nextFloat();
							sc.nextLine();
							id.setTauxJour(tauxJour);
							System.out.println("Modification effectuée");
							DriverModifier.idCadreTauxJour(id.idEmp, tauxJour);
							break;
						}
						case 9: {
							sc.nextLine();
							System.out.println("Modifier le salaire variable ");
							System.out.print("Salaire variable : ");
							float salaireVariable = sc.nextFloat();
							sc.nextLine();
							id.setTauxJour(salaireVariable);
							System.out.println("Modification effectuée");
							DriverModifier.idCadreTauxJour(id.idEmp, salaireVariable);
							break;
						}
						case 0: {
							break;
						}
						default: {
							System.out.println("Choix invalide");
						}

						} // Fin du Switch(c) : choix de l'info à modifier
					} /* fin du case 1 : modifier les info d'un CDI */

					case 2: {
						// CDD nul qu'on va utiliser ensuite
						Cdd id = new Cdd(null, null, null, 0, null, 0, null, null, 0, 0);

						System.out.println("Modifier les informations personnelles d'un CDD: ");
						DriverLecture.afficheCdd();
						sc.nextLine();
						System.out.println("Saisir l'idEmp du CDD");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idCDD(idrech); // Retrouve le CDD
															// dans la bdd

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
						System.out.println("-0- Retour ");
						System.out.print("Choix : ");

						c = sc.nextInt();

						switch (c) {
						case 1: {
							sc.nextLine();
							System.out.println("Modifier le nom");
							System.out.print("Nom : ");
							String nom = sc.nextLine();
							id.setNom(nom);
							DriverModifier.idCddNom(id.idEmp, nom);
							System.out.println("Modification effectuée");
							break;
						}
						case 2: {
							sc.nextLine();
							System.out.println("Modifier le prénom ");
							System.out.print("Prenom : ");
							String prenom = sc.nextLine();
							id.setPrenom(prenom);
							DriverModifier.idCddPrenom(id.idEmp, prenom);
							System.out.println("Modification effectuée");
							break;
						}
						case 3: {
							sc.nextLine();
							System.out.println("Modifier la date d'embauche ");
							System.out.print("Date d'embauche : ");
							String dateEmbauche = sc.nextLine();
							id.setDateEmbauche(dateEmbauche);
							DriverModifier.idCddEmbauche(id.idEmp, dateEmbauche);
							System.out.println("Modification effectuée");
							break;
						}
						case 4: {
							sc.nextLine();
							System.out.println("Modifier l'etablissement d'affectation ");
							System.out.print("Etablissement d'affectation : ");
							int etabAffectation = sc.nextInt();
							id.setEtabAffectation(etabAffectation);
							DriverModifier.idCddEtabAffectation(id.idEmp, etabAffectation);
							System.out.println("Modification effectuée");
							break;
						}
						case 5: {
							sc.nextLine();
							System.out.println("Modifier la date de naissance ");
							System.out.print("Date de naissance : ");
							String dateNaissance = sc.nextLine();
							id.setDateNaissance(dateNaissance);
							DriverModifier.idCddDateNaissance(id.idEmp, dateNaissance);
							System.out.println("Modification effectuée");
							break;
						}
						case 6: {
							sc.nextLine();
							System.out.println("Modifier le tel  ");
							System.out.print("Tel : ");
							int tel = sc.nextInt();
							id.setTel(tel);
							DriverModifier.idCddTel(id.idEmp, tel);
							System.out.println("Modification effectuée");
							break;
						}
						case 7: {
							sc.nextLine();
							System.out.println("Modifier l'email ");
							System.out.print("Email : ");
							String email = sc.nextLine();
							id.setEmail(email);
							DriverModifier.idCddEmail(id.idEmp, email);
							System.out.println("Modification effectuée");
							break;
						}
						case 8: {
							sc.nextLine();
							System.out.println("Modifier le salaire fixe ");
							System.out.print("Salaire fixe : ");
							float salaireFixe = sc.nextFloat();
							id.setSalaireFixe(salaireFixe);
							DriverModifier.idCddSalaireFixe(id.idEmp, salaireFixe);
							System.out.println("Modification effectuée");
							break;
						}
						case 9: {
							sc.nextLine();
							System.out.println("Modifier le salaire variable ");
							System.out.print("Salaire variable : ");
							float salaireVariable = sc.nextFloat();
							id.setSalaireVariable(salaireVariable);
							DriverModifier.idCddSalaireVariable(id.idEmp, salaireVariable);
							System.out.println("Modification effectuée");
							break;
						}
						case 0: {
							break;
						}
						default: {
							System.out.println("Choix invalide");
						}
						}/*
							 * fin du switch(c) qu'est ce qu'on souhaite modif au
							 * CDD
							 */
						break;
					} /* fin du case 2 : modifier les info d'un CDD */

					case 3: {
						// Stagiaire null créé qu'on va utiliser par la suite
						Stagiaire id = new Stagiaire(null, null, null, 0, null, 0, null, null, null, null, 0);

						System.out.println("Modifier les informations personnelles d'un stagiaire ");
						DriverLecture.afficheStagiaire();
						sc.nextLine();
						System.out.println("Saisir l'idEmp du stagiaire");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idStagiaire(idrech);

						/* on retrouve un ID de la personne au final */

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
						System.out.println("-11- Modifier le salaire fixe");
						System.out.println("-0- Retour ");
						System.out.print("Choix : ");

						c = sc.nextInt();

						switch (c) {
						case 1: {
							sc.nextLine();
							System.out.println("Modifier le nom");
							System.out.print("Nom : ");
							String nom = sc.nextLine();
							id.setNom(nom);
							DriverModifier.idStagiaireNom(id.idEmp, nom);
							System.out.println("Modification effectuée");
							break;
						}
						case 2: {
							sc.nextLine();
							System.out.println("Modifier le prénom ");
							System.out.print("Prenom : ");
							String prenom = sc.nextLine();
							id.setPrenom(prenom);
							DriverModifier.idStagiairePrenom(id.idEmp, prenom);
							System.out.println("Modification effectuée");
							break;
						}
						case 3: {
							sc.nextLine();
							System.out.println("Modifier la date d'embauche ");
							System.out.print("Date d'embauche : ");
							String dateEmbauche = sc.nextLine();
							id.setDateEmbauche(dateEmbauche);
							DriverModifier.idStagiaireEmbauche(id.idEmp, dateEmbauche);
							System.out.println("Modification effectuée");
							break;
						}
						case 4: {
							sc.nextLine();
							System.out.println("Modifier l'etablissement d'affectation ");
							System.out.print("Etablissement d'affectation : ");
							int etabAffectation = sc.nextInt();
							sc.nextInt();
							id.setEtabAffectation(etabAffectation);
							DriverModifier.idStagiaireEtabAffectation(id.idEmp, etabAffectation);
							System.out.println("Modification effectuée");
							break;
						}
						case 5: {
							sc.nextLine();
							System.out.println("Modifier la date de naissance ");
							System.out.print("Date de naissance : ");
							String dateNaissance = sc.nextLine();
							id.setDateNaissance(dateNaissance);
							DriverModifier.idStagiaireDateNaissance(id.idEmp, dateNaissance);
							System.out.println("Modification effectuée");
							break;
						}
						case 6: {
							sc.nextLine();
							System.out.println("Modifier le tel  ");
							System.out.print("Tel : ");
							int tel = sc.nextInt();
							sc.nextLine();
							id.setTel(tel);
							DriverModifier.idStagiaireTel(id.idEmp, tel);
							System.out.println("Modification effectuée");
							break;
						}
						case 7: {
							sc.nextLine();
							System.out.println("Modifier l'email ");
							System.out.print("Email : ");
							String email = sc.nextLine();
							id.setEmail(email);
							DriverModifier.idStagiaireEmail(id.idEmp, email);
							System.out.println("Modification effectuée");
							break;
						}
						case 8: {
							sc.nextLine();
							System.out.println("Modifier l'école");
							System.out.print("Ecole : ");
							String ecole = sc.nextLine();
							id.setEcole(ecole);
							DriverModifier.idStagiaireEcole(id.idEmp, ecole);
							System.out.println("Modification effectuée");
							break;
						}
						case 9: {
							sc.nextLine();
							System.out.println("Modifier la date de fin du contrat ");
							System.out.print("Fin contrat : ");
							String dateFinContrat = sc.nextLine();
							id.setDateFinContrat(dateFinContrat);
							DriverModifier.idStagiaireDateFinContrat(id.idEmp, dateFinContrat);
							System.out.println("Modification effectuée");
							break;
						}
						case 10: {
							sc.nextLine();
							System.out.println("Modifier le cursus");
							System.out.print("Cursus : ");
							String cursus = sc.nextLine();
							id.setCursus(cursus);
							DriverModifier.idStagiaireCursus(id.idEmp, cursus);
							System.out.println("Modification effectuée");
							break;
						}
						case 11: {
							sc.nextLine();
							System.out.println("Modifier la gratification");
							System.out.print("Gratification : ");
							float salaireFixe = sc.nextFloat();
							sc.nextLine();
							id.setSalaireFixe(salaireFixe);
							DriverModifier.idStagiaireSalaireFixe(id.idEmp, salaireFixe);
							System.out.println("Modification effectuée");
							break;
						}
						case 0: {
							break;
						}
						default: {
							System.out.println("Choix invalide");
						}
						}/*
							 * fin du switch(c) qu'est ce qu'on souhaite modif au
							 * stagiaire
							 */
						break;
					} /* fin du case 3 : modifier les info d'un stagiaire */

					case 4: {
						// Alternant nul qu'on va utiliser ensuite
						Alternant id = new Alternant(null, null, null, 0, null, 0, null, null, null, null, 0);

						System.out.println("Modifier les informations personnelles d'un alternant ");
						DriverLecture.afficheAlternant();
						sc.nextLine();
						System.out.println("Saisir l'idEmp de l'alternant");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idAlternant(idrech); // Retrouve
																// l'alternant
																// dans la Bdd

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
						System.out.println("-0- Retour ");
						System.out.print("Choix : ");

						c = sc.nextInt();

						switch (c) {
						case 1: {
							sc.nextLine();
							System.out.println("Modifier le nom");
							System.out.print("Nom : ");
							String nom = sc.nextLine();
							id.setNom(nom);
							DriverModifier.idAlternantNom(id.idEmp, nom);
							System.out.println("Modification effectuée");
							break;
						}
						case 2: {
							sc.nextLine();
							System.out.println("Modifier le prénom ");
							System.out.print("Prenom : ");
							String prenom = sc.nextLine();
							id.setPrenom(prenom);
							DriverModifier.idAlternantPrenom(id.idEmp, prenom);
							System.out.println("Modification effectuée");
							break;
						}
						case 3: {
							sc.nextLine();
							System.out.println("Modifier la date d'embauche ");
							System.out.print("Date d'embauche : ");
							String dateEmbauche = sc.nextLine();
							id.setDateEmbauche(dateEmbauche);
							DriverModifier.idAlternantEmbauche(id.idEmp, dateEmbauche);
							System.out.println("Modification effectuée");
							break;
						}
						case 4: {
							sc.nextLine();
							System.out.println("Modifier l'etablissement d'affectation ");
							System.out.print("Etablissement d'affectation : ");
							int etabAffectation = sc.nextInt();
							sc.nextInt();
							id.setEtabAffectation(etabAffectation);
							DriverModifier.idAlternantEtabAffectation(id.idEmp, etabAffectation);
							System.out.println("Modification effectuée");
							break;
						}
						case 5: {
							sc.nextLine();
							System.out.println("Modifier la date de naissance ");
							System.out.print("Date de naissance : ");
							String dateNaissance = sc.nextLine();
							id.setDateNaissance(dateNaissance);
							DriverModifier.idAlternantDateNaissance(id.idEmp, dateNaissance);
							System.out.println("Modification effectuée");
							break;
						}
						case 6: {
							sc.nextLine();
							System.out.println("Modifier le tel  ");
							System.out.print("Tel : ");
							int tel = sc.nextInt();
							sc.nextLine();
							id.setTel(tel);
							DriverModifier.idAlternantTel(id.idEmp, tel);
							System.out.println("Modification effectuée");
							break;
						}
						case 7: {
							sc.nextLine();
							System.out.println("Modifier l'email ");
							System.out.print("Email : ");
							String email = sc.nextLine();
							id.setEmail(email);
							DriverModifier.idAlternantEmail(id.idEmp, email);
							System.out.println("Modification effectuée");
							break;
						}
						case 8: {
							sc.nextLine();
							System.out.println("Modifier l'école");
							System.out.print("Ecole : ");
							String ecole = sc.nextLine();
							id.setEcole(ecole);
							DriverModifier.idAlternantEcole(id.idEmp, ecole);
							System.out.println("Modification effectuée");
							break;
						}
						case 9: {
							sc.nextLine();
							System.out.println("Modifier la date de fin du contrat ");
							System.out.print("Fin contrat : ");
							String dateFinContrat = sc.nextLine();
							id.setDateFinContrat(dateFinContrat);
							DriverModifier.idAlternantDateFinContrat(id.idEmp, dateFinContrat);
							System.out.println("Modification effectuée");
							break;
						}
						case 10: {
							sc.nextLine();
							System.out.println("Modifier le cursus");
							System.out.print("Cursus : ");
							String cursus = sc.nextLine();
							id.setCursus(cursus);
							DriverModifier.idAlternantCursus(id.idEmp, cursus);
							System.out.println("Modification effectuée");
							break;
						}
						case 11: {
							sc.nextLine();
							System.out.println("Modifier le salaire");
							System.out.print("Salaire : ");
							float salaireFixe = sc.nextFloat();
							sc.nextLine();
							id.setSalaireFixe(salaireFixe);
							System.out.println("Modification effectuée");
							break;
						}
						case 0: {
							break;
						}
						default: {
							System.out.println("Choix invalide");
						}
						}/*
							 * fin du switch(c) qu'est ce qu'on souhaite modif à
							 * l'alternant
							 */
						break;
					} /* fin du case 4 : modifier les info d'un alternant */
					} /* fin du switch(choix) type d'employé à modifier */
					break;
				} /* Fin: modifier les informations perso d'un salarié */

				case 3: {
					System.out.println("Clôturer le dossier d'un salarié ");
					int choix = 0;
					System.out.println("-1- Clôturer le dossier d'un cadre CDI");
					System.out.println("-2- Clôturer le dossier d'un CDD");
					System.out.println("-3- Clôturer le dossier d'un stagiaire");
					System.out.println("-4- Clôturer le dossier d'un alternant");
					System.out.println("-0- Retour ");
					System.out.print("Choix : ");

					choix = sc.nextInt();

					switch (choix) {
					case 1: {
						// CDI nul qu'on va utiliser par la suite
						Cadre id = new Cadre(null, null, null, 0, null, 0, null, 0,0);

						System.out.println("Clôturer le dossier d'un cadre CDI: ");
						DriverLecture.afficheCadre();
						sc.nextLine();
						System.out.println("Saisir l'idEmp du Cadre");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idCadre(idrech); // Retrouve le CDI
															// dans la Bdd

						id.estCloture();
						DriverModifier.idCadreCloture(idrech, true);
						System.out.println("Le dossier a été clôturé");

						break;
					}

					case 2: {
						// CDD nul qu'on va utiliser ensuite
						Cdd id = new Cdd(null, null, null, 0, null, 0, null, null, 0, 0);

						System.out.println("Clôturer le dossier d'un CDD: ");
						DriverLecture.afficheCdd();
						sc.nextLine();
						System.out.println("Saisir l'idEmp du CDD");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idCDD(idrech); // Retrouve le CDD
															// dans la bdd

						id.estCloture();
						DriverModifier.idCddCloture(idrech, true);
						System.out.println("Le dossier a été clôturé");

						break;
					}

					case 3: {
						// Stagiaire null créé qu'on va utiliser par la suite
						Stagiaire id = new Stagiaire(null, null, null, 0, null, 0, null, null, null, null, 0);

						System.out.println("Clôturer le dossier d'un stagiaire ");
						DriverLecture.afficheStagiaire();
						sc.nextLine();
						System.out.println("Saisir l'idEmp du stagiaire");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idStagiaire(idrech);

						id.estCloture();
						DriverModifier.idCddCloture(idrech, true);
						System.out.println("Le dossier a été clôturé");

						break;
					}

					case 4: {
						// Alternant nul qu'on va utiliser ensuite
						Alternant id = new Alternant(null, null, null, 0, null, 0, null, null, null, null, 0);

						System.out.println("Clôturer le dossier d'un alternant ");
						DriverLecture.afficheAlternant();
						sc.nextLine();
						System.out.println("Saisir l'idEmp de l'alternant");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idAlternant(idrech); // Retrouve
																// l'alternant
																// dans la Bdd

						id.estCloture();
						DriverModifier.idAlternantCloture(idrech, true);
						System.out.println("Le dossier a été clôturé");

						break;
					}

					case 0: {
						break;
					}

					} /*
						 * fin du switch(choix) type d'employé - cloturer le
						 * dossier
						 */
					break;
				} /* Fin du case 3 : cloturer le dossier d'un salarié */

				case 0: {
					break;
				}

				default: {
					System.out.println("Choix invalide");
				}
				} /* fin case Gestion des salariés ( switch sousmenu2) */
				break;
			}

			case 2: {
				System.out.println(" Gestion des congés ");
				int sousmenu2 = 0;
				System.out.println("-1- Mettre une personne en congé");
				System.out.println("-2- Inscrire un retour de congé");
				System.out.println("-3- Afficher les personnes en congé ");
				System.out.println("-0- Retour au menu principal");
				System.out.print("Choix : ");
				sousmenu2 = sc.nextInt();

				switch (sousmenu2) {
				case 1: {
					System.out.println("Quel salarié vient de partir en congé? : ");
					int choix = 0;
					System.out.println("-1- Mettre en congé un cadre CDI");
					System.out.println("-2- Mettre en congé un CDD");
					System.out.println("-3- Mettre en congé un alternant");
					System.out.println("-0- Retour ");
					System.out.print("Choix : ");

					choix = sc.nextInt();

					switch (choix) {
					case 1: {
						// CDI nul qu'on va utiliser par la suite
						Cadre id = new Cadre(null, null, null, 0, null, 0, null, 0,0);

						System.out.println("Mettre en congé un cadre CDI: ");
						DriverLecture.afficheCadre();
						sc.nextLine();
						System.out.println("Saisir l'idEmp du Cadre");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idCadre(idrech); // Retrouve le CDI
															// dans la Bdd

						id.debutConge();
						DriverModifier.idCadreConge(idrech, true);
						System.out.println("Congé pris en compte");

						break;
					}

					case 2: {
						// CDD nul qu'on va utiliser ensuite
						Cdd id = new Cdd(null, null, null, 0, null, 0, null, null, 0, 0);

						System.out.println("Mettre en congé un CDD: ");
						DriverLecture.afficheCdd();
						sc.nextLine();
						System.out.println("Saisir l'idEmp du CDD");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idCDD(idrech); // Retrouve le CDD
															// dans la bdd

						id.debutConge();
						DriverModifier.idCddConge(idrech, true);
						System.out.println("Congé pris en compte");

						break;
					}

					case 3: {
						// Alternant nul qu'on va utiliser ensuite
						Alternant id = new Alternant(null, null, null, 0, null, 0, null, null, null, null, 0);

						System.out.println("Mettre en congé un alternant ");
						DriverLecture.afficheAlternant();
						sc.nextLine();
						System.out.println("Saisir l'idEmp de l'alternant");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idAlternant(idrech); // Retrouve
																// l'alternant
																// dans la Bdd

						id.debutConge();
						DriverModifier.idAlternantConge(idrech, true);
						System.out.println("Congé pris en compte");

						break;
					}

					case 0: {
						break;
					}

					default: {
						System.out.println("Choix invalide");
					}
					} /*
						 * fin du switch(choix) type d'employé - mettre en congé
						 */
					break;
				} /* Fin du case 1 : Mettre en congé un salarié */

				case 2: {
					System.out.println("Quel salarié vient de revenir de congé? : ");
					int choix = 0;
					System.out.println("-1- Retour de congé d'un cadre CDI");
					System.out.println("-2- Retour de congé d'un CDD");
					System.out.println("-3- Retour de congé d'un alternant");
					System.out.println("-0- Retour ");
					System.out.print("Choix : ");

					choix = sc.nextInt();

					switch (choix) {
					case 1: {
						// CDI nul qu'on va utiliser par la suite
						Cadre id = new Cadre(null, null, null, 0, null, 0, null, 0,0);

						System.out.println("Retour de congé d'un cadre CDI: ");
						DriverLecture.afficheCadre();
						sc.nextLine();
						System.out.println("Saisir l'idEmp du Cadre");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idCadre(idrech); // Retrouve le CDI
															// dans la Bdd

						id.finConge();
						DriverModifier.idCadreConge(idrech, false);
						System.out.println("Retour pris en compte");

						break;
					}

					case 2: {
						// CDD nul qu'on va utiliser ensuite
						Cdd id = new Cdd(null, null, null, 0, null, 0, null, null, 0, 0);

						System.out.println("Retour de congé d'un CDD: ");
						DriverLecture.afficheCdd();
						sc.nextLine();
						System.out.println("Saisir l'idEmp du CDD");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idCDD(idrech); // Retrouve le CDD
															// dans la bdd

						id.finConge();
						DriverModifier.idCddConge(idrech, false);
						System.out.println("Retour pris en compte");

						break;
					}

					case 3: {
						// Alternant nul qu'on va utiliser ensuite
						Alternant id = new Alternant(null, null, null, 0, null, 0, null, null, null, null, 0);

						System.out.println("Retour de congé d'un alternant ");
						DriverLecture.afficheAlternant();
						sc.nextLine();
						System.out.println("Saisir l'idEmp de l'alternant");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idAlternant(idrech); // Retrouve
																// l'alternant
																// dans la Bdd

						id.finConge();
						DriverModifier.idAlternantConge(idrech, false);
						System.out.println("Retour pris en compte");

						break;
					}

					case 0: {
						break;
					}

					default: {
						System.out.println("Choix invalide");
					}
					} /*
						 * fin du switch(choix) type d'employé - retour de congé
						 */
					break;
				} /* Fin du case 2 : Retour de congé d'un salarié */

				case 3: {

					System.out.println("Afficher les personnes en congé");
					System.out.println(employes.employesEnConge());
				}

				case 0: {
					break;
				}
				default: {
					System.out.println("Choix invalide");
				}
				} /* fin du switch(sousmenu2) gestion des congés */
				break;
			} /* fin case 2 : Gestion des congés */

				// ----------------------------------------GESTION PAIE-----------------------------------------//
			case 3: {
				System.out.println("Gestion de la paie ");
				int sousmenu2 = 0;
				System.out.println("-1- Consulter la paie");
				System.out.println("-2- Créer un bulletin de paie");
				System.out.println("-3- Modifier un bulletin de paie");
				System.out.println("-0- Retour au menu principal ");
				System.out.print("Choix : ");
				sousmenu2 = sc.nextInt();
				switch (sousmenu2) {
				case 1: {
					System.out.println(" Consulter la paie ");
					int choix = 0;
					System.out.println("-1- Consulter la paie d'un cadre CDI");
					System.out.println("-2- Consulter la paie d'un CDD");
					System.out.println("-3- Consulter la paie d'un stagiaire");
					System.out.println("-4- Consulter la paie d'un alternant");
					System.out.println("-0- Retour au menu principal ");
					System.out.print("Choix : ");
					choix = sc.nextInt();

					switch (choix) {
					case 1: {
						// CDI nul qu'on va utiliser par la suite
						Paie paiecadre = new Paie(0, null, 0, 0, 0);
						System.out.println("Consulter la paie d'un cadre CDI ");
						//on affiche tous les cadres
						DriverLecture.afficheCadre();
						System.out.print("Id de l'employé : ");
						int idrech = sc.nextInt();
						paiecadre = DriverLecture.idPaieCadre(idrech); // Retrouve le salaire du CDI dans la BDD

						break;

					}
					case 2: {
						// CDD nul qu'on va utiliser par la suite
						Paie paieCDD = new Paie(0, null, 0, 0, 0);
						System.out.println("Consulter la paie d'un CDD ");
						sc.nextLine();
						//on affiche tous les CDD
						DriverLecture.afficheCdd();
						sc.nextLine();
						System.out.print("Id de l'employé : ");
						int idrech = sc.nextInt();
						paieCDD = DriverLecture.idPaieCDD(idrech); // Retrouve la paie du CDD dans la BDD

						break;

					}
					case 3: {
						// stagiaire nul qu'on va utiliser par la suite
						Paie paieStagiaire = new Paie(0, null, 0, 0, 0);
						System.out.println("Consulter la paie d'un stagiaire ");
						sc.nextLine();
						//on affiche tous les stagiaires
						DriverLecture.afficheStagiaire();
						sc.nextLine();
						System.out.print("Id de l'employé : ");
						int idrech = sc.nextInt();
						paieStagiaire = DriverLecture.idPaieStagiaire(idrech); // Retrouve la paie du stagiaire dans la
																				// BDD
						break;

					}
					case 4: {
						// alternant nul qu'on va utiliser par la suite
						Paie paieAlternant = new Paie(0, null, 0, 0, 0);

						System.out.println("Consulter la paie d'un alternant ");
						sc.nextLine();
						//on affiche tous les alternants
						DriverLecture.afficheAlternant();
						sc.nextLine();
						//on choisir un alternant
						System.out.print("Id de l'employé : ");
						int idrech = sc.nextInt();
						paieAlternant = DriverLecture.idPaieAlternant(idrech); // Retrouve la paie de l'alternant dans la Bdd
						
						break;

					}
					case 0: {
						break;
					}
					default: {
						System.out.println("Choix invalide");
					}
					
					}// FIN switch CONSULTER PAIE
					break;
				}
				case 2: {
					System.out.println("Créer un bulletin de paie ");
					int choix = 0;
					System.out.println("-1- Créer un bulletin de paie pour un cadre CDI");
					System.out.println("-2- Créer un bulletin de paie pour un CDD");
					System.out.println("-3- Créer un bulletin de paie pour un alternant");
					System.out.println("-3- Créer un bulletin de paie pour un stagiaire");
					System.out.println("-0- Retour ");
					System.out.print("Choix : ");

					choix = sc.nextInt();

					switch (choix) {
					case 1: {
						System.out.println("Créer un bulletin de paie d'un cadre CDI: ");
						sc.nextLine();
						// CDI nul qu'on va utiliser par la suite
						Cadre c1 = new Cadre(null, null, null, 0, null, 0, null, 0, 0);
						//on affiche tous les cadres
						DriverLecture.afficheCadre();
						Paie paieCadre = new Paie (0, null, 0, 0, 0);						
						System.out.println("Saisir l'idEmp du Cadre");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						sc.nextLine();
						System.out.println("Saisir une période de paie: ");
						String perpaie = sc.nextLine();
						System.out.println("Saisir le nombre de jour de présence: ");
						int jourPresence = sc.nextInt();
						sc.nextLine();
						System.out.println("Saisir le taux journalier à appliquer: ");
						int tauxJour = sc.nextInt();
						sc.nextLine();
						System.out.println("Saisir le montant du variable: ");
						float salaireVariable = sc.nextInt();
						sc.nextLine();
						c1.calculPaie(idrech, perpaie, jourPresence, tauxJour, salaireVariable);// on appelle la méthode pour créer une paie pour un cadre
						c1.toString();
						float salaireMensuel = c1.getSalaireMensuel();
						float salaireFixe = c1.getSalaireFixe();
						paieCadre = DriverAjout.AjoutPaieCadre(idrech,perpaie, salaireMensuel,salaireFixe,salaireVariable);// on renvoie tout à la BDD

						break;
					}
					case 2: {
						System.out.println("Créer un bulletin de paie d'un CDD: ");
						sc.nextLine();
						// CDD nul qu'on va utiliser par la suite
						Cdd c1 = new Cdd(null, null, null, 0, null, 0, null, null, 0, 0);
						//on affiche tous les cdd
						DriverLecture.afficheCdd();
						Paie paieCdd = new Paie (0, null, 0, 0, 0);						
						System.out.println("Saisir l'idEmp du Cdd");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						sc.nextLine();
						System.out.println("Saisir une période de paie: ");
						String perpaie = sc.nextLine();
						System.out.println("Saisir le nombre de jour de présence: ");
						int jourPresence = sc.nextInt();
						sc.nextLine();
						System.out.println("Saisir le taux journalier à appliquer: ");
						int tauxJour = sc.nextInt();
						sc.nextLine();
						System.out.println("Saisir le montant du variable: ");
						float salaireVariable = sc.nextInt();
						sc.nextLine();
						c1.calculPaie(idrech, perpaie, jourPresence, tauxJour, salaireVariable);// on appelle la méthode pour créer une paie pour un cdd
						c1.toString();
						float salaireMensuel = c1.getSalaireMensuel();
						float salaireFixe = c1.getSalaireFixe();
						paieCdd = DriverAjout.AjoutPaieCdd(idrech,perpaie, salaireMensuel,salaireFixe,salaireVariable);// on renvoie tout à la BDD
						break;
					}
					case 3: {
						System.out.println("Créer un bulletin de paie d'un stagiaire: ");
						sc.nextLine();
						// Stagiaire nul qu'on va utiliser par la suite
						Stagiaire c1 = new Stagiaire(null, null, null, 0, null, 0, null, null, null, null, 0);
						//on affiche tous les stagiaire
						DriverLecture.afficheStagiaire();
						Paie paieStagiaire= new Paie (0, null, 0, 0, 0);						
						System.out.println("Saisir l'idEmp du stagiaire");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						sc.nextLine();
						System.out.println("Saisir une période de paie: ");
						String perpaie = sc.nextLine();
						System.out.println("Saisir le montant de la gratification: ");
						float salaireFixe = sc.nextInt();
						sc.nextLine();
						c1.calculPaie(idrech, perpaie, salaireFixe);// on appelle la méthode pour créer une paie pour un stagiaire
						c1.toString();
						paieStagiaire = DriverAjout.AjoutPaieStagiaire(idrech,perpaie,salaireFixe);// on renvoie tout à la BDD

						break;
					}
					case 4: {
						System.out.println("Créer un bulletin de paie d'un alternant: ");
						sc.nextLine();
						// Stagiaire nul qu'on va utiliser par la suite
						Alternant c1 = new Alternant(null, null, null, 0, null, 0, null, null, null, null, 0);
						//on affiche tous les alternants
						DriverLecture.afficheAlternant();
						Paie paieAlternant= new Paie (0, null, 0, 0, 0);						
						System.out.println("Saisir l'idEmp de l'alternant");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						sc.nextLine();
						System.out.println("Saisir une période de paie: ");
						String perpaie = sc.nextLine();
						System.out.println("Saisir le montant du salaire de base: ");
						float salaireFixe = sc.nextInt();
						sc.nextLine();
						c1.calculPaie(idrech, perpaie, salaireFixe);// on appelle la méthode pour créer une paie pour un stagaire
						c1.toString();
						paieAlternant = DriverAjout.AjoutPaieAlternant(idrech,perpaie,salaireFixe);// on renvoie tout à la BDD

						break;
					}
					
					case 0: {
						break;
					}
					default: {
						System.out.println("Choix invalide");
					}
					}
					break;
				} // FIN CASE 2 CREER PAIE

				case 3: {
					System.out.println("Modifier un bulletin de paie ");
					int choix = 0;
					System.out.println("-1- Modifier un bulletin de paie pour un cadre CDI");
					System.out.println("-2- Modifier un bulletin de paie pour un CDD");
					System.out.println("-3- Modifier un bulletin de paie pour un alternant");
					System.out.println("-3- Modifier un bulletin de paie pour un stagiaire");
					System.out.println("-0- Retour ");
					System.out.print("Choix : ");

					choix = sc.nextInt();

					switch (choix) {
					case 1: {
						// CDI nul qu'on va utiliser par la suite
						Paie paiecadre = new Paie(0, null, 0, 0, 0);
						System.out.println("Consulter la paie d'un cadre CDI ");
						sc.nextLine();
						//on affiche tous les cadres
						DriverLecture.afficheCadre();
						System.out.print("Id de l'employé : ");
						int idrech = sc.nextInt();
						paiecadre = DriverLecture.idPaieCadre(idrech); // Retrouve le salaire du CDI dans la BDD
						int c = 0;
						System.out.println("-1- Modifier la période de paie ");
						System.out.println("-2- Modifier le taux jour");
						System.out.println("-0- Retour");
						System.out.print("Choix : ");

						c = sc.nextInt();
						
						switch (c) {
						case 1: {
							sc.nextLine();
							System.out.println("Modifier la période de paie ");
							System.out.print("Nouvelle période : ");
							String perpaie = sc.nextLine();
							paiecadre.setperpaie(perpaie);
							System.out.println("Modification effectuée");
							DriverModifier.modifPerpaie(paiecadre.idEmp, perpaie);
							break;
						}
						case 2: {
							sc.nextLine();
							System.out.println("Modifier le taux jour ");
							System.out.print("Nouveau taux jour : ");
							float tauxJour = sc.nextInt();
							//id.setTauxJour(tauxJour);
							System.out.println("Modification effectuée");
							//DriverModifier.idCadreTauxJour(id.idEmp, tauxJour);
							break;
						}

						case 0: {
							break;
						}
						default: {
							System.out.println("Choix invalide");
						}

						} // Fin du Switch(c) : choix de l'info à modifier
						break;
					} /* fin du case 1 : modifier la paie d'un cadre CDI */

					case 2: {
						// CDD nul qu'on va utiliser par la suite
						Cdd id = new Cdd(null, null, null, 0, null, 0, null, null, 0, 0);

						System.out.println("Modifier un bulletin de paie d'un CDD: ");
						DriverLecture.afficheCdd();
						sc.nextLine();
						System.out.println("Saisir l'idEmp du Cdd");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idCDD(idrech); // Retrouve le CDI
															// dans la Bdd

						int c = 0;
						System.out.println("-1- Modifier la période de paie ");
						System.out.println("-2- Modifier le salaire fixe");
						System.out.println("-2- Modifier le salaire variable");
						System.out.println("-0- Retour");
						System.out.print("Choix : ");

						c = sc.nextInt();
						switch (c) {
						case 1: {
							sc.nextLine();
							System.out.println("Modifier la période de paie ");
							System.out.print("Nouvelle période : ");
							String perpaie = sc.nextLine();
							// id.setPerpaie(perpaie);
							System.out.println("Modification effectuée");
							// DriverModifier.idCadrePerpaie(id.idEmp, perpaie);
							break;
						}
						case 2: {
							sc.nextLine();
							System.out.println("Modifier le salaire fixe ");
							System.out.print("Nouveau salaire fixe : ");
							float salaireFixe = sc.nextInt();
							id.setSalaireFixe(salaireFixe);
							System.out.println("Modification effectuée");
							DriverModifier.idCddSalaireFixe(id.idEmp, salaireFixe);
							break;
						}
						case 3: {
							sc.nextLine();
							System.out.println("Modifier le salaire variable ");
							System.out.print("Nouveau salaire variable : ");
							float salaireVariable = sc.nextInt();
							id.setSalaireVariable(salaireVariable);
							System.out.println("Modification effectuée");
							DriverModifier.idCddSalaireVariable(id.idEmp, salaireVariable);
							break;
						}

						case 0: {
							break;
						}
						default: {
							System.out.println("Choix invalide");
						}
						
						} // Fin du Switch(c) : choix de l'info à modifier
						break;
					} /* fin du case 2 : modifier la paie d'un CDD */

					case 3: {
						// ALTERNANT nul qu'on va utiliser par la suite
						Alternant id = new Alternant(null, null, null, 0, null, 0, null, null, null, null, 0);

						System.out.println("Modifier un bulletin de paie d'un alternant: ");
						DriverLecture.afficheAlternant();
						sc.nextLine();
						System.out.println("Saisir l'idEmp de l'alternant");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idAlternant(idrech); // Retrouve
																// l'alternant
																// dans la Bdd

						int c = 0;
						System.out.println("-1- Modifier la période de paie ");
						System.out.println("-2- Modifier le salaire fixe");
						System.out.println("-0- Retour");
						System.out.print("Choix : ");

						c = sc.nextInt();
						switch (c) {
						case 1: {
							sc.nextLine();
							System.out.println("Modifier la période de paie ");
							System.out.print("Nouvelle période : ");
							String perpaie = sc.nextLine();
							// id.setPerpaie(perpaie);
							System.out.println("Modification effectuée");
							// DriverModifier.idCadrePerpaie(id.idEmp, perpaie);
							break;
						}
						case 2: {
							sc.nextLine();
							System.out.println("Modifier le salaire fixe ");
							System.out.print("Nouveau salaire fixe : ");
							float salaireFixe = sc.nextInt();
							id.setSalaireFixe(salaireFixe);
							System.out.println("Modification effectuée");
							DriverModifier.idAlternantSalaireFixe(id.idEmp, salaireFixe);
							break;
						}

						case 0: {
							break;
						}
						default: {
							System.out.println("Choix invalide");
						}

						} // Fin du Switch(c) : choix de l'info à modifier						
						break;
					} /* fin du case 2 : modifier la paie d'un alternant */

					case 4: {
						// Stagiaire null créé qu'on va utiliser par la suite
						Stagiaire id = new Stagiaire(null, null, null, 0, null, 0, null, null, null, null, 0);

						System.out.println("Modifier un bulletin de paie d'un stagiaire: ");
						DriverLecture.afficheStagiaire();
						sc.nextLine();
						System.out.println("Saisir l'idEmp du stagiaire");
						System.out.print("Choix : ");
						int idrech = sc.nextInt();
						id = DriverLecture.idStagiaire(idrech); // Retrouve
																// l'alternant
																// dans la Bdd

						int c = 0;
						System.out.println("-1- Modifier la période de paie ");
						System.out.println("-2- Modifier la gratification");
						System.out.println("-0- Retour");
						System.out.print("Choix : ");

						c = sc.nextInt();
						switch (c) {
						case 1: {
							sc.nextLine();
							System.out.println("Modifier la période de paie ");
							System.out.print("Nouvelle période : ");
							String perpaie = sc.nextLine();
							// id.setPerpaie(perpaie);
							System.out.println("Modification effectuée");
							// DriverModifier.idStagiairePerpaie(id.idEmp,
							// perpaie);
							break;
						}
						case 2: {
							sc.nextLine();
							System.out.println("Modifier la gratification ");
							System.out.print("Nouvelle gratification: ");
							float salaireFixe = sc.nextInt();
							id.setSalaireFixe(salaireFixe);
							System.out.println("Modification effectuée");
							DriverModifier.idStagiaireSalaireFixe(id.idEmp, salaireFixe);
							break;
						}

						case 0: {
							break;
						}

						default: {
							System.out.println("Choix invalide");
						}
						}
						break;
					}

						// FIN MODIF PAIE

					case 0: {
						break;
					}

					default: 
					{
						System.out.println("Choix invalide");
					}
					}
					
				} /* fin du switch(sousmenu2) gestion des congés */
				case 0: 
				{
					break;
				}
				default:
				{ 
					System.out.println("Choix invalide");
				}
				}
				break;
				}/* fin case 3 : gestion de la paie */

			

				// ----------------------------------------FIN GESTION
				// PAIE-----------------------------------------//

			case 4: {
				System.out.println("Consultation des informations relatives au groupe ");
				int sousmenu2 = 0;
				System.out.println("-1- Afficher tous les salariés du groupe");
				System.out.println("-2- Afficher le nombre de salariés");
				System.out.println("-3- Afficher la masse salariale");
				System.out.println("-4- Afficher le nombre de personnes en congé aujourd'hui");
				System.out.println("-0- Retour ");
				System.out.print("Choix : ");
				sousmenu2 = sc.nextInt();

				switch (sousmenu2) {
				case 1: {
					sc.nextLine();
					System.out.println(employes.toString());
					break;
				}
				case 2: {
					sc.nextLine();
					int nbsalaries = employes.nbsalariesGroupe();
					System.out.println("Il y a " + nbsalaries + "  salariés dans le groupe");
					break;
				} // fin case 2 : afficher nb de salariés du groupe

				case 3: {
					sc.nextLine();
					int nbconges = employes.nbemployesEnConge();
					System.out.println("Il y a " + nbconges + " salariés du groupe en congés");
					break;
				}

				case 4: {
					sc.nextLine();
					System.out.println(employes.employesEnConge());
					break;
				}

				case 0: {
					break;
				}

				default: {
					System.out.println("Choix invalide");
				}
				} /*
					 * fin du switch(sousmenu2) : consultation des info du groupe
					 */

				break;
			} /* fin case Consultation */

			case 0: {
				quitter = true;
				System.out.println("Au revoir");
				break;
			}
			default: {
				System.out.println("Choix invalide");
			}

			} /* fin du while : gros menu */
		}
	}
}
