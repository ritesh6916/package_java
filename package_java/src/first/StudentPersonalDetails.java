package first;
import java.util.Scanner;
public class StudentPersonalDetails 
{
	String name,address,f_name,m_name;
	byte age;
	String sex;
	Scanner s=new Scanner(System.in);
	public void in()
	{
		System.out.println("Enter Student name");
		name=s.nextLine();
		System.out.println("Enter Student fathers name");
		f_name=s.nextLine();
		System.out.println("Enter Student mothers name");
		m_name=s.nextLine();
		System.out.println("Enter Student Address");
		address=s.nextLine();
		System.out.println("Enter Student age");
		age=s.nextByte();
		System.out.println("Enter Sex(m/f)");
		sex=s.next();
	}
	public void personal_Details()
	{
		System.out.println("_ _STUDENT PERSONAL DETAILS_ _");
		System.out.println("Name of Student is : "+name);
		System.out.println("age = "+age);
		System.out.println("Student is "+sex);
		System.out.println("Address of the Student is: "+address);
		System.out.println("father's name: "+f_name);
		System.out.println("mother's name: "+m_name);
	}

}
