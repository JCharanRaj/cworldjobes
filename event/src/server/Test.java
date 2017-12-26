package server;
import java.net.*;
public class Test {
	public static void main(String[] args) {
		try{
			Socket s=new Socket("127.0.0.1", 8000);
			System.out.println("Connected");
			}
			catch(Exception e){
				e.printStackTrace();
			}
		
	}
}
