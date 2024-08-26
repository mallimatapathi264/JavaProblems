package Strings.com;
class F {
	int i=10;
	F(){
		System.out.println("a");
	}
}
class D extends F{
	int i=20;
	D(){	
	super();
  }
	void m1() {
		
	System.out.println(i);
	
	System.out.println(super.i);
	}
}
public class p7 {
public static void main(String[] args) {
	D n= new D();
	n.m1();
	}
}
