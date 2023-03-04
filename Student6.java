class Student6{
int id;
String name;
String gender;
	//constructor to initializing int and string
	Student6(int i,String n,String m){
		id = i;
		name = n;
		gender = m;
	}
	//constructor to initializing another object
	Student6(Student6 s){
		id = s.id;
		name = s.name;
	}
	Student6(){
	}

	 void display(){System.out.println(id+" "+name);}

		public static void main(String arg[]){
			Student6 s1 = new Student6(111,"Karan");
			Student6 s2 = new Student6(s1,"gender");
			Student6 s3 = new Student6(s2);
			Student6 s4 = new Student6();
			s4.id = s1.id;
			s4.name = s4.name;
			s4.gender = s2.gender;
			s1.display();
			s2.display();
			s3.display();
		}
}