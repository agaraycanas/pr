package t11.ej08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	private static String categoriaFiltro= "conservas";
	
	private static List<Producto> l = List.of(
			new Producto("atún",3.8,"conservas"),
			new Producto("mejillones",2.7,"conservas"),
			new Producto("berberecho",1.8,"conservas"),
			new Producto("cerveza",1,"bebidas"),
			new Producto("coca cola",2,"bebidas"),
			new Producto("whisky",10,"bebidas")
			);

	public static void main(String[] args) {
		System.out.println("CLASICO");
		procesarClasico();
		System.out.println("STREAM");
		procesarStream();
		System.out.println("ORIGINAL");
		System.out.println(l);
	}

	private static void procesarClasico() {
		List<Producto> listaFinal = new ArrayList<>();
		for (Producto  p : l ) {
			if ( p.getCategoria().equals(categoriaFiltro)) {
				Producto productoFinal = new Producto(p.getNombre(),p.getPrecio(),p.getCategoria());
				productoFinal.setPrecio( p.getPrecio()*1.1 );
				listaFinal.add(productoFinal);
			}
		}
		System.out.println(listaFinal);
	}

	private static void procesarStream() {
		System.out.println(
				l.stream()
					//.map( p -> new Producto(p.getNombre(),p.getPrecio(),p.getCategoria()))
					//.map ( p -> new Producto(p) )
					.map( Producto::new)
					.filter( p -> p.getCategoria().equals(categoriaFiltro))
					.map( 	p -> { 
								p.setPrecio( p.getPrecio()*1.1 ); 
								return p; 
								} 
						)
					.collect(Collectors.toList())
				);
		
	}
}
