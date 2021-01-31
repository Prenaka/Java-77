<%!
 String uid;
 String pwd;
%>
<h2>
<%
 uid = request.getParameter("txtUid");
 pwd = request.getParameter("txtPwd");
 
 if(uid.equals("admin") && pwd.equals("123"))
	 response.sendRedirect("https://www.edureka.co");
 else
	 response.sendError(response.SC_UNAUTHORIZED, "Invalid Username/ Password");
%>
</h2>