package t13.ej01.controller;

import t13.ej01.dao.ClienteDAO;
import t13.ej01.entities.Cliente;

public class ClienteController {
	private ClienteDAO clienteDAO;
	
	public ClienteController() {
		this.clienteDAO = new ClienteDAO();
	}
	
	public void crearCliente(String dni, String nombre) {
		Cliente cliente = new Cliente(Integer.parseInt(dni), nombre);
		this.clienteDAO.guardarCliente(cliente);
	}
}
