<%!
 String name="edureka"; //instance variable

 public int addNum(int x, int y){
	return x+y;
 }
%>
<h2>
Name = <%=name %>
<br>
<%="Sum = "+addNum(23,12) %>
</h2>