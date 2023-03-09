 import java.util.*;
	class StackEg{
		public static void main(String arg[]){
		Stack<String> stack = new Stack<String>();
		stack.push("Ravi");
		stack.push("Vijay");
		stack.push("Ravi");
		stack.push("Ajay");
		stack.pop();
		stack.push("Garima");
		
		Iterator<String> itr = stack.iterator();		// using datatype for reference; 
			while(itr.hasNext()){
				System.out.println(itr.next());
}
}
}