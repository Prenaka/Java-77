<%@page import="java.util.Date" info="Page to display current date and time"%>
<h2 style="text-align:center">
<%!
 Date today = null;
%>
<%
 today = new Date();
 out.println(today);
%>
<br><br>
<%
 out.println("Info: "+getServletInfo());
%>
</h2>