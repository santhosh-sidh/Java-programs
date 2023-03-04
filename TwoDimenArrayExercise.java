 mport java.util.*;
public class TwoDimenArrayExercise{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Row Index: ");
int row = sc.nextInt();
System.out.println("Enter Column Index: ");
int column =sc.nextInt();
	int[][] a = new int[row][column];
	for(int i=0; i<row; i++){
		for(int j=0;j<column;j++){
			System.out.println("Enter Value of a[" + i + "] [" + j + "]");
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0; i<row; i++){
		for(int j=0;j<column;j++){
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
		}	
}
}
