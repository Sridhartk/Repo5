package programsDemo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestSamllestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {-10,20,30,555,-877,5,0,1,556};
		
		int largest=numbers[0];
		int samllest=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
			if(numbers[i]<samllest)
			{
				samllest=numbers[i];
			}
		}
		System.out.println("Array elements are " +Arrays.toString(numbers));
		System.out.println("Largest numbers are" +largest);
		System.out.println("Smallest numbers are" +samllest);
	}

}
