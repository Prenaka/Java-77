<h2>
<jsp:useBean id="acc" class="co.edureka.Account"></jsp:useBean>
<jsp:setProperty property="*" name="acc"/>

A/C No: <jsp:getProperty property="acno" name="acc"/> <br>
Name: <jsp:getProperty property="name" name="acc"/> <br>
Balance: <jsp:getProperty property="bal" name="acc"/>
</h2>