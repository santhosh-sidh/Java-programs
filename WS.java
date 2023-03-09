class Table{
 	synchronized void printTable(int n){
		for(int i=1;i<=5;i++){
			System.out.println(i*n);
	try{
		Thread.sleep(2000);
	}catch(Exception e){
		System.out.println(e);
	}
	}
}
}


class A1 extends Thread{
	Table t;
	A1(Table t){
		this.t = t;
		}
	public void run(){
		t.printTable(6);
	}
}

class B1 extends Thread{
	Table t;
	B1(Table t){
		this.t = t;
		}
	public void run(){
		t.printTable(200);
	}
}

class WS{
	public static void main(String[] args){
		Table t1 = new Table();
		A1 obj1 = new A1(t1);
		B1 obj2 = new B1(t1);	
	
		obj1.start();
		obj2.start();
	}
}