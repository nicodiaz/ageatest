<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>AGEA Test</title>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/init.js"></script>
</head>
<body>

	<h1>Grupo AGEA - Test</h1>
	
	<h2>Bienvenido!</h2>

	<s:form theme="simple">
			
			<s:select
				id="systemselect"
				label="Sistema"
				headerKey="0" headerValue="-- Seleccionar --" 
			list="systems.{name}"></s:select>
	</s:form>
	
	<s:textarea id="info"></s:textarea>
	


</body>
</html>