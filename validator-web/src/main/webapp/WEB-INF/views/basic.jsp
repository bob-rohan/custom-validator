<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
</head>
<body>
	<sf:form method="POST" commandName="registration">
		<sf:input type="number" path="candidate.age" /> 
		<br>
		<button type="submit">Submit</button>
	</sf:form>
</body>
</html>