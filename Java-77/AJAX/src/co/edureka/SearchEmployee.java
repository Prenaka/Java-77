package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.entity.Employee;
import co.edureka.service.EmployeeDAO;


@WebServlet("/search")
public class SearchEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	private ApplicationContext context ; 
	
	public void init(ServletConfig config) throws ServletException {
		context = new ClassPathXmlApplicationContext("context.xml");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eno = request.getParameter("eno");
		response.setContentType("application/json");
		
		EmployeeDAO dao = (EmployeeDAO) context.getBean("dao");
		Employee emp = dao.searchEmployee(Integer.parseInt(eno));
		
		PrintWriter out = response.getWriter();
		if(emp != null) {
			JSONObject jobj = new JSONObject();
			jobj.put("ename", emp.getEname());
			jobj.put("salary", emp.getSal());
			out.println(jobj);
		}
		else {
			out.print("");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
