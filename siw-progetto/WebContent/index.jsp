<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>MuseoAcme</title>
</head>
<body>

	<font size="4">Homepage Museo Acme</font>
	<div class="navbar-collapse collapse" aria-expanded="false"
		style="height: 1px;">
		<ul class="nav navbar-nav">
			<li class="active"><a href="utente.jsp">Hello
					${customerController.customer.userName}</a></li>

			<li><a href="loginUtente.jsp">Login</a></li>

		</ul>
	</div>
	<div class="jumbotron">
		<div class="container">
			<div></div>
			<h1 class="animated fadeInLeft delay03">Benvenuto nel sito del museo Acme</h1>
			<p>Qui troverai foto,curiosità e descrizioni delle opere della nostra galleria
			e potrai indicarci e tue preferite</p>
			<p>
				<a class="btn btn-lg btn-success" href="nuovoUtente.jsp"
					role="button">Registrati Ora</a>
			</p>
		</div>
	</div>
	</p>
	</div>
</body>
</html>