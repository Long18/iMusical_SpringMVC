<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>
	<div align="center">
		<h2>Product Manager</h2>
		<table border="1" cellpadding="5">
			<tr>
				<th>ID</th>
				<th>Name</th>
			</tr>
			<c:forEach items="${listProduct}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>