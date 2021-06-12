<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="empinfo" method="post">
		<s:textfield name="name" size="20" label="Username" />
		<s:textfield name="pass" size="20" label="password" />
		<s:submit name="submit" label="Submit" align="center" />
	</s:form>
</body>
</html>