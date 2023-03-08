import java.util.*;
class User1{
	 int a,b;

	public  void addition(int a , int b){
		System.out.println("Addition Value of A :" + (a+b));
		System.out.println("Multiplication Value of B :" + (a*b));
		
	}
}


	 


	class UserValue1{
	public static void main(String args[]){
	
	User1 obj = new User1();
	Scanner sc = new Scanner(System.in);
	System.out.print(" Value A :");
	obj.a = sc.nextInt();
	System.out.print(" Value B :");
	obj.b = sc.nextInt();
	obj.addition(obj.a,obj.b);
	}
}

