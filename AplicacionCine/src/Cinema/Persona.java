package Cinema;

public class Persona {
	private String nombre;
	private byte edad;
	private byte calculoNombre;
	private static float cantidad;
	private float precio; 
	
	public Persona(){
		edad = (byte) (Math.random()*56+5);
		calculoNombre = (byte) (Math.random()*5+1);
		
		switch(calculoNombre){
			case 1:
				nombre = "Juanito";
				break;
			case 2:
				nombre = "Bernardo";
				break;
			case 3:
				nombre = "Alubino";
				break;
			case 4:
				nombre = "Eustaquia";
				break;
			case 5:
				nombre = "Claresina";
				break;
		}
		
		if(edad>=5 && edad <=10){
			precio = 1.0f;
		}
		else if(edad>=11 && edad<=17){
			precio = 2.5f;
		}
		else{
			precio = 3.5f;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public byte getCalculoNombre() {
		return calculoNombre;
	}

	public void setCalculoNombre(byte calculoNombre) {
		this.calculoNombre = calculoNombre;
	}
	
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void sumarCantidadFinal(){
		cantidad+=this.getPrecio();
	}

	public float getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Persona.cantidad = cantidad;
	}

}
