package org.rahul.javabrains.resources;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
@Path("/messages")
public class MessageResource {
@GET 
@Produces(MediaType.TEXT_PLAIN)
public String getMessages() {
	return "Hello Data has been retrieved from google cloud!!";
}
@POST 
@Produces(MediaType.TEXT_PLAIN)
public String postMessages() {
	return "Hello Message data posted or inserted into the google cloud!!";
	//Database connection code will be written here 
	//Insertion of data code will be written here
}
}
