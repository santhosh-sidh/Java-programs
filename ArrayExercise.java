import java.util.*;
public class ArrayExercise{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Give Index Value Of Int Array : ");  
int indexValue = sc.nextInt(); //getting value of index/subscript

String[] a = new String[indexValue];
System.out.println("I will take Only " + indexValue + " values :");

   for(int i = 0; i<indexValue;i++){	
	a[i] = sc.nextLine();
   }

   System.out.println("Given Array Elements Are: ");
   for(int j =0; j<indexValue; j++){
	System.out.println(a[j]);
   }

}
}
