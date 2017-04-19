package sam;
public class DaoPatternDemo {
	   public static void main(String[] args) {
	      StudentDao studentDao = new StudentDaoImpl();

	      //print all students
	      for (Student student : studentDao.getAllStudents()) {
	         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	      }


	      //update student
	      Student student =studentDao.getAllStudents().get(2);
	      student.setName("Subhashini");
	      studentDao.updateStudent(student);

	      //get the student
	      studentDao.getStudent(2);
	      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
	   
	      //delete student
	      Student student1 =studentDao.getAllStudents().get(1);
	      student1.setName(" ");
	      studentDao.deleteStudent(student1);
	   
	   }
	}