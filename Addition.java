import java.lang.*;
import java.util.*;

class Addition
{
	public static void main(String Arr[])
	{
		int iNo1 = 0,iNo2 = 0,iSum = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		iNo1 = sobj.nextInt();
		
		System.out.print("Enter Second Number : ");
		iNo2 = sobj.nextInt();
		
		iSum = iNo1 + iNo2;
		
		System.out.print("Addition of Given Numbers are => "+iSum);
		
	}
}
