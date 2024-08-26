package Strings.com;
class B
{
	int i;
	int j;
	B(){
		i=10;
	}
	B(int p){
		
		j=p;
	}
}
public class p4 {
	public static void main(String[] args) {
	  B b1 = new B(1);
		System.out.println(b1.i+" "+b1.j);
	}

}
