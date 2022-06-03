import java.lang.*;
import java.util.*;

class Maximum_From_Two
{
	public static void main(String Arr[])
	{
		int iNo1 = 0,iNo2 = 0;
		
		Scanner sobj1 = new Scanner(System.in);
		
		System.out.print("Enter Two Numbers : ");
		iNo1 = sobj1.nextInt();
		iNo2 = sobj1.nextInt();
	
		if(iNo1 == iNo2)
		{
			System.out.println("Given numbers are Equal");
		}
		else if(iNo1 > iNo2)
		{
			System.out.println(iNo1 + " is Greater than " + iNo2);
		}
		else
		{
			System.out.println(iNo2 + " is Greater than " + iNo1);
		}
	}
}
