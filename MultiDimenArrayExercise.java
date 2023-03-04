import java.util.*;
public class MultiDimenArrayExercise{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Table Index: ");
int table = sc.nextInt();
System.out.println("Enter Row Index: ");
int row = sc.nextInt();
System.out.println("Enter Column Index: ");
int column =sc.nextInt();
	int a[][][] = new int[table][row][column];
	for(int i=0; i<table; i++){
	for(int j=0; j<row; j++){
		for(int k=0;k<column;k++){
			System.out.println("Enter Value of a[" + i + "] [" + j + "] [" + k +"]");
			a[i][j][k]=sc.nextInt();
			}
		}
	}
	for(int i=0; i<table; i++){
	for(int j=0; j<row; j++){
		for(int k=0;k<column;k++){ 
			System.out.print(a[i][j][k] + " ");
		} 
		System.out.print("\t");
		}
		
	}
	
}
}
