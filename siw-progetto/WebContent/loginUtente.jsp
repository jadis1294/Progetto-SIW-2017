<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII" />
<title>Login</title>
</head>
<body>
	<div>
		<h2 class="form-signin-heading">Please sign in</h2>
		<form>
			<label for="inputUsername">Username: </label>

			<h:inputText  styleClass="form-control" value="#{UtenteController.userName}"
				required="true" requiredMessage="ID is mandatory" id="id" />
			<label for="inputPassword">Password:</label>
			<h:inputText  styleClass="form-control" value="#{UtenteController.password}"
				equired="true" requiredMessage="Password is mandatory" id="password" />
		</form>

	</div>
</body>
</html>