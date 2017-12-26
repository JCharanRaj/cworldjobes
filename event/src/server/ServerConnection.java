package server;
import java.net.*;
public class ServerConnection {
	public static void main(String[] args) {
		try{
		ServerSocket server=new ServerSocket(8000);
		Socket s=server.accept();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
