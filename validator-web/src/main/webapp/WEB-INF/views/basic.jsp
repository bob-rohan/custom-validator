<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
</head>
<body>
	<c:if test="${not empty errorMessage}">
		<div class="alert alert-danger">
			<p>${errorMessage}</p>
		</div>
	</c:if>

	<sf:form method="POST" commandName="registration">
		<sf:input type="number" path="candidate.age" />
		<br>
		<button type="submit">Submit</button>
	</sf:form>
</body>
</html>