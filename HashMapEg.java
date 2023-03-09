 import java.util.*;
	class HashMapEg{
		public static void main(String arg[]){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(100,"Ravi");
		map.put(101,"Vijay");
		
		map.put(103,"Ajay");
								 
	
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
}
}
}