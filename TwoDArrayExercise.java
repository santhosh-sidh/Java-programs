import java.util.*;
public class TwoDArrayExercise{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
int column =sc.nextInt();
	int[][] a = new int[row][column];
	for(int i=0; i<a.length; i++){
		for(int j=0;j<a.length;j++){
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0; i<a.length; i++){
		for(int j=0;j<a.length;j++){
			System.out.print(a[i][j] + " ");
		}
		System.out.print();
		}	
}
}
