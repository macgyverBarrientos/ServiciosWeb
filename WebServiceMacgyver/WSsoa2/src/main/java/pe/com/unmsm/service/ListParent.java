package pe.com.unmsm.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import pe.com.unmsm.dao.ParentDAO;
import pe.com.unmsm.model.Parent;

@WebService
public class ListParent {
	
	private ParentDAO getParentDao(){
		return new ParentDAO();
	}
	
	/*
	 * Descripcion
	 * @WebResult(name="Parent")
	 * crea un tag parent en el xml
	 */
	@WebResult(name="parent")
	public List<Parent>  listParent(){
		ParentDAO dao = getParentDao();
		return dao.listParent();
	}
	/*
	 * ¿Que sucede si servicion con el mismo nombre?
	 * Se sucita una excepcion en tiempo de compilacion
	 * @RequestWrapper(
	 * className = "pe.com.unmsm.service.jaxws.ListParentsPage",
	 * localName = "listParentsPage")
	 * @ResponseWrapper(
	 * 		className = "pe.com.unmsm.service.jaxws.ListParentsPageResponse",//de la forma como se va a llamar del servicio
	 * 		localName = "listParentsPageResponse")
	 * @WebResult(name = "parent")
	 * @WebMethod(operationName = "listParentsPage") //metodo del servicio para no confundir (se visualiza el wsdl)
	 *
	 */
	@RequestWrapper(className = "pe.com.unmsm.service.jaxws.ListParentsPage",
				localName = "listParentsPage")
	@ResponseWrapper(className = "pe.com.unmsm.service.jaxws.ListParentsPageResponse",
				localName = "listParentsPageResponse")
	@WebResult(name = "parent")
	@WebMethod(operationName = "listParentsPage")
	public List<Parent> listParent(int iniNumParent, int sizeListParent){
		return getParentDao().listParent(iniNumParent,sizeListParent);
	}
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8080/parent", new ListParent());
		System.out.println("Servicio inicializado!");
	}

}
