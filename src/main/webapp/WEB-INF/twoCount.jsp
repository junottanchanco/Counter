<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Count Plus Two</title>
</head>
<body>
	<fieldset style="width: 650px; height: 100px; border: solid;">
		<h1>You have visited <a href="/your_server" style="color:blue;">http://your_server</a> ${count} times</h1>
	</fieldset><br>
	<a href="/your_server"><button>Add 1 Visit</button></a>
	<a href="/reset"><button>Reset Count</button></a>
	<a href="/count_two"><button>Add 2 Visits</button></a>
</body>
</html>