

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OpenServlet1")
public class OpenServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//static long accnum=20145472500L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String acc_name=request.getParameter("acc_name");
		long dep_amt=Long.parseLong(request.getParameter("dep_amt"));
		try
		{
		    Connection con=DbConnection.getConnection();
			CallableStatement cst = con.prepareCall("{call INSERT_DATA(?,?,?)}");
			cst.registerOutParameter(1,Types.LONGVARCHAR);
			cst.setString(2,acc_name);
			cst.setLong(3,dep_amt);
			cst.execute();
			out.println("<html><body><h2>");
			out.println("your Account  Created Sucessfully");
			out.println("</h2></body></html>");
			out.print("<br>"+"generated account Num= "+cst.getLong(1));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
