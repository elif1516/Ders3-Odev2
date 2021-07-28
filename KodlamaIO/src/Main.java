
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student student1=new Student();
	student1.setUserId(1);
	student1.setUserName("elif");
	student1.setUserPassword("123456");
	student1.setStudentNo("3873");
	
	Instructor instructor1=new Instructor();
	instructor1.setUserId(2);
	instructor1.setUserName("engin");
	instructor1.setUserPassword("2589322");
	instructor1.setInstructorNo("7328");
	
	InstructorManager instructorManager1=new InstructorManager();
	instructorManager1.createAccount(instructor1);
	StudentManager studentManager1=new StudentManager();
	studentManager1.createAccount(student1);
	
	}

}
