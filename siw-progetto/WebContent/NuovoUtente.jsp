<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
	<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII" />
<title>Nuovo Utente</title>
</head>
<body>

	<div class="navbar-collapse collapse" aria-expanded="false"
		style="height: 1px;">
		<ul class="nav navbar-nav">
			<li class="active"><a href="customer.xhtml">Hello
					${customerController.customer.userName}</a></li>

			<li><a href="login.jsp">Login</a></li>

		</ul>
	</div>
	<!--/.nav-collapse -->
	</div>
	<div class="jumbotron">
		<div class="container">
			<div class="col-md-6 col-md-offset-3">
				<h3>Sign up!</h3>
				<p>Give us your information, please.</p>

				<div class="form-group">
					<LABEL>Name:</LABEL>
					<h:inputText styleClass="form-control"
						value="#{UtenteController.nome}" required="true"
						requiredMessage="name is mandatory" id="fname" />
					<h:message for="fname" />
				</div>
				<div class="form-group">
					<LABEL>Username:</LABEL>
					<h:inputText styleClass="form-control"
						value="#{UtenteController.nickname}" required="true"
						requiredMessage="Username is mandatory" id="uname" />
					<h:message for="uname" />
				</div>
				<div class="form-group">
					<label>Password:</label>
					<h:inputSecret styleClass="form-control"
						value="#{UtenteController.password}" required="true"
						requiredMessage="Password is mandatory" id="pwd" />
					<h:message for="pwd" />
				</div>
				<div class="form-group">
					<label>Date of Birth:</label>
					<h:inputText styleClass="form-control"
						value="#{UtenteController.dataDiNascita}" required="true"
						requiredMessage="Date of Birth is mandatory" id="dob">
						<f:convertDateTime pattern="dd-MM-yyyy" />
					</h:inputText>
					<h:message for="dob" />
				</div>
			</div>
		</div>
	</div>

</body>
</html>