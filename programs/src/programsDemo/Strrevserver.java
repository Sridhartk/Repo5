package programsDemo;

public class Strrevserver {
	public static void main(String[] args) {
		String s="Selenium",rev="";
		
		int len=s.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);//muineleS
			
		}
		System.out.println(rev);

	   // 2 method
		StringBuffer str=new StringBuffer(s);
		StringBuffer str1 = str.append(" Testing");
		System.out.println(str1.indexOf("i", 8));
		System.out.println(str1.lastIndexOf("n"));
		System.out.println(str1.replace(0, 8, "Automation"));
		System.out.println(str1.reverse());
		
	}
	

}
