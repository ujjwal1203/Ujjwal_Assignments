package ujjwaln;

public class constructor {

	public static void main(String[] args) {
		new student(2,"dd");
		
		new student(28);

	}

}

 class student
{
	student(int a,String name)
	{
		System.out.println("roll number- "+a+"   name= "+name);
	}
	
	student(int a)
	{
		System.out.println("roll number- "+a+"   name= Unknown ");
	}
	
	
	
	
	
	
	
	
	
	
}