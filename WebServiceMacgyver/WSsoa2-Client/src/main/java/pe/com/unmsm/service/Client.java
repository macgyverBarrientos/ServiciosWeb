package pe.com.unmsm.service;

import java.util.List;

public class Client {
	public static void main(String[] args){
		//inicializamos la fabria d proxy
		ListParentService factory = new ListParentService(Client.class.getResource("/parents.wsdl"));
		
		//obtenemos el proxy(port)
		ListParent listParent = factory.getListParentPort();
		
		//ejecucion del metodo remoto
		List<Parent> list = listParent.listParentsPage(1,2);
		
		for (Parent parent : list) {
			System.out.println("Nombre del Padre Paginado: " + parent.getName());
		}
		
	}
}
