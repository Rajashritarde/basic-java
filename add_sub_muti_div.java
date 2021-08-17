package practice;

import java.util.Scanner;

public class lab {
	public static void main(String[] args) {
		
	
	int a,b;
	int add,sub,mul ;
	float div;
	Scanner rj=new Scanner(System.in);
	System.out.println("Enter the number");
    a=rj.nextInt();
    b=rj.nextInt();
    
    add=a+b;
    sub=a-b;
    mul=a*b;
    div=a/b;
     System.out.println("add number"+add);
     System.out.println("sub number"+sub);
     System.out.println("mul number"+mul);
     System.out.println("div  number"+div);
	}
	

}
