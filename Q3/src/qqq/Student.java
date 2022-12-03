package qqq;
import java.util.ArrayList;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private ArrayList<Float> marks=new ArrayList<>();
	private int noOfSubjects;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public float inputMarks(int index) throws MarksException{
		Scanner se=new Scanner(System.in);
		System.out.print("Enter Mark : ");
		float i=se.nextFloat();
		marks.add(i);
		
		
		if(marks.get(index)>=0 && marks.get(index)<=100) {
			return marks.get(index);
		}
		else {
			marks.remove(index);
			throw new MarksException(marks.get(index));
			
		}
		
		
	}
	public void input() {
		Scanner se = new Scanner(System.in);
		System.out.print("Enter on of subject : ");
		noOfSubjects =se.nextInt();
		
		try {
			for (int i = 0; i < noOfSubjects; i++) {
				inputMarks(i);
				}
			}
		catch(MarksException e){
					e.printStackTrace();
			}
		
	}
	
	public float getAverage() {
		float total = 0.0f;
		int count =0;
		float avarage=0;
		
		for (Float t : marks) {
			total=total+t;
			count++;
		}

		
		try {
			avarage=total/count;
		}
			catch(Exception e) {
				e.printStackTrace();
			}
	return avarage;
}}
