<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><s:property value="getText('global.title')" /></title>
	
	<link href="${pageContext.request.contextPath}/css/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet" type="text/css" />
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/init.js"></script>
</head>
<body>

	<div class="container panel">
	
	
		<div class="row text-center">
			<header>
				<h1><s:property value="getText('global.header')" /></h1>
			</header>
		</div>
	
	
		<div class="well"><s:property value="getText('global.instructions')" /></div>
	
	
		<div class="row">
	
			<s:form theme="simple">
					
					<s:select
						id="systemselect"
						label="Sistema"
						headerKey="0" headerValue="-- Seleccionar --"
						listKey="id"
						listValue="name"
					list="systems"
					
					></s:select>
			</s:form>
			
			<s:textarea id="info"></s:textarea>
		</div>
	</div>
	


</body>
</html>