<%@page isErrorPage="true"%>
<body style="background-color:aquamarine;color:red">
<h2>
<%
 if(exception instanceof ArithmeticException)
	 out.println("Error: "+ exception.getMessage());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
	 out.println("Error: "+ exception.toString());
 else
	 out.println("Internal Server Error!");
%>
</h2>
</body>