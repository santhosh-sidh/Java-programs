import java.util.*;
public class Array{
	public static void main(String[] args) {

		//int a[]= {1,2,3,4,5,6};
		String a[]= {"santhosh","sanjai","sarun",   };
		
		//for(int i=0;i<a.length;i++){
		//	 System.out.println(a[i]);
		//}

		//for each
		//for( String j : a){
		//	System.out.println(j);
		//}

		int score[] = {1,2,3,4,5,6};
		System.out.println("Before Changes: "+score[2]);

		score[2] = 89;
		System.out.println("After Changes: "+score[2]);

		System.out.println("Before Addition: "+score[1]);

		score[1] = score[1]+2;
		System.out.println("After Changes: "+score[1]);

		int mean = (score[0] + score[1])/2;
		System.out.println("Math function: "+mean);

		System.out.println("value of 5th position: "+score[5]);
		System.out.println(score);

}
}