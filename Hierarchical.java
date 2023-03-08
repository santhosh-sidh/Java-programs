class Animal{
	void eat(){
		System.out.println("eating...");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("barking...");
	}
}

class BabyDog extends Animal{
	void weep(){
		System.out.println("weeping...");
	}
}

class Cat extends Animal{
	void meow(){
		System.out.println("meowing...");
	}
}


class Hierarchical{
	public static void main(String args[]){
		Cat d = new Cat();
		Dog c = new Dog();
		d.meow();
		//d.weep();
		c.bark();
		c.eat();
		d.eat();
			
	

	}
}