 import java.util.*;
	class LinkedListEg{
		public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 Values:");
		List<Integer> list = new LinkedList<Integer>();
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
	
		Iterator itr = list.iterator();
		System.out.println("Values are:");
			while(itr.hasNext()){
				System.out.println(itr.next());
}
}
}