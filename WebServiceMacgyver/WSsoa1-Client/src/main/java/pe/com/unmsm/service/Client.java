package pe.com.unmsm.service;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		//inicializar la fabrica de proxies
		ListParentService listParentFactory = new ListParentService();
		
		//obtenemos el proxy(port)
		ListParent listParent = listParentFactory.getListParentPort();
		//ejecucion del metodo remoto
		List<Parent> parents = listParent.listParent();
		
		for (Parent parent : parents) {
			System.out.println("Padre: "+parent.getNameParent());
		}
	}

}
