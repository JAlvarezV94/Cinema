package pruebas;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class PruebasProcesos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessBuilder constructor = new ProcessBuilder("cmd","/c","start notepad");
		Process miproceso=null;
		byte [] movedor=new byte[1024];
		int tamanio;
		InputStream in = null;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
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
