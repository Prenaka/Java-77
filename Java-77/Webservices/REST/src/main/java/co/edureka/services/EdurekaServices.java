package co.edureka.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/edureka")
public class EdurekaServices {
 @GET
 @Produces("text/html")
 public String localService() {
	 String msg = "<h2>Welcome to Customer Service Department for India</h2>";
	 return msg;
 }
 
 @GET
 @Produces("text/html")
 @Path("/intl")
 public String internationalService() {
	 String msg = "<h2>Welcome to International Customer Service Department</h2>";
	 return msg; 
 }
 
 @GET
 @Path("/enquiry/{name}/{course}")
 @Produces("text/html")
 public String enquiry(@PathParam("name") String name, @PathParam("course") String course) {
  //logic to get course details 	 
  return "<h2>Hi, "+name+"<br> Thanks for enquiring about the Course: <ins>"+course+"</ins></h2>";		
 }
 
 @GET
 @Path("/enquiry")
 @Produces("text/html")
 public String enquiry1(@QueryParam("name") String name, @QueryParam("course") String crs) {
   String output = "<h2>Customer Name : "+name+"<br> Course Name : "+crs+"</h2>";
   return output; 
 }
}
