package _pruebas.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("ARRANCANDO");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

		String sql = "delete from cliente";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.execute();
		ps.close(); // RECOMENDABLE

		System.out.println("FIN");
	}

}
