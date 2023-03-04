import java.util.*;
	class SimpleCalc{
		public static void main(String args[]){
			System.out.println("Choose an operator: +,-,*,/,%");
			Scanner sc = new Scanner(System.in);
			int result;
			char  operator = sc.next().charAt(0);
			System.out.println("Enter A value :");
			int a = sc.nextInt();
			System.out.println("Enter B value :");
			int b = sc.nextInt();
			
			switch(operator){
				case '+':
					result = a+b;
					System.out.println(a + "+" + b +"=" + result);
				break;
				
				case '-':
					result = a-b;
					System.out.println(a + "-" + b +"=" + result);
				break;

				case '*':
					result = a*b;
					System.out.println(a + "*" + b +"=" + result);
				break;

				case '/':
					result = a/b;
					System.out.println(a + "/" + b +"=" + result);
				break;
				
				case '%':
					result = a+b;
					System.out.println(a + "%" + b +"=" + result);
				break;

				default:
					System.out.println("Invalid operator!");
				break;
			}


		}
	}