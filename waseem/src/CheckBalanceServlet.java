

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

@WebServlet("/CheckBalanceServlet")

public class CheckBalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		long accno=Long.parseLong(request.getParameter("accno"));
        try
        { 
        Connection con=DbConnection.getConnection();
		CallableStatement cst = con.prepareCall("{call get_balance(?,?)}");
		cst.setLong(1,accno);
		cst.registerOutParameter(2,Types.FLOAT);
		cst.execute();
		out.println("<html><body><h2>");
		out.println("Your Balance is Rs "+cst.getFloat(2));
		out.println("</h2></body></html>");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
		
	}
		
		
	}

