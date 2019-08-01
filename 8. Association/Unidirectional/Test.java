package Unidirectional;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(1, "A", "a@mail.com");
		Student s2 = new Student(2, "B", "b@mail.com");
		Student s3 = new Student(3, "C", "c@mail.com");
		Student s4 = new Student(4, "D", "d@mail.com");
		
		List<Student> StudentGroup1 = new ArrayList<>();
		StudentGroup1.add(s1);
		StudentGroup1.add(s2);
		
		Teacher T1 = new Teacher(11, "TT", "tt@mail.com");
		T1.Teach(StudentGroup1);
		
		
		List<Student> StudentGroup2 = new ArrayList<>();
		StudentGroup2.add(s4);
		StudentGroup2.add(s3);
		
		Teacher T2 = new Teacher(22, "TT1", "tt1@mail.com");
		T2.Teach(StudentGroup2);
		

	}

}
