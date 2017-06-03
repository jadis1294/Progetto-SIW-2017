<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuova Opera</title>
</head>
<body>
	<h1>addNewOpera </h1>
	<hr>
	<div align="center">
		<form action="product" method="post">
			<table>
				<tr>
					<td align="right">Nome*:</td>
					<td><input type="text" name="name" autofocus="autofocus"
						value="${product.name}" /></td>
					<td>${errName}</td>
				</tr>
				<tr>
					<td align="right">Descrizione*:</td>
					<td><input type="text" name="description"
						value="${product.description}" /></td>
					<td>${errDesc}</td>
				</tr>
				<tr>
					<td colspan="3" align="center">(* = campo obbligatorio)</td>
				</tr>
			</table>
			<input type="submit" name="submit" value="INVIA" />
		</form>
		<a href="product">Lista Prodotti</a>
	</div>
</body>
</html>
</body>
</html>