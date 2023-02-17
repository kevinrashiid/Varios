package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//este cliente se comunica con le servicdor
		Socket socket=new Socket("localhost",8000);
		//este escribe 
		OutputStream os=socket.getOutputStream();
		PrintStream out=new PrintStream(os);
		out.println("Hola servidor!");
		BufferedReader bf=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println(bf.readLine());
	}
}