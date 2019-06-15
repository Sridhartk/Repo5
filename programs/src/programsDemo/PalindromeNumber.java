package programsDemo;

public class PalindromeNumber {
	
	public  void Palindrome(int num)
	{
		int t=num,sum=0,r=0;
		
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum)
		{
		System.out.println("Palindrome is " +sum);}
		else {
			System.out.println("not a palindrome " +sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber p=new PalindromeNumber();
		p.Palindrome(1234);
		p.Palindrome(121);
		p.Palindrome(78987);
		p.Palindrome(15472869);
	}

}
