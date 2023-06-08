

import java.util.Scanner;

class employee
{   
    String empName;
	int empId;
	int salary;
	
    Scanner sc = new Scanner (System.in);
	
	public void setData()
	{
        System.out.println("Enter the employee name : ");
		this.empName = sc.next();
		
		System.out.println("Enter the employee id : ");
		this.empId = sc.nextInt();
		System.out.println("Enter the salary  : ");
		this.salary = sc.nextInt();
		
		
	}
	
	public void getData()
	{
        System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empId);
		System.out.println("Salary : "+salary);
		
	}
}

public class arrayOfObjects2 {
	
	private static Scanner n;

	public static void main(String args[])
	{
		int count = 0;
		String x;
		n = new Scanner (System.in);
		
		employee e1[] = new employee[5];
		
		int i=0;
		do
		{
			System.out.println("Do want to add employees  ? ( Yes / No )");
			x = n.next();
			if(x.equals("Yes") || x.equals("yes") || x.equals("y") || x.equals("Y") )
			{
				
				System.out.println("\nEnter Data of employee "+i);
				e1[i]=new employee();
				e1[i].setData();	
				count++;
			}
			else
			{
				break;
			}
			i++;
		}while(i<5);
		
		
		System.out.println("\nTotal number of emloyees are : "+count+"\n");
		
		
		if(count>0)
		{
			System.out.println("--- Details of the employees ---");
			System.out.println();
			for(i=0;i<count;i++)
			{
				System.out.println("Details of employee "+(i+1));
				e1[i].getData();
				System.out.println();
			}
		}
	}

}
