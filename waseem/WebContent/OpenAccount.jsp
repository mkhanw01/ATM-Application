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
<h1>Opening New account page</h1>
<form method="get" action="OpenServlet1">
<table>
<tr>
<td>
Account Name 
</td>
<td>
<input type="text" name="acc_name"/>
</td>
</tr>
<tr>
<td>
Money Deposit
</td>
<td>
<input type="text" name="dep_amt"/>
</td>
</tr>
<tr>
<td>
<input type="submit" value="Submit"/>
</td>
</tr>
</table>
</form>
</body>
</html>