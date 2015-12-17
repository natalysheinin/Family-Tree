package model;

import java.text.SimpleDateFormat;

public class PersonBean {
	
	   private String fname;
	   private String lname;
	   private SimpleDateFormat birth;
	   private SimpleDateFormat death;
	   private int mother;
	   private int father;
//	   private PersonDAO children[];
//	   private PersonDAO siblings[];

	   public PersonBean()
	   {
		   
	   }
	   //regular constructor
	   public PersonBean(String fname, String lname, int mother, int father)
	   {
		   this.fname.equals(fname);
		   this.lname.equals(lname);
		   this.mother = mother;
		  // setChildren(children);
	   }
	   
	   //If birth & death are known:
	   public PersonBean(String fname, String lname, SimpleDateFormat birth, SimpleDateFormat death, int mother, int father)
	   {
		   this.fname.equals(fname);
		   this.lname.equals(lname);
		   this.mother = mother;
		   this.father = father;
		   this.birth.equals(birth);
		   this.death.equals(death);
		  // setChildren(children);
	   }
	   
	   //If only birth date are known
	   public PersonBean(String fname, String lname, SimpleDateFormat birth, int mother, int father)
	   {
		   this.fname.equals(fname);
		   this.lname.equals(lname);
		   this.mother = mother;
		   this.father = father;
		   this.birth.equals(birth);
		  // setChildren(children);
	   }

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		 this.fname.equals(fname);
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		
		   this.lname.equals(lname);
	}

	public int getMother() {
		return mother;
	}

	public void setMother(int mother) {
		this.mother = mother;
	}

	public int getFather() {
		return father;
	}

	public void setFather(int father) {
		this.father = father;
	}

	//no siblings or children yet
	//will add birth & death dates getters & setters later.
}
