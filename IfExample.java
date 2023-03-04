import java.util.*;
public class IfExample{
public static void main(String[] args){
Scanner password = new Scanner(System.in);
System.out.println("Enter your password:");
int name = 15;
int a = password.nextInt();
if(a == name){
System.out.println("condition 1 satisfied");
         if(a == 14){
	System.out.println("condition 2 satisfied");
	}else if (a != 14){
	System.out.println("condition 3 satisfied");
	}else{
	System.out.println("Both conditions not satisfied");
	}
}else{

	System.out.println("All conditions not satisfied");
}
}
}
