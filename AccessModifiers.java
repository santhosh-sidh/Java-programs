import java.util.*;

public class AccessModifiers{

		    

			public int addition(){
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter A Value: ");
				int a = sc.nextInt();
				System.out.println("Enter B Value: ");
				int b = sc.nextInt();
				int c = a+b;
				System.out.println("Addition of " + a + "and " + b + " is " + c);

				return c;

			}

			
			public String emailCheck(){	
       				Scanner sc = new Scanner(System.in);
		   		String email, result;
    			System.out.println("Enter your email: ");
				email = sc.nextLine();

				if(email.contains("@gmail.com")){					
					result = "Given " + email + " is an email";
					System.out.println(result);
				} else {
					result = "Given " + email + " is not an email, please check";
					System.out.println(result);
				}
				return result;
			}


			public static void main(String args[]){

				AccessModifiers am = new AccessModifiers();
				am.addition();
				am.emailCheck();

				

			}

}