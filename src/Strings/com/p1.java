package Strings.com;

public class p1 {
	public static void main(String[] args) {
		String a="banana";
		char[] s=a.toCharArray();
		for(int i=0;i<s.length;i++) 
		{	
			char c=s[i];
			if(c==' ') {
				continue;
			}
			int count=1;
			for(int j=i+1;j<s.length;j++)
			{
				if(c==s[j])
				{
					count++;
				s[j]=' ';
				}
			}
			System.out.println(c+" "+count);
		}
	}
	
}
				