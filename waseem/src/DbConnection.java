

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection 
{
	static Connection con=null;
	public static Connection getConnection()
	{
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return con;
}
}