package programsDemo;

public class Stringsplcharreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="!@#$%AQWERT12345^&*()";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}
	

}
