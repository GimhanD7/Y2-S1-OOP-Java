package Q2;

import java.util.ArrayList;

public class GenericEmployeeDemo {
	public static void main(String[] args) {
		ArrayList<Student> engineers = new ArrayList<>();
		engineers.add(new Student("E8000",54));
		
		engineers.add(new Student("t1111", 12));
		engineers.add(new Student("E2222", 45));
		engineers.add(new Student( "E3333", 789));
		engineers.add(new Student("E4444", 435));
		
		ArrayList<Lecturer> managers = new ArrayList<>();
		managers.add(new Lecturer( "MGDSSSS", "sesf"));
		managers.add(new Lecturer("MG4444", "sesf"));
		managers.add(new Lecturer(" MG3333","sesf"));
		managers.add(new Lecturer( "1MG2222", "sesf"));
		managers.add(new Lecturer( "MG1111", "sesf"));
		
		GenaricPerson genericEmployee = new GenaricPerson();
		genericEmployee.displayElement(managers);
		genericEmployee.displayElement(engineers);
}
}
