import java.util.*;
class MethodOverloading{


		public void m1(int a,int b){
			System.out.println(a+b);
		}

		public void m1(int c,String d){
			System.out.println(c+" "+d);
		}
		public void m1(int e,int f,int g){
			System.out.println(e+f+g);
		}


		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value");
			int a = sc.nextInt();
		
			System.out.println("Enter value");
			int b = sc.nextInt();

			System.out.println("Enter value");
			int c = sc.nextInt();

			System.out.println("Enter value");
			int g = sc.nextInt();

			System.out.println("Enter value");
			int e = sc.nextInt();

			System.out.println("Enter value");
			int f = sc.nextInt();

			System.out.println("Enter string ");
			String d = sc.nextLine();
		
			MethodOverloading obj = new MethodOverloading();
			obj.m1(a,b);
			obj.m1(c,d);
			obj.m1(e,f,g);
		}
}