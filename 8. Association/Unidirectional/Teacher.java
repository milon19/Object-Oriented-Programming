package Unidirectional;

import java.util.List;

public class Teacher {
	
	int ID;
	String Name;
	String Email;
	String Contact;
	String Designation;
	
	public Teacher(int ID, String Name, String Email)
	{
		this.ID = ID;
		this.Name = Name;
		this.Email = Email;
	}
	void Registration()
	{
		
	}
	public void Teach(List<Student> Students)
	{
		System.out.println(this.Name+" is teaching the following Students: ");
		for(Student aStudent : Students)
		{
			System.out.println(aStudent.Name);
		}
	}

}
