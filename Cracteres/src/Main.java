import java.util.*;

public class Main {
	public static void main(String[] args) {
		 ArrayList<String> miColeccion = new ArrayList<String>();
	        miColeccion.add("Collection"); // 0
	        miColeccion.add("List");	   // 1
	        miColeccion.add("Set");	       // 2
	        miColeccion.add("SortedSet");  // 3
	        miColeccion.add("Map");        // 4

	        String elemento1 = miColeccion.get(1); // Obtener el primer elemento
	        String elemento2 = miColeccion.get(2); // Obtener el segundo elemento

	        miColeccion.set(1, elemento2); // Colocar el segundo elemento en la posición del primero
	        miColeccion.set(2, elemento1); // Colocar el primer elemento en la posición del segundo

	        // Imprimir la lista tras el cambio
	        for (String elto : miColeccion) {
	            System.out.println(elto);
	        }
	}
}
