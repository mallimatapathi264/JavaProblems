package Strings.com;
class p
{
	int i;
	int j;
	p(){
		i=10;
	//	System.out.println("const without param");
	}
	p(int p){
		this();
		j=p;
		//System.out.println("int param");
	}
}
public class p3 {
	public static void main(String[] args) {
		
 p b=new p(10);
 System.out.println(b.i+" "+b.j);
	}
}
