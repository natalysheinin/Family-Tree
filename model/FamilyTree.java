package model;

import java.sql.SQLException;
import java.util.List;

public class FamilyTree {

	private PersonDAO personData;
	//private List<PersonBean> family;

	public FamilyTree() {

		personData = new PersonDAO();
	}

	public List<PersonBean> retrieveFamily() throws SQLException {
		return personData.getFamily();


	}
	
	//need to create add to Family method

}