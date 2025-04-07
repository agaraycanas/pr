package _pruebas.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args)  {
		System.out.println("ARRANCANDO");
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			Class.forName("org.postgresql.Driver");
		}
		catch (Exception e) {
			System.out.println("ERROR al cargar el DRIVER");
			System.out.println(e.getMessage());
		}
		
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost/test", "root", "");
		}
		catch (Exception e) {
			System.out.println("Error al conectar a la BD");
			System.out.println(e.getMessage());
		}

		/*
		String sql = "delete from cliente";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.execute();
		ps.close(); // RECOMENDABLE
		*/

		System.out.println("FIN");
	}

}
