<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
	<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Utente</title>
</head>
<body>
	<div class="navbar-collapse collapse" aria-expanded="false"
		style="height: 1px;">
		<ul class="nav navbar-nav">
			<li class="active"><a href="index.jsp">Home</a></li>
			<li><a href="loginUtente.jsp">Login</a></li>
		</ul>
	</div>
	</div>
	</nav>
	<div class="jumbotron">
		<div class="container">

			<h2>Hello ${UtenteController.utente.name} !</h2>
			<div>Nickname: ${UtenteController.utente.nickname}</div>
			<div>Date of Birth: ${UtenteController.utente.dataDiNascita}</div>


			<a href="index.jsp" class="btn btn-primary">Return to Home</a>
		</div>
	</div>
</body>
</html>