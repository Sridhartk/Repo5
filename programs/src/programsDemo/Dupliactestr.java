package programsDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dupliactestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"java","Ruby","python","C","java"};
		int num[]= {100,200,300,400,500,100,200};
		for(int i=0;i<=num.length;i++)
		{
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==(num[j]))
				{
					System.out.println("Duplicate " +num[i]);
					
				}
		}
		}
		//2nd method
		Set<String> item=new HashSet<>();
		for(String store:name) {
			if(item.add(store)==false) {
				System.out.println(" duplicate " + store);
			}
		}
		
		
		
	}

}
