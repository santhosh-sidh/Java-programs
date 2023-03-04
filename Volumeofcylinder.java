import java.util.*;

class Volumeofcylinder{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Radius of cylinder:");
	int Radius = input.nextInt();
	System.out.println("Enter the Height of cylinder:");
	int Height = input.nextInt();
	int Volume = (22/7*Radius^2*Height);
	System.out.println("Volume of Cylinder is:" + Volume);
	
	
	


}}