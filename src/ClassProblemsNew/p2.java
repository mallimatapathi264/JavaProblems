package ClassProblemsNew;

public class p2 {
	public static void main(String[] args) {
		String s="aabacde";
		String s1="aabacde";
		
	char[] c= s.toCharArray();
	char[] c1= s1.toCharArray();
	int i=0;
    while(i<c.length && i<c1.length)	
		{
		    	if(c[i]<c1[i])
		    	{
		    		System.out.println(s);
		    		return;
		    	}
		    	else if(c[i]>c1[i])
		    	{
		    		System.out.println(s1);
		    		return;
		    	}
		    	i++;
		}
    // If we reach here, it means all compared characters are equal
    // Now we check the lengths of the strings
    if (c.length < c1.length) {
        System.out.println(s);
    } else {
        System.out.println(s1);
    }
}
}