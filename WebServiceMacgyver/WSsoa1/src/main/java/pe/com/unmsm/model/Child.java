package pe.com.unmsm.model;

public class Child {
	private int idChild;
	private String  nameChild;
	private int holdChild;
	
	
	public Child(int idChild, String nameChild, int holdChild) {
		super();
		this.idChild = idChild;
		this.nameChild = nameChild;
		this.holdChild = holdChild;
	}
	
	public int getIdChild() {
		return idChild;
	}

	public void setIdChild(int idChild) {
		this.idChild = idChild;
	}

	public String getNameChild() {
		return nameChild;
	}
	public void setNameChild(String nameChild) {
		this.nameChild = nameChild;
	}

	public int getHoldChild() {
		return holdChild;
	}

	public void setHoldChild(int holdChild) {
		this.holdChild = holdChild;
	}
	
	
	
}
