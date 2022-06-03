import java.lang.*;
import java.util.*;

class Calculator
{
	public static void main(String Arr[])
	{
		int iNo1 = 0,iNo2 = 0;
		char iRet = '\0';
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter any Operator You want to perform : ");
		System.out.println(" 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division");
		iRet = sobj.next().charAt(0);
		
		System.out.println("Enter two numbers for Calculate : ");
		iNo1 = sobj.nextInt();
		iNo2 = sobj.nextInt();
		
		int iAns = 0;
		switch(iRet)
		{
			case '1':
					iAns = iNo1 + iNo2;
					System.out.println(iAns);
					break;
			
			case '2':
					iAns = iNo1 - iNo2;
					System.out.println(iAns);
					break;
					
			case '3':
					iAns = iNo1 * iNo2;
					System.out.println(iAns);
					break;
					
			case '4':
					iAns = iNo1 / iNo2;
					System.out.println(iAns);
					break;
					
			default:
					System.out.println("Invalid Input !!! please Enter valid Operator...");
		}
	}
}