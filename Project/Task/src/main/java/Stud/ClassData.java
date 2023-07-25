package Stud;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ClassData {
	
	@JacksonXmlProperty(localName = "student")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Student> students;
	
	public List<Student> getStudents(){
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	

}
