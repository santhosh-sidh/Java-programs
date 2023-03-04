import java.util.*;
public class Grade{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter your Mark:");
int mark = input.nextInt();

	if(mark<35){
	System.out.println("Grade D");
	  } else if(mark>=35&mark<=60){
	System.out.println("Grade C");
	}else if(mark>60&mark<=85){
	System.out.println("Grade B");
	}else if(mark>85&mark<=100){
	System.out.println("Grade A");
	}
else{
	System.out.println("Invalid");
	}
}
}
