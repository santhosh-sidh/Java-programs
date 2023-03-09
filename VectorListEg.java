 import java.util.*;
	class VectorListEg{
		public static void main(String arg[]){
		Vector<String> list = new Vector<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add("Garima");
		Iterator<String> itr = list.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
}
}
}