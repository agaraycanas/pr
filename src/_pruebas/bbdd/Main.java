package _pruebas.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args)  {
		System.out.println("ARRANCANDO");
		
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

		
		String sql = "insert into cliente(dni,nombre) values (3,'Perico')";
		try {
			System.out.println("Ejecutando consulta SQL");
			System.out.println(sql);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.execute();
			ps.close(); // RECOMENDABLE
		}
		catch (Exception e) {
			System.out.println("Error al ejecutar SQL");
			System.out.println(e.getMessage());
		}
		

		System.out.println("FIN");
	}

}
