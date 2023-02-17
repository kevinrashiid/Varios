package principal;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tareas.HiloLlamada;

public class Servidor {

	public static void main(String[] args) throws IOException {
		
		//creamos un servidor con el puerto 8000
		ServerSocket server=new ServerSocket(8000);
		ExecutorService executor=Executors.newCachedThreadPool();
		//acepta llamada empieza a escucha llamadas de alguien
		System.out.println("Esperando llamadas...");
		//bucle infinito para que no pare de escuchar
		while(true) {
			Socket  socket=server.accept();
			System.out.println("Llamada recibida!");
			//lanzamos un hilo para atender la llamada
			executor.submit(new HiloLlamada(socket));
		}
	}
}