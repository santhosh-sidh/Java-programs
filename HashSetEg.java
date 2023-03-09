 import java.util.*;
	class HashSetEg{
		public static void main(String arg[]){
		HashSet<String> list = new HashSet<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add("sabari");
		Iterator itr = list.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
}
}
}