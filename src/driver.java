import java.sql.*;

public class driver {
	//JDBC diver nom et database URL
	static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:8889/RH";
	
	//BDD IDs
	static final String USER ="root";
	static final String PASS="";
	
	public static void ConnAjoutCadre(int idEmp,String nom, String prenom, String dateEmbauche, int etabAffectation,
			String dateNaissance, int tel, String email, float tauxJour)
	{
		Connection conn = null;
		Statement stmt = null;
		try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion à la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PASS);
			  System.out.println("Connexion établie...");				  
		
			//Etape 4: Execution de la requête
			System.out.println("Insertion des données dans la table...");
			stmt = conn.createStatement();
      
			String sql = "INSERT INTO Cadres " +
						 "VALUES ("+idEmp+",'" +nom+"', '"+ prenom + "','"+dateNaissance+"', '"+etabAffectation+"', '"+dateNaissance+"', '"+tel+"', '"+email+"', '"+tauxJour+"')";
			System.out.println("Requête : "+sql);
			stmt.executeUpdate(sql);
      
			System.out.println("Données ajoutées dans la table...");

		}
		catch(SQLException se){
			//Gestion erreurs pour JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Gestion erreurs pour Class.forName
			e.printStackTrace();
		}
		finally{
			//bloc finally utilisé pour fermer les ressources
			try{
				if(stmt!=null)
				conn.close();
			}
			catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
				conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Fin connexion BDD...");
	}
	
	//-----------------------------AJOUT CDD----------------------------------//
	public static void ConnAjoutCDD(int idEmp,String nom, String prenom, String dateEmbauche, int etabAffectation,
			String dateNaissance, int tel, String email, String dateFinContrat, float salaireFixe, float salaireVariable)
	{
		Connection conn = null;
		Statement stmt = null;
		try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion à la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PASS);
			  System.out.println("Connexion établie...");				  
		
			//Etape 4: Execution de la requête
			System.out.println("Insertion des données dans la table...");
			stmt = conn.createStatement();
      
			String sql = "INSERT INTO CDD " +
						 "VALUES ("+idEmp+",'" +nom+"', '"+ prenom + "','"+dateNaissance+"', '"+etabAffectation+"', '"+dateNaissance+"', '"+tel+"', '"+email+"', '"+dateFinContrat+"', , '"+salaireFixe+"', '"+salaireVariable+"')";
			System.out.println("Requête : "+sql);
			stmt.executeUpdate(sql);
      
			System.out.println("Données ajoutées dans la table...");

		}
		catch(SQLException se){
			//Gestion erreurs pour JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Gestion erreurs pour Class.forName
			e.printStackTrace();
		}
		finally{
			//bloc finally utilisé pour fermer les ressources
			try{
				if(stmt!=null)
				conn.close();
			}
			catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
				conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Fin connexion BDD...");
	}
}
