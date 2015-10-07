package pe.com.unmsm.model;

import java.util.List;

public class Parent {
	private int idParent;
	private String nameParent;
	private String lastNameParent;
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
