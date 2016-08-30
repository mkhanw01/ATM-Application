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
<h1>Credit Debit Page</h1>
<form method="get" action="./CreditDebitServlet">
<table>
<tr>
<td>
AccountNo
</td>
<td>
<input type="text" name="accno"/>
</td>
</tr>
<tr>
<td>
<input type="radio" name="money" value="credit">Credit
</td>
<td>
<input type="radio" name="money" value="debit">Debit
</td>
</tr>
<tr>
<td>
Amount 
</td>
<td>
<input type="text" name="amount"/>
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