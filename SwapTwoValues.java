import java.util.*;
	class SwapTwoValues{
		public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value A :");
		int a = input.nextInt();
		System.out.print("Enter value B :");
		int b = input.nextInt();
		int c;

		a = a+b;
		b = a-b;
		a = a-b;

		System.out.print("The swapped value of A :" + a );
		System.out.print("The swapped value of B :" + b );
	}
}