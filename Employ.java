import java.util.Scanner;

public class Employ{
	int id;
	String name;
	Sreing cname;
	static Scanner s= new Scanner(System.in);
	
	void input()
	{
	System.out.println("Please name of Employee: ");	
	name=s.next();
	System.out.println("Please Id number of Employee: ");
	s=new Scanner(System.in);
	System.out.println("Please name of Company: ");	
	cname=s.next();

	id=s.nextInt();
	}
	
	void show()
	{
		System.out.println("Name: "+ name);
		System.out.println("Employee Id: "+ id);
		System.out.println("Company: "+ cname);
	}

	int Ret_ID()
	{
		return id;
	}

	public static void main(String[] args){
		Employ E1= new Employ();
		int id2, id3;
		
		E1.input();
		id3=E1.Ret_ID();

		System.out.println("\nPlease enter an Employee ID number: ");
		s=new Scanner(System.in);
		id2=s.nextInt();
		
		if(id2==id3)
		{
			E1.show();
		}

		else
			System.out.println("No employee with ID number " + id3);
	}
}