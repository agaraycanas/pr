package t13.ej01.dao;

import t13.ej01.entities.Cliente;
import t13.ej01.util.BDUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDAO {
	
	
	public void guardarCliente(Cliente cliente) {
		int dni = cliente.getDni();
		String nombre = cliente.getNombre();
		
		Connection con = BDUtil.getConnection();
		
		String sql = "insert into cliente(dni,nombre) values ("+ dni + ",'" + nombre +"')";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.execute();
			ps.close();
		}
		catch (Exception e) {
			System.out.println("Error al ejecutar SQL");
			System.out.println(e.getMessage());
		}
	}
}
