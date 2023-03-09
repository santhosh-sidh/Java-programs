 import java.util.*;
	class HashMapEg3{
		public static void main(String arg[]){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(100,"Ravi");
		map.put(101,"Vijay");
		
		map.put(103,"Ajay");
								 
	
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
}
}