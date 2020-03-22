<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Customer confirmation</title>
</head>
<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}
<br><br>
Country: ${customer.country}
<br><br>
Job position: ${customer.jobPosition}
<br><br>
Operating Systems:
<ul>
	<c:forEach var="temp" items="${customer.operatingSystems}">
		<li>${temp}</li>
	</c:forEach>
</ul>
</body>
</html>