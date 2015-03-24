<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Ajouter une id�e</title>
</head>
<body>
<h1>Page d'ajout d'id�e</h1>
<p>Vous pouvez ajouter ici une id�e.</p>
<form:form method="POST" commandName="idee" action="${pageContext.request.contextPath}/idee/ajouter.html">
<table>
<tbody>
	<tr>
		<td>Id�e:</td>
		<td><form:input path="texte" /></td>
	</tr>
	<tr>
		<td><input type="submit" value="ajouter" /></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>

<p><a href="${pageContext.request.contextPath}/index.html">Page d'accueil</a></p>
</body>
</html>