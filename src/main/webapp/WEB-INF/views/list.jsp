<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Pizza,Pasta,Mandolino</title>
</head>
<body>
<h1>Pizza,Pasta,Mandolino</h1>

<c:forEach items="${data}" var="item">
    <p>${item}</p>
</c:forEach>

</body>
</html>