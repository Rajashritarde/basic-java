package practice;

import java.util.Scanner;

public class area {
	public  static void main (String[] args)
	{
		int a,b,l ,p,x;
		Scanner rj=new Scanner(System.in);
		System.out.println("Enter the radius");
		a=rj.nextInt();
		p=a*a;
		System.out.println("area of circle " + p);
		System.out.println("Enter the length and breadth");
		a=rj.nextInt();
		b=rj.nextInt();
		x=2*(a+b);
		System.out.println("area of paramiter " + x);	
		rj.close();
	}
	

}
