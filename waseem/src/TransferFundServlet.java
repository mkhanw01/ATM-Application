

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TransferFundServlet")

public class TransferFundServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		long saccno=Long.parseLong(request.getParameter("saccno"));
		long taccno=Long.parseLong(request.getParameter("taccno"));
		long amount=Long.parseLong(request.getParameter("amount"));
		try
		{
		Connection con=DbConnection.getConnection();
		CallableStatement cst=con.prepareCall("{call transfer(?,?,?)}");
		cst.setLong(1,saccno);
		cst.setLong(2,taccno);
		cst.setLong(3,amount);
		cst.execute();
		out.println("Amount Transferred Sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
	}

}

