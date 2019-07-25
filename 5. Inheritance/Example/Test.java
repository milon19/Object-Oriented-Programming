
public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		
		//these from Student Class
		s.id = "171-15-1472"; 
		s.email = "milon@dd.com";
		
		
		//these from Preson Class
		s.name = "milon";
		s.add  = "Dhaka";
		s.age = 23;
		
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.email);
		System.out.println(s.add);
		System.out.println(s.age);

	}

}
