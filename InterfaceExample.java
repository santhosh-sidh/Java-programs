interface printable{
	void print();
	}

	class InterfaceExample implements printable{
		public void print(){
			System.out.println("Use interface abstraction is achieved");
		}
	
		public static void main(String args[]){
			InterfaceExample obj = new InterfaceExample();
			obj.print();
		}
}
