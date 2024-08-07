import java.util.Scanner;
class StuData
{
	String rno,name,branch;
	StuData( String name ,String rno,String branch)
	{
		this.name=name;
		this.rno=rno;
		this.branch=branch;
	}
	void display()
	{
		System.out.println("*****student details*****");
		System.out.println("The name of student-name is:="+name);
		System.out.println("The name of student-rollno is:="+rno);
		System.out.println("The name of student-branch is:="+branch);
	}
}
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
