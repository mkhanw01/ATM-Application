<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" type="text/css" href="Form1.css">

</head>
<body>
<%
String result=request.getParameter("action");
if (result.equals("OpenAccount"))
{
	RequestDispatcher rd=request.getRequestDispatcher("/OpenAccount.jsp");
	rd.forward(request,response);
	//out.println("open account");
}
else if(result.equals("FundTransfer"))
{
	RequestDispatcher rd=request.getRequestDispatcher("/FundsTransfer.jsp");
	rd.forward(request,response);
	//out.println("FundTransfer");
}
else if(result.equals("CheckBalance"))
{
	RequestDispatcher rd=request.getRequestDispatcher("/CheckBalance.jsp");
	rd.forward(request,response);
	//out.println("Check Balance");
}
else if(result.equals("CloseAccount"))
{
	RequestDispatcher rd=request.getRequestDispatcher("/CloseAccount.jsp");
	rd.forward(request,response);
	//out.println("Close Account");
}
else if(result.equals("MiniStatement"))
{
	RequestDispatcher rd=request.getRequestDispatcher("/MiniStatement.jsp");
	rd.forward(request,response);
	//out.println("MiniStatement");
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("/CreditDebit.jsp");
	rd.forward(request,response);
	//out.println("Credit Debit");
}
	
%>
</body>
</html>