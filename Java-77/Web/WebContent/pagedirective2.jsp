<%@page errorPage="handler.jsp" %>
<%!
 int x = 10;
 int y = 10;
 int[] n = new int[10];
%>
<h2>
<%
 int z = x/y;
 out.println(x + " / " + y + " = " + z+"<br>");
 out.println(n[0]); 
%>
</h2>