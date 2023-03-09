 import java.util.*;
	class HashMapEg2{
		public static void main(String arg[]){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(100,"Ravi");
		map.put(101,"Vijay");
		
		map.put(103,"Ajay");
								 
	
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
}
}