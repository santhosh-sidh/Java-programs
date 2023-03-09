 import java.util.*;
	class ArrayListEg{
		public static void main(String arg[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
				
		System.out.println(list);					|
			Collections.sort(list);					|
		System.out.println(list);					|   sort only applicable for Arraylist,linkedlist,vector,stack,hashset
			Collections.sort(list,Collections.reverseOrder());	|
		System.out.println(list);					|
		list.remove(1);//index value
		Iterator itr = list.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
}
}
}