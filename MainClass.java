class c1{
	int a = 15;
	int b = 10;
	void addition(){
		System.out.println("Value = " + a+b);
	}

      class c2 extends c1{
	int c = 5+10;
		void addition(){
		System.out.println("Value = " + c);
	}
}
	public class main3 extends c2{
		public static void main(String args[]){ 
		c3 obj = new c3();
		super.obj();
		c2.obj();

	}
}
}
		