<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Customer registration form</title>
	<style>
		.error {color:red}
	</style>
</head>
<body>
<i>Fill out the form. * -fields are required.</i>
	<form:form action="processForm" modelAttribute="customer">
	
	First name*: <form:input path="firstName" />
	<form:errors path="firstName" cssClass="error"/>
	<br><br>
	Last name*: <form:input path="lastName" />
	<form:errors path="lastName" cssClass="error"/>
	<br><br>
	Country:
	<form:select path="country">
		<form:options items="${customer.countryOptions}"/>
	</form:select>
	<br><br>
	Job position:
	<form:radiobuttons path="jobPosition" 
	 items="${customer.jobOptions}"/>
	<br><br>
	Operating Systems:
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
	MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>
	DOS <form:checkbox path="operatingSystems" value="DOS"/>
	<br><br>
	<input type="submit" value="Submit" />
	</form:form>
</body>
</html>