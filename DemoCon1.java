import java.util.Scanner;

class StuContact
{
	String mid;
	long phno;
	StuContact(String mid,long phno)
	{
		this.mid=mid;
		this.phno=phno;
	}
	void display1()
	{
		System.out.println("*****student contact*****");
		System.out.println("The name of student-mailid is:="+mid);
		System.out.println("The name of student-phnno is:="+phno);
		
	}
}
class DemoCon1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:-");
		String v1 = sc.nextLine();
		System.out.println("Enter your rollno:-");
		String v2 = sc.nextLine();
		System.out.println("Enter your branch:-");
		String v3 = sc.nextLine();
		System.out.println("Enter your mail:-");
		String v4 = sc.nextLine();
		System.out.println("Enter your phnno:-");
		long v5 = sc.nextLong();

		StuData ob = new StuData(v1,v2,v3);
		ob.display();

		StuContact st = new StuContact(v4,v5);
		st.display1();
	}
}
