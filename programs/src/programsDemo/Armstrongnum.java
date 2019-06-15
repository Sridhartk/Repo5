package programsDemo;

import java.util.Scanner;

public class Armstrongnum {
	public void isArmstrong(int n)
	{
		int t=n,cube=0,r;
		while(n>0) {
			r=n%10;
			n=n/10;
			cube=cube+(r*r*r);
		}
		if(t==cube)
		{
			System.out.println("Armstrong number " + cube);
		}
		else
		{
			System.out.println("Just a number " +t);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		Armstrongnum a=new Armstrongnum();
		a.isArmstrong(n);
	}

}
