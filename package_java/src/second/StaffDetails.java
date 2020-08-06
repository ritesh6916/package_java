package second;
import java.util.Scanner;
public class StaffDetails 
{
	String name,designation,position;
	Scanner s=new Scanner(System.in);
	public void in()
	{
		System.out.println("Enter Staff name");
		name=s.nextLine();
		System.out.println("Enter Staff designation");
		designation=s.nextLine();
		System.out.println("Enter Staff position");
		position=s.nextLine();
	}
	public void staff_Details()
	{
		System.out.println("_ _STAFF DETAILS_ _");
		System.out.println("Name of staff: "+name);
		System.out.println("Designation= "+designation);
		System.out.println(name+"'s"+"position is "+position);
	}

}
