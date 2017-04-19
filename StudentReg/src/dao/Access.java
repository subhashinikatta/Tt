package dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 
import sam.Student;
 
public class Access
{
public ArrayList<Student> getStudent(Connection con) throws SQLException
{
ArrayList<Student> studentSList = new ArrayList<Student>();
PreparedStatement stmt = con.prepareStatement("SELECT * FROM Employee");
ResultSet rs = stmt.executeQuery();
try
{
while(rs.next())
{
Student studentObj = new Student();
studentObj.setFirstName(rs.getString("FirstName"));
studentObj.setLastName(rs.getString("LastName"));
studentObj.setEmail(rs.getString("Email"));
studentObj.setusername(rs.getString("username"));
studentObj.setpassword(rs.getString("password"));
studentObj.setconfirmpassword(rs.getString("confirmpassword"));
studentSList.add(studentObj);
}
} catch (SQLException e)
{
e.printStackTrace();
}
return studentSList;
 
}
}