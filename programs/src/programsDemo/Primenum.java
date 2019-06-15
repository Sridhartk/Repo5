package programsDemo;

public class Primenum {
	public static boolean prime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else
			for(int i=2;i<n;i++)
			{
				if(n % i==0)
				{
				return false;
				}
				}
		return true;
	}
	
	public static void getprimenum(int n)
	{
		System.out.println("PrimeNumber upto" +n);
		System.out.println();
		for(int i=2;i<=n;i++)
		{
			if(prime(i))
				System.out.println(i+ " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenum p=new Primenum();
		System.out.println(p.prime(2));
		System.out.println(p.prime(3));
		System.out.println(p.prime(4));
		System.out.println(p.prime(0));
		System.out.println(p.prime(1));
		Primenum.getprimenum(7);
		Primenum.getprimenum(20);
		Primenum.getprimenum(50);
	}

}
