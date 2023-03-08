class Human{
	public void showHuman(){
	System.out.println("Human");
	}
}

interface Father{
	public void show();
}

interface Mother{
	public void show();
}

class Child extends Human implements Father,Mother{

	public void show(){
	System.out.println("invoking show method");
}     
	public void showChild(){
	System.out.println(" showChild method");
}

}

class HybridExample extends Child{

public static void main(String args[]){
	HybridExample c = new HybridExample();
	c.showHuman();
	c.show();
	c.showChild();
}
}