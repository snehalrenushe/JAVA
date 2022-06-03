import java.lang.*;
import java.util.*;

class Prime
{
	public static void main(String Arr[])
	{
		int iNo = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter a Number to Check Prime Or Not: ");
		iNo = sobj.nextInt();
	
		if(iNo % 2 != 0)
		{
			System.out.print(iNo+" is Prime Number.");
		}
		else
		{
			System.out.print(iNo+" is not a Prime Number.");
		}		
	}
}
