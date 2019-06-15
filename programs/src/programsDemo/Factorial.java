package programsDemo;

public class Factorial {

	public int factorial(int n)
	{
		int fact=1;
		if(n==0)
		{
			return 1;
		}
		else {
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;}
	}
	
	//2nd method recursive function a function calling itself
	public int fact(int n)
	{
		if(n==0)
		return 1;
		else
		return (n*fact(n-1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f=new Factorial();
		System.out.println(f.factorial(5));
		System.out.println(f.factorial(0));
		System.out.println(f.factorial(1));
		System.out.println(f.fact(4));
	}
	

}
