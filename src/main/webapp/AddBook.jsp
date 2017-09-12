<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body><center>
	<form action="AddBook" method="post">
			<h1><label>请输入信息</label></h1>
			<label>编号</label><br>
			<input type="text" name="bookId" ><br>
			<label>名称</label><br>
			<input type="text" name="bookName" ><br>
			<label>数量</label><br>
			<input type="text" name="bookNum" ><br>
			<label>A</label><br>
			<input type="text" name="bookA" ><br>
			<label>B</label><br>
			<input type="text" name="bookB" ><br>
			<input type="submit" value="提交"><br>
			</form>
</center></body>
</html>