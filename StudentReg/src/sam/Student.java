package sam;

public class Student
{
private String FirstName;
private String LastName;
private String Email;
private String username;
private String password; 
private String confirmpassword;

public Student()
{
 
}
 
public Student(String FirstName,String LastName,String Email,String username,String password,String confirmpassword)
{
super();
this.FirstName = FirstName;
this.LastName = LastName;
this.Email = Email;
this.username = username;
this.password = password;
this.confirmpassword = confirmpassword;
}
 
public String getFirstName()
{
return FirstName;
}
 
public void setFirstName(String FirstName)
{
this.FirstName = FirstName;
}

 
public String getLastName()
{
return LastName;
}
 
public void setLastName(String LastName)
{
this.LastName = LastName;
}


public String getEmail()
{
return Email;
}

public void setEmail(String Email)
{
this.Email = Email;
}
public String getusername()
{
return username;
}
 
public void setusername(String username)
{
this.username = username;
}
 
public String getpassword()
{
return password;
}
 
public void setpassword(String password)
{
this.password = password;
}
 
public String getconfirmpassword()
{
return confirmpassword;
}
 
public void setconfirmpassword(String confirmpassword)
{
this.confirmpassword = confirmpassword;
}
 

 
}