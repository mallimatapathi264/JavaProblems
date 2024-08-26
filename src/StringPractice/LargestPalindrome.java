package StringPractice;

public class LargestPalindrome {
	
public static void main(String[] args) {
	
	String s="mmallikarjuna";
	String  temp="";
	for(int i=0;i<s.length()-1;i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			if(isPali(s,i,j))
			{
				String s1=s.substring(i,j+1);
				
				if(s1.length()>temp.length())
					temp=s1;
				}
			}
		}
	    System.out.println(temp);
	}
	
static boolean isPali(String s, int start, int end)
{
	int i=start;
	int j=end;
	while(i<j) 
	{
	if(s.charAt(i)!=s.charAt(j))
		return false;
		i++;
		j--;
	}
	return true;
  }
}
