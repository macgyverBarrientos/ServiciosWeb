package pe.com.unmsm.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pe.com.unmsm.model.Child;
import pe.com.unmsm.model.Parent;

public class ParentDAO {
	public List<Parent> listParent(){
		List<Parent> listParent = new ArrayList<Parent>();
		listParent.add(new Parent(1, "Macgyver", "Barrientos", new ArrayList<Child>(
				Arrays.asList(new Child(1, "Jose", 15),new Child(2, "Maria", 20)))));
		listParent.add(new Parent(2,"Maria","Gamarre",
				new ArrayList<Child>(Arrays.asList(new Child(3, "Jose", 9),new Child(4, "Marisol", 6),new Child(5, "Sofia", 24)))));
		listParent.add(new Parent(3,"Grober","Perez", new ArrayList<Child>(Arrays.asList(new Child(6, "Manuel", 12)))));
		return listParent;
	}

	public List<Parent> listParent(int iniNumParent, int sizeListParent) {
		//List<Parent> list = listParent();
		return listParent().subList(iniNumParent - 1, sizeListParent + iniNumParent -1);
	}
}
