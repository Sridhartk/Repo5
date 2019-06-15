package programsDemo;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345,r=0;
		
		while(n!=0) {
			r=r*10+n%10;
			n=n/10;
		}
		System.out.println(r);
		
		//2 method
		
		int n1=123456;
		System.out.println(new StringBuffer(String.valueOf(n1)).reverse());
	}

}
