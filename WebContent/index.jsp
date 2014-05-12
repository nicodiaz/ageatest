<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>AGEA Test</title>
</head>
<body>

	<h1>Grupo AGEA - Test</h1>
	
	<h2>Bienvenido!</h2>

	<s:form>
		<s:combobox headerKey="0" headerValue="--- Seleccionar ---"
			list="systems.{name}" 
			name="s" />	
	</s:form>

	

</body>
</html>