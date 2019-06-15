package programsDemo;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String-int
		String s="1234";
		System.out.println(s);
		int i=Integer.parseInt(s);
		System.out.println(i);
		
		//string - double
		String s1="24.35";
		System.out.println(Double.parseDouble(s1));
		
		//String - char
		String s2="abc";
		System.out.println(s2.toCharArray());
		
		//int-String
		int p=1234;
		System.out.println(String.valueOf(p));
		
		//double-String
		double d=23.43;
		System.out.println(String.valueOf(d));
	
		//char - string
		char c[]= {'H','a','i'};
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(c));

				}

}
