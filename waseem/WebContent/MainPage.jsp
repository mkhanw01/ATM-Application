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
<h1>
Welcome To SBI Online  Banking
</h1>
<form method="get" action=HubServlet.jsp>
<table>
<tr>
<td>
<h3>Accounts</h3>
</td>
</tr>
<tr><td><input type="submit" name="action" value="OpenAccount"></td></tr>
<tr><td><input type="submit" name="action" value="CloseAccount"></td></tr>
<tr>
<td>
<h3>Transactions</h3>
</td>
</tr>
<tr><td><input type="submit" name="action" value="Debit/Credit"></td></tr>
<tr><td><input type="submit" name="action" value="FundTransfer"></td></tr>
<tr><td><input type="submit" name="action" value="CheckBalance"></td></tr>
<tr><td><input type="submit" name="action" value="MiniStatement"></td></tr>
</table>
</form>
</body>
</html>