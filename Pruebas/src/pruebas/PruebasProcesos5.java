package pruebas;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;

public class PruebasProcesos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessBuilder constructor = new ProcessBuilder("cmd","/c","start chrome");
		Process miproceso=null;
		byte [] movedor = new byte[1024];
		int size = 0;
		InputStream in = null;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		try{
			miproceso = constructor.start();
			in = miproceso.getInputStream();
			
			while((size = in.read(movedor)) != -1){
				out.write(movedor, 0, size);
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
