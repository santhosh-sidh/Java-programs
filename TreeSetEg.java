 import java.util.*;
	class TreeSetEg{
		public static void main(String arg[]){
		TreeSet<String> list = new TreeSet<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Sabari");
		list.add("Ajay");
		list.add("Banu");
		list.add("");

		
		 
		Iterator itr = list.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
}
}
}