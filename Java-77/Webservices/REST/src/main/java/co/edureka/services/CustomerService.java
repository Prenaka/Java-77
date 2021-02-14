package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/customer")
public class CustomerService {
 @POST
 @Path("/save")	
 @Produces("text/html") 
 public String saveCustomer(@FormParam("name_field") String name, @FormParam("age_field") Integer age, @FormParam("addr_field") String address)
 {
	   //logic to save customer details in DB table
	   String output = "<div style=color:red;font-size:25px;>Registration Success::<br> Name - <u>"+name+"</u><br> Age - <u>"+age+"</u><br>Address - <u>"+address+"</u><hr></div>";
	   return output;	 
 }
}
