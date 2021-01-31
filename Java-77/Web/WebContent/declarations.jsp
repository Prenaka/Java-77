<%!
 String name="edureka"; //instance variable

 public int addNum(int x, int y){
	return x+y;
 }
%>
<h2>
<%
 out.println("Name = "+ name+"<br>");
 out.println("Sum = "+ addNum(11,24));
%>
</h2>