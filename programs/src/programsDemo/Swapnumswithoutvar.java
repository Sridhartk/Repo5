package programsDemo;

public class Swapnumswithoutvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=20;
		
		System.out.println("Before Swapping "+x+","+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping" +x+"," +y);
		//2nd method
		x=x * y;//10*20=200
		y=x / y;//200/20=10
		x=x / y;//200/10=20
		
		System.out.println("After Swapping" +x+"," +y);
	
		//3rd method
		
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println(x+" "+ y);
	}

}
