package pruebas;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;


public class PruebasProcesos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder constructor = new ProcessBuilder("cmd","/c","start chrome");
		InputStream in=null;
		ByteArrayOutputStream out= new ByteArrayOutputStream();
		byte [] movedor = new byte [1024];
		int tamanio=0;
		Process miproceso=null;
		
		try{
			miproceso=constructor.start();
			in=miproceso.getInputStream();
			
			while((tamanio = in.read(movedor)) != -1){
				out.write(movedor,0,tamanio);
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
			}catch(Exception e){
				
			}
		}
		
		
	}

}
