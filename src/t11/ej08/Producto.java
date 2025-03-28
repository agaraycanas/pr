package t11.ej08;

public class Producto {
	// ==================================

	private String nombre;
	private double precio;
	private String categoria;
	

	// ==================================
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(P)"+this.nombre+"\t("+this.categoria+")\t"+this.precio +"\n";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public Producto() {
	}
	public Producto(String nombre, double precio, String categoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	public Producto(Producto otroProducto) {
		super();
		this.nombre = otroProducto.getNombre();
		this.precio= otroProducto.getPrecio();
		this.categoria = otroProducto.getCategoria();
	}
}
