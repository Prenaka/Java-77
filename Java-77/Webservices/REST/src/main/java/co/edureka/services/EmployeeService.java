package co.edureka.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edureka.services.bindings.Employee;

@Path("employee")
public class EmployeeService {
 @GET
 @Produces("application/json")
 @Path("/all")
 public List<Employee> getAllEmployees() 
 {
    ArrayList<Employee> employeesList = new ArrayList<Employee>();
     	     
    employeesList.add(new Employee(101, "Sunil Joseph",2500f));
    employeesList.add(new Employee(201, "Anirudh",3500f));
    employeesList.add(new Employee(301, "Jefferey",4500f));	     
 	    
    return employeesList;
 }
}
