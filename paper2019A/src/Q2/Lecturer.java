package Q2;

public class Lecturer implements IPerson{
	String employeeID;
	String department;
	
	

	public Lecturer(String employeeID, String department) {
		super();
		this.employeeID = employeeID;
		this.department = department;
	}



	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Lecture = "+this.employeeID+"department = "+this.department);
		
		return null;
	}

}
