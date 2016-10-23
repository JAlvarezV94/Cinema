package pruebas;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Antes de nada importar las clases: java.io.ByteArrayOutputStream,java.io.IOException y  
		 * java.io.InputStream*/
		
		/*Hace falta una variable ImputStream para leer el flujo de entrada
		 * ,otra ByteArrayOutputStream para escribir los datos recibidos por el array,
		 * Un array de Bytes para indicar cuanto movemos en cada iteración y cuando se termina el flujo,
		 * Una objeto de tipo ProcessBuilder para construir el proceso y startearlo. Luego otro objeto
		 * de tipo Process para controlar el flujo con él.Dar a la variable InputStream la entrada estandar 
		 * del flujo y a la variable ByteArrayOutputStream la salida del flujo. Por ultimo escribir en cada
		 * iteración con ByteArrayOutputStream y finalizar el proceso.*/
		
		InputStream in=null;
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		byte [] arrayBytes=new byte[1024];
		int tamanioAMover=0;
		ProcessBuilder constructor=new ProcessBuilder();
		Process miproceso=null;
		
		
		//Primero construimos el proceso
		constructor=new ProcessBuilder("cmd","/c","start chrome");
		
		//Luego creamos un TryCatch e intentamos arrancarlo.
		try{
			miproceso=constructor.start();
			in=miproceso.getInputStream();
			
			while((tamanioAMover = in.read(arrayBytes)) != -1){
				out.write(arrayBytes, 0, tamanioAMover);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(in != null){
					in.close();
				}
				if(out != null){
					out.close();
				}
			}catch(Exception e){}
			
		}
		
		
	}

}
