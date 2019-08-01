package Bidirectional;

import java.util.List;

public class Student {
	int ID;
	String Name;
	String Email;
	String Contact;
	
	public Student(int ID, String Name, String Email)
	{
		this.ID = ID;
		this.Name = Name;
		this.Email = Email;
	}
	void Registration()
	{
		
	}
	
	public void Supervision(List<Teacher> Teachers)
	{
		System.out.println(this.Name+" is supervised by the following Teachers: ");
		for(Teacher aTeacher : Teachers)
		{
			System.out.println(aTeacher.Name);
		}
	}
}
