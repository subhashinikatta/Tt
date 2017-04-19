package webService;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
 
import model.AccessManager;
import sam.Student;
 
@Path("/login")
public class LoginService {
 
@POST
 @Path("/dologin")
 @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
 public String login(@FormParam("username") String username,
 @FormParam("password") String password) {
 
return getAllUsersList(username, password);
 
}
 
public String getAllUsersList(String username,String password)
 {
 String userListData = null;
 try 
 {
 ArrayList<Student> studentSList = null;
 AccessManager AccessManager= new AccessManager();
 studentSList = AccessManager.getAllUsersList();
 for (Student students : studentSList) {
 if(students.getusername().equals(username))
 {
 if(students.getpassword().equals(password))
 {
 return "Logged in Employee:"+username;
 }
 }
 }
 
} catch (Exception e)
 {
 System.out.println("error");
 }
 return "You are not a Valid User";
 }
}