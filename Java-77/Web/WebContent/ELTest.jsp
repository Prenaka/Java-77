<h2>
<%
 String uid = request.getParameter("txtUid");
 String pwd = request.getParameter("txtPwdd");
 out.println("User Name = " + uid + "<br>");
 out.println("Password = " + pwd);
%>
<br><br>
User Name = ${param.txtUid} <br>
Password = ${param.txtPwdd}
</h2>