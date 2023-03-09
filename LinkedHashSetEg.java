 import java.util.*;
	class LinkedHashSetEg{
		public static void main(String arg[]){
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add("sabari");
		list.add("");

		System.out.println(list);
			Collections.sort(list);
		System.out.println(list);
			Collections.sort(list,Collections.reverseOrder());
		System.out.println(list); 
		Iterator itr = list.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
}
}
}