package _pruebas.serializacion;

import com.thoughtworks.xstream.XStream;

public class GuardarXML {

	private static String fichero = "personas.xml";

	public static void main(String[] args) {
		//XStream.allowTypesByWildcar
		XStream x = new XStream();
		Persona p = new Persona(1,"Adán");
		//x.alias("persona", Persona.class);
		//System.out.println(x.toXML(p));
		/*
		nuevoArchivo(fichero);
		escribir(fichero,g.toJson(p));
		*/
		System.out.println("FIN de PROCESO");
	}

}
