package sf1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sql {

		
	//URL, database, username, password
	public static final String URL = "jdbc:mysql://35.246.89.32:3306/SF1";
	public static final String USER = "java";
	public static final String PASS = "java";
	
	private Connection conn;
	private Statement stmt;
	
	public sql() throws SQLException {
		//open up the connection to the URL
		conn = DriverManager.getConnection(URL, USER, PASS);
		this.stmt = conn.createStatement();
	}
	
	
	
	
	
	//method called to close connection
		public void close() throws SQLException {
			conn.close();
		}
	
	
}
