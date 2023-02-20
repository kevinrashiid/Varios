package proyecto16.principal;

import service.ItemServiceFactory;
import service.PaisesEUService;

public class Test {

	public static void main(String[] args) {
		
		PaisesEUService service=new ItemServiceFactory.getItemService();
		service.listaDePaises().forEach(System.out::prinln);
	}
}