package ClassProblemsNew;

public class p1 {
public static void main(String[] args) {
	String s="java";
	for(char c='9';c>='0';c--){
		if(s.indexOf(c)!=-1)
		{
			System.out.println(c);
			return;
		}
	}
	System.out.println("no digits");
	
	
	/*char[] c=s.toCharArray();
	int d=0;
	for(int i=0;i<c.length;i++)
	{
		if(c[i]>='0' && c[i]<='9')
		{
			if(c[i]>d) d= c[i];
		}
	}
	System.out.println(d-'0');*/
}
}
