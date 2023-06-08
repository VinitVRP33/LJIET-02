
import java.util.*;

class student
{
	int marks;
	int rollNo;
	String name;
	
	public void setInfo()
	{
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Marks : ");
		this.marks = sc.nextInt();

		System.out.println("Enter the Roll No. : ");
		this.rollNo = sc.nextInt();
		
		System.out.println("Enter the Name : ");
		this.name = sc.next();
		System.out.println();
	}
	
	public void getInfo()
	{
        System.out.println("Marks : "+marks);
		System.out.println("Roll No. : "+rollNo);
		System.out.println("Name : "+name);
	}
}

public class arrayOfObject1 {
	
	public static void main (String args[])
	{
		student s1[] = new student[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Info of student "+i);
			s1[i]=new student();
			s1[i].setInfo();	
		}
		
		System.out.println("Information of the studens");
		System.out.println();
		for(int i=0;i<5;i++)
		{
			System.out.println("Info of student "+i);
			s1[i].getInfo();
			System.out.println();
		}
		
	}

}