package Stud;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlToSqlConverter {
	
	public static void main(String[] args) {
		
		try {
			
	        File xmlFile = new File("C:/Users/admin/Desktop/Project/Task/Xml/student.xml");

	        ObjectMapper objectMapper = new XmlMapper();
	        ClassData classData = objectMapper.readValue(xmlFile, ClassData.class);

	        // Connecting to the database
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud", "root", "root");

	        // Preparing the SQL statement
	        String insertSql = "INSERT INTO student_table (name, id, branch, cgpa) VALUES (?, ?, ?, ?)";
	        PreparedStatement preparedStatement = connection.prepareStatement(insertSql);

	        // Insert data into SQL table
	        for (Student student : classData.getStudents()) {
	            preparedStatement.setString(1, student.getName());
	            preparedStatement.setString(2, student.getId());
	            preparedStatement.setString(3, student.getBranch());
	            preparedStatement.setDouble(4, student.getCgpa());
	            preparedStatement.executeUpdate();
	        }

	        // Close the resources
	        preparedStatement.close();
	        connection.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		
	}
	
	


}
