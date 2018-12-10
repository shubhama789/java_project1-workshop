package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseCollection {

	
	public static void main(String[] args) throws SQLException{
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","pass");
			Statement st = con.createStatement();
			//st.execute("INSERT INTO EMP VALUES(1245,"Subham","Developer",7839,'08-12-2018',17000,0,10);");
			
			ResultSet rs = st.executeQuery("SELECT * FROM EMP;");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		
	}
		
}
