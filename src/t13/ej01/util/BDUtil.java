package t13.ej01.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class BDUtil {
	
	public static Connection getConnection() {
		try {
			System.out.println("Cargando DRIVER JDBC");
			Class.forName("org.postgresql.Driver");
		}
		catch (Exception e) {
			System.out.println("\tERROR al cargar el DRIVER");
			System.out.println("\t"+e.getMessage());
		}
		
		Connection con = null;
		try {
			System.out.println("Conectando BD");
			con = DriverManager.getConnection("jdbc:postgresql://localhost/test", "postgres", "1234");
		}
		catch (Exception e) {
			System.out.println("\tError al conectar a la BD");
			System.out.println("\t"+e.getMessage());
		}
		return con;
	}
}
