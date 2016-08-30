

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreditDebitServlet
 */
@WebServlet("/CreditDebitServlet")
public class CreditDebitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		long accno=Long.parseLong(request.getParameter("accno"));
		long amount=Long.parseLong(request.getParameter("amount"));
		String action=request.getParameter("money");
		try
		{
		Connection con=DbConnection.getConnection();
		CallableStatement cst1=null;
		CallableStatement cst2=null;
		if(action.equals("credit"))
		{
			
			cst1=con.prepareCall("{call credit(?,?)}");
			cst1.setLong(1,accno);
			cst1.setLong(2,amount);
			cst1.execute();
			out.println("Amount Credited Sucessfully");
		}
		if(action.equals("debit"))
		{
			cst2=con.prepareCall("{call debit(?,?)}");
			cst2.setLong(1,accno);
			cst2.setLong(2,amount);
			cst2.execute();
			out.println("Amount Debited Sucessfully");
		}
			
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	
	}

}

