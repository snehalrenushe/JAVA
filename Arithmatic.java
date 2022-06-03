import java.lang.*;

class Arith
{
	public int iNo1;
	public int iNo2;
	
	public Arith()
	{
		this.iNo1 = 0;
		this.iNo2 = 0;
	}
	
	public Arith(int N1,int N2)
	{
		this.iNo1 = N1;
		this.iNo2 = N2;
	}
	
	public int Add()
	{
		int iRet = 0;
		
		iRet = this.iNo1 + this.iNo2;
		
		return iRet;
	}
	
	public int Sub()
	{
		int iRet = 0;
		
		iRet = this.iNo1 - this.iNo2;
		
		return iRet;
	}      

	public int Mult()
	{
		int iRet = 0;
		
		iRet = this.iNo1 * this.iNo2;
		
		return iRet;
	}
	
	public int Div()
	{
		int iRet = 0;
		
		iRet = this.iNo1 / this.iNo2;
		
		return iRet;
	}
	
	public int Remain()
	{
		int iRet = 0;
		
		iRet = this.iNo2 % this.iNo1;
		
		return iRet;
	}
	
}

class Arithmatic
{
	public static void main(String Arr[])
	{
		Arith Obj1;
	
		Obj1 = new Arith();
		
		Arith Obj2;
		
		Obj2 = new Arith(11,21);
		
		int iRet = 0;
		iRet = Obj2.Add();
		System.out.println("Addition of given numbers are :"+iRet);
		
		iRet = Obj2.Sub();
		System.out.println("Substraction of given numbers are :"+iRet);
		
		iRet = Obj2.Mult();
		System.out.println("Multiplication of given numbers are :"+iRet);
		
		iRet = Obj2.Div();
		System.out.println("Division of given numbers are :"+iRet);
		
		iRet = Obj2.Remain();
		System.out.println("Remainder of given numbers are :"+iRet);
	}		
}