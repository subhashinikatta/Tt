package webService;
import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import model.AccessManager;
 
import sam.Student;
 
@Path("/register")
public class RegService
{
@POST
@Path("/doregister")
@Produces("application/json")
public Response registerUserInfo(@FormParam("FirstName") String FirstName,@FormParam("LastName") String LastName,@FormParam("Email") String Email,
        @FormParam("username") String username, @FormParam("password") String password, @FormParam("confirmpassword") String confirmpassword){

String response = "Successfully added user details, FirstName: "+
FirstName+" and LastName: "+LastName+" and Email: "+Email+" and username: "+username+" and password: "+password+" and confirmpassword: "+confirmpassword;
return Response.status(200).entity(response).build();
} 
public String students()
{
String students = null;

try
{
	ArrayList<Student> studentList = new ArrayList<Student>();
	studentList = new AccessManager().getAllUsersList();
Gson gson = new Gson();
students = gson.toJson(studentList);
} catch (Exception e)
{
e.printStackTrace();
}
return students;
}
}