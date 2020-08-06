package first;
import java.util.Scanner;
public class StudentEducationalDetails 
{
	int roll_no,average_marks,attendence;
	Scanner s=new Scanner(System.in);
	public void in()
	{
	System.out.println("Enter Student roll number");
	roll_no=s.nextInt();
	System.out.println("Enter Student average marks");
	average_marks=s.nextInt();
	System.out.println("Enter Student Attendence percentage like 95%=90");
	attendence=s.nextInt();
	}
	public void educational_Details()
	{
		System.out.println("_ _STUDENT EDUCATIONAL DETAILS_ _");
		System.out.println("Roll number of the Student "+roll_no);
		System.out.println("Average marks of Student= "+average_marks);
		System.out.println("Attendence of student= "+attendence+"%");
	}
}
