package programsDemo;

public class enpasulationDemo {
 
	 private int age;
	 public void setage(int age)
	 {
		 this.age=age;
	 }
	 public int getage()
	 {
		 return age;
	 }
	 
	 public static void main(String[] args) {
		enpasulationDemo e=new enpasulationDemo();
		e.setage(22);
		System.out.println(e.getage());
	}
 }

