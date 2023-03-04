import java.util.*;
	class SwapThreeValues{
		public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value A :");
		int a = input.nextInt();
		System.out.print("Enter value B :");
		int b = input.nextInt();
		System.out.print("Enter value C :");
		int c = input.nextInt();
		
		c = a;
		a = b;
		b = c;
		System.out.print("The swapped value of A :" + a );
		System.out.print("The swapped value of B :" + b );
		System.out.print("The swapped value of C :" + c );
	}
}