
//STEP 1. Import des packages requis
import java.sql.*;
import java.util.ArrayList;

public class Driver {
   //JDBC diver nom et database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:8889/RH";

   //BDD IDs
   static final String USER = "root";
   static final String PASS = "root";
   
   //---------------------------AJOUT CADRE--------------------------------------------//
   public static void connexionAjoutCadre(ArrayList <Cadre> Cadres)
   {
		Connection conn = null;
		Statement stmt = null;
		try 
		{
		    //Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Le driver est lancé");
		      

				//Etape 4: Execution de la requête
				System.out.println("Insertion des données dans la table en cours.");
				stmt = conn.createStatement();
	     
				for (Cadre C : Cadres)
				{
					String sql = C.getrequetesql();
					stmt.executeUpdate(sql);
				}
				
	     
				System.out.println("Les valeurs ont bien été ajoutées dans la table !");
   

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
   
   
   //--------------voir tous les cadres-----------------//
   
 