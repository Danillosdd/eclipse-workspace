<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listagem Pessoas</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
</head>
<body>

	<table class="table table-striped">
		<c:forEach items="${requestScope.listaPessoasNoAtributo}" var="pessoa">
			<tr>
				<td><c:out value="${pessoa.id}"></c:out></td>
				<td><c:out value="${pessoa.nome}"></c:out></td>
				<td><c:out value="${pessoa.idade}"></c:out></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>