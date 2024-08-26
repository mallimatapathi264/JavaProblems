package Strings.com;
class S{
	S(){
		super();
		System.out.println("const A");
	}
}
class R extends S{
	R(){
		super();
		System.out.println("cons in B");
	}
}
class C extends R{
	C(){
		
		System.out.println("cons in C");
	}
}
public class p6 {
public static void main(String[] args) {
	new S();
	System.out.println("=====");
	new R();
	System.out.println("=======");
	new C();
}
}
