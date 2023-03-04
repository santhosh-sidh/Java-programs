import java.util.*;
public class VowelConsonant{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
char input = sc.next().charAt(0);

	
		switch(input){
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println(input + " " +"is a vowel");
	break;
	default:
		System.out.println(input  + "is a consonent");
	}
}
}