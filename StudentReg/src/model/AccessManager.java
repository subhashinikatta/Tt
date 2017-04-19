package model;
 
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
 
import dao.Access;
import dao.Database;
import sam.Student;
 
public class AccessManager
{
public ArrayList<Student> getAllUsersList() throws Exception
{
ArrayList<Student> studentList = new ArrayList<Student>();
Database db = new Database();
Connection con = db.getConnection();
Access access = new Access();
studentList = access.getStudent(con);
return studentList;
}
}