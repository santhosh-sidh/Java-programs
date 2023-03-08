import java.util.*;
class UserValue{
	static int a,b;

	public static void addition(int a , int b){
		System.out.println("Addition Value of A :" + (a+b));
		System.out.println("Multiplication Value of B :" + (a*b));
		
	}



	 


	
	public static void main(String args[]){
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print(" Value A :");
	a = sc.nextInt();
	System.out.print(" Value B :");
	b = sc.nextInt();
	addition(a,b);
	}

