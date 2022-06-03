import java.lang.*;
import java.util.*; 

class Check_Upper_Lower
{
	public static void main(String Arr[])
	{
		char ch = '\0';
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("To Check entered Character is Uppercase ,Lowercase or Digit : ");
		ch = sobj.next().charAt(0);
	
		if(ch >= 65 && ch <= 97)
		{
			System.out.println(ch + " is Uppercase.");
		}
		else if(ch >= 97 && ch <= 128)
		{
			System.out.println(ch + " is Lowercase.");
		}
		else if(ch >= 48 && ch<= 57)
		{
			System.out.println(ch + " is Digit.");
		}
		else
		{
			System.out.println(ch + " is Special Character.");
		}
	}
}
