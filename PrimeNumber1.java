import java.util.*;
class PrimeNumber extends Thread{
	public void run(){
		System.out.println("");
	}
}
class Prime extends PrimeNumber{
	static  boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
       for(int i=2;i<=n/2;i++)
       {
           if((n%i)==0)
               return  false;
       }
       return true;
    }
}
class PrimeNumber1{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= sc.nextInt();
        if(Prime.isPrime(number)) {
            System.out.println(number + " is a Prime Number");
        }
        else{
            System.out.println(number + " is not a Prime Number");
        }
		PrimeNumber pn = new PrimeNumber();
		Prime pn1 = new Prime();
		pn1.start();
	}
}