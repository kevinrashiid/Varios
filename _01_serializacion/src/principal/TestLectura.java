package principal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.Curso;

public class TestLectura {

	public static void main(String[] args) {
		
		String url="C:\\TufKevin\\Eclipse\\Ficheros\\serializado.txt";
		try(FileInputStream fis=new FileInputStream(url);
				ObjectInputStream in=new ObjectInputStream(fis)){
			//lectura del objeto
			Curso curso=(Curso)in.readObject();
			System.out.println("el curso es: "+curso.getNombre());
			//para utilizar un multi catch no pueden tener las dos excepction herencia una de otra
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}