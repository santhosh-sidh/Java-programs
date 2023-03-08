class c1{
String str = "Addition";
	void addition(){
		System.out.println(str+" " + (10+15));
	}
}
      class c2 extends c1{
	String str = "Duplicate value";
		void addition(){
		int c = 5+10;
		System.out.println(str+" " + c);
		System.out.println(super.str+" " + c);
		super.addition();
	}
}
	 class c3 extends c2{
		public static void main(String args[]){ 
		c3 obj = new c3();
		obj.addition();

	}
}

		