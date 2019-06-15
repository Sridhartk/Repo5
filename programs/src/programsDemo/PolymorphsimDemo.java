package programsDemo;


	

public class PolymorphsimDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting ---compiletime polymorphsim
		person p=new School();
		p.son();
		
		//downcasting --runtime polymorphsim CTE ClassCastException
//		School s=(School) new person();
//		s.student();
//		
		School p1=new School();
		p1.student();
		
	}

}
