import java.lang.*;
import java.util.*;

class Swapping
{
	public static void main(String Arr[])
	{
		int iNo1 = 0,iNo2 = 0;
		
		Scanner sobj1 = new Scanner(System.in);
		
		System.out.print("Enter Two Numbers for Swapping : ");
		iNo1 = sobj1.nextInt();
		iNo2 = sobj1.nextInt();
	
		iNo1 = iNo1 + iNo2;
		iNo2 = iNo1 - iNo2;
		iNo1 = iNo1 - iNo2;
		
		System.out.print("After Swapping : "+ iNo1 + "	" + iNo2);
	}
}
