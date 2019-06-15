package programsDemo;

public class Swapstrwithoutthirdvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello";
		String r="World";
		
		System.out.println(s);
		System.out.println(r);
		
		s=s+r;
		r=s.substring(0, s.length()-r.length());

		s=s.substring(r.length());
		
		System.out.println(s);
		System.out.println(r);
	}

}
