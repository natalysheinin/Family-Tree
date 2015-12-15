package model;

public class PersonBean {
	
	private String fname;
	   private String lname;
	   private PersonDAO mother;
	   private PersonDAO father;
//	   private PersonDAO children[];
//	   private PersonDAO siblings[];

	   public PersonBean()
	   {
		   
	   }
	   
	   public PersonBean(String fname, String lname, PersonDAO mother, PersonDAO father)
	   {
		   setFname(fname);
		   setLname(lname);
		   setMother(mother);
		   setFather(father);
		  // setChildren(children);
	   }

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public PersonDAO getMother() {
		return mother;
	}

	public void setMother(PersonDAO mother) {
		this.mother = mother;
	}

	public PersonDAO getFather() {
		return father;
	}

	public void setFather(PersonDAO father) {
		this.father = father;
	}

	//no siblings or children yet
}
