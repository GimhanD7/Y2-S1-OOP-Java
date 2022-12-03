package Q2;

public class Student implements IPerson{
	String studentID;
	int grade;
	public Student(String studentID, int grade) {
		super();
		this.studentID = studentID;
		this.grade = grade;
	}
	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Student = "+this.studentID+"Grade = "+this.grade);
		return null;
	}
	
	
}
