package pe.com.unmsm.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)//mapea atributos publicos y privados de la clase hacia el xml
//@XmlAccessorType(XmlAccessType.PROPERTY)//mapea get y set publicos y privados de la clase hacia el xml
//@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)//mapea atributos publicos (standar no es necesario la anotaion) de la clase hacia el xml
//@XmlAccessorType(XmlAccessType.NONE)//mo mappea nada de forma automatica se tendra q acer de forma manual
public class Parent {
	private int idParent;
	@XmlElement(name="name")
	private String nameParent;
	@XmlElement(name="lastName")
	private String lastNameParent;
	/*
	 *Anotaciones para configurar el orden del xml 
	 *@XmlElementWrapper(name="Parents") crea un envoltorio llamado parents
	 *@XmlElement(name="Parent") añada cada elemento en el elemento superior de forma ordenada
	 */
	@XmlElementWrapper(name="childs")
	@XmlElement(name="child")
	private List<Child> listChild;
	
	public Parent() {
	}
	public Parent(int idParent, String nameParent, String lastNameParent, List<Child> listChild) {
		super();
		this.idParent = idParent;
		this.nameParent = nameParent;
		this.lastNameParent = lastNameParent;
		this.listChild = listChild;
	}
	public int getIdParent() {
		return idParent;
	}
	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}
	public String getNameParent() {
		return nameParent;
	}
	public void setNameParent(String nameParent) {
		this.nameParent = nameParent;
	}
	public String getLastNameParent() {
		return lastNameParent;
	}
	public void setLastNameParent(String lastNameParent) {
		this.lastNameParent = lastNameParent;
	}
	public List<Child> getListChild() {
		return listChild;
	}
	public void setListChild(List<Child> listChild) {
		this.listChild = listChild;
	}
	
	
	
}
