package pruebas;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.*;

public class ApargarPc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null; //InputStream es la clase que lee los flujos de bytes
		ByteArrayOutputStream baos = null;
		String respuesta="";
		ProcessBuilder pb = null;
		respuesta=(String) JOptionPane.showInputDialog(null, "¿Que prefieres primo?","ApagarTuPC 0.1",JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Apagar", "Cancelar"}, 
				   "opcion 1");
		System.out.println(respuesta);
		if(respuesta.equals("Apagar")){
			pb = new ProcessBuilder("cmd","/C","shutdown -s -t 7200");
		}else if(respuesta.equals("Cancelar")){
			pb = new ProcessBuilder("cmd","/C","shutdown -a");
		}
		
		try {
			Process prs = pb.start(); //Process es el tipo de objeto que devuelven las clase 
			//ProcessBuilder, puedes controlar el flujo del proceso con ella.
			
			is = prs.getInputStream(); //Devuelve el flujo de entrada del programa.(Salida estandar).
			
			byte[] b = new byte[1024];//Creamos un array de bytes para ir moviendo el flujo del programa.
			int size = 0;			  //Con esta variable contamos los bytes que movemos
			
			baos = new ByteArrayOutputStream();
			
			while((size = is.read(b)) != -1){
				baos.write(b, 0, size);
			}
			
			System.out.println(new String(baos.toByteArray()));
		}catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(is != null) is.close();
				if(baos != null) baos.close();
			} catch (Exception ex){}
		}
	}

}
