package programsDemo;

public class Arraymissingnum {
//1+2+3+4+5+7=22 
//1+2+3+4+5+6+7=28
	//28-22=6
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,7};
		int s=0;
		for(int i=0;i<arr.length;i++) {
			s=s+arr[i];//22
		}
		System.out.println(s);//22
		int j,s1=0;
		for( j=1;j<=7;j++) {
			s1=s1+j;
		}
		System.out.println(s1);
		
		System.out.println("Missing No is " + (s1-s));
	}

}
