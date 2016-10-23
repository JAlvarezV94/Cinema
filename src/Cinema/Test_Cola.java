package Cinema;

import java.util.ArrayList;
import java.util.List;

public class Test_Cola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte tamanioFila;
		byte i;
		
		tamanioFila = (byte) (Math.random()*51);
		List <Persona> fila = new ArrayList<Persona>();
		
		for(i=0;i<=tamanioFila;i++){
			fila.add(new Persona());
		}
		
		for (Persona persona : fila) {
			System.out.println("Nombre: "+persona.getNombre()+"...."+"Edad: "+persona.getEdad()+"...."+"Precio: "+persona.getPrecio());
			persona.sumarCantidadFinal();
		}
		System.out.println("Cantidad recaudada: "+fila.get(1).getCantidad());
		fila.clear();
	}

}