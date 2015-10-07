package pe.com.unmsm.service;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import pe.com.unmsm.dao.ParentDAO;
import pe.com.unmsm.model.Parent;

@WebService
public class ListParent {

	public List<Parent>  listParent(){
		ParentDAO dao = getParentDao();
		return dao.listParent();
	}
	private ParentDAO getParentDao(){
		return new ParentDAO();
	}
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8080/parent", new ListParent());
		System.out.println("Servicio inicializado!");
	}

}
