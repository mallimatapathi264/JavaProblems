package Strings.com;
class Box
{
	int height;
	int width;
	int length;

	Box(int h, int w, int l)
	{
		height =h;
		width= w;
		 length= l;
	}
	Box(int x)
	{
		this(x,x,x);
	}
	void display()
	{
		System.out.println(height+" "+width+" "+length);
	}
}
public class p5 {
public static void main(String[] args) {
	
	Box b= new Box(4,4,4);
	Box b1= new Box(4);
	b1.display();

	b.display();
}
}
