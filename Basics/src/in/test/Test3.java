package in.test;
class Student{
	int studentId;
	String studentName;
	public void getStudentDetails() {
		System.out.println("student data");
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student s1 = new Student();
 Class c = s1.getClass();
 System.out.println(c);
	}

}
//git is a version control 