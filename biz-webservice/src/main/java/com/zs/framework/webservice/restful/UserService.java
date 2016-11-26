package com.zs.framework.webservice.restful;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces({ MediaType.APPLICATION_XML}) 
@Consumes({ MediaType.APPLICATION_XML})
public interface UserService {

	@GET 
	 @Produces(MediaType.APPLICATION_XML) 
		 @Path("/searchuser/{userId}") 
	    User searchUser(@PathParam("userId") String userId); 
		
		 @POST  
	 @Consumes(MediaType.APPLICATION_XML) 
		 @Path("/adduser")  
		 Response addUser(User user); 
		
		 @DELETE  
	 @Consumes(MediaType.APPLICATION_XML)  
		 @Path("/deleteuser/{userId}")  
		 Response deleteUser(@PathParam("userId") String userId); 
		
		 @PUT  
		 @Path("/category")  
	 @Consumes(MediaType.APPLICATION_XML)  
	        Response updateUser(User user); 
		
		 @GET  
		 @Path("/getusers/startdate/{startDate}/enddate/{endDate}")  
	 @Produces({ MediaType.APPLICATION_XML}) 
	       Users getUsers(@PathParam("startDate") String startDate , 
	                      @PathParam("endDate") String endDate); 
		 
}
