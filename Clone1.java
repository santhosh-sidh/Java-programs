class Clone1 implements Cloneable{  
int rollno;  
String name;  
  
Student18(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
public Object clone()throws CloneNotSupportedExcepti 
return super.clone();  
}  
  
public static void main(String args[]){  
try{  
Student18 s1=new Student18(101,"amit");  
  
Student18 s2=(Student18)s1.clone();  
  
System.out.println(s1.rollno+" "+s1.name);  
System.out.println(s2.rollno+" "+s2.name);  
  
}catch(CloneNotSupportedException c){}  
  
}  
}  