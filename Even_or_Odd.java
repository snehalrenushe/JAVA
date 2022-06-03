import java.lang.*;
import java.util.*; 

class Even_or_Odd
{
	public static void main(String Arr[])
	{
		int iNo = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter a Number to Check Even or Odd: ");
		iNo = sobj.nextInt();
	
		if(iNo % 2 == 0)
		{
			System.out.print(iNo+" is Even Number.");
		}
		else if(iNo % 2 == 1)
		{
			System.out.print(iNo+" is Odd Number.");
		}
		else
		{
			System.out.print("Invalid Number");
		}
		
	}
}


