import first.*;
import second.StaffDetails;
public class Main {
	public static void main(String[] args)
	{
		StudentEducationalDetails esd=new StudentEducationalDetails();
		StudentPersonalDetails psd=new StudentPersonalDetails();
		StaffDetails sd=new StaffDetails();
		psd.in();
		esd.in();
		sd.in();
		psd.personal_Details();
		esd.educational_Details();
		sd.staff_Details();
	}

}
