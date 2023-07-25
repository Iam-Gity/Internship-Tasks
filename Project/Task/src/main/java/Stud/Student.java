package Stud;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Student {
	
	@JacksonXmlProperty(localName = "name")
	private String name;
	
	@JacksonXmlProperty(localName = "id")
	private String id;
	
	@JacksonXmlProperty(localName = "branch")
	private String branch;
	
	@JacksonXmlProperty(localName = "cgpa")
	private double cgpa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	

}
