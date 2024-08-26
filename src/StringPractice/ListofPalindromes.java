package StringPractice;

public class ListofPalindromes {
	public static void main(String[] args) {
		String s="banana";
		char temp=' ';
		char temp1=' ';
		int m=0,n=s.length()-1;
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(isPali(s,i,j))
				{
					//System.out.println(s.substring(i,j+1));
				String s1=s.substring(i,j+1);
//				  char[] c=s1.toCharArray();
//				  Array.sort[c];
				while(i<j) {
				if(s1.charAt(i)!=s1.charAt(i+1))
				{
					temp=s1.charAt(i);
				}
				temp1+=temp;
				s1="";
				i++;
				}
				}
			}
		}
		System.out.println(temp1);
	}
	
	static boolean isPali(String s, int start, int end)
{
	int i=start;
	int j= end;
	while(i<j)
	{
	if(s.charAt(i)!=s.charAt(j))
	{
		return false;
	}
	i++;
	j--;
	}
	return true;
  }
}
