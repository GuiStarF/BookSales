<%@ page language="java" contentType="text/html; charset=gb2312" import="javax.servlet.http.*"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<body>
	<%
		String info = request.getParameter("info");
		if(info != null) {
			%>
			<h1>�û������������</h1><br>
			<%
		}
	%>
	<center>
	<h1>BookSale��½ϵͳ</h1>
	<form action = "LoginDeal" method="post">
		�û�����<input type="text" name="username">	<br><br>
		��&nbsp;�룺<input type="password" name = "passwd"><br><br>
		<input type="submit" value="��½">
	</form>
	</center>
</body>
</html>