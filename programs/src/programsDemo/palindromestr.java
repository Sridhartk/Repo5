package programsDemo;

public class palindromestr {

	public static void main(String[] args) {
		/*String str="lol";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)		{
			rev=rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Nhaata palindrome");
		}
		*/
	int n=232,rev,temp,s=0;
	temp=n;
	while(n>0)
	{
		rev=n%10;
		s=(s*10)+rev;
		n=n/10;
	}
  if(n==temp)
  {
	  System.out.println("palindrome");
  }
  else
  {
	  System.out.println("nhaaa");
  }
	}

}
