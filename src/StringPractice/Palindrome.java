package StringPractice;

public class Palindrome {
	public static void main(String[] args) {
		String a="malayalam";
		
		if(isPali(a))
		{
			System.out.println("pali");
		}
		else
		{
			System.out.println("Not pali");
		}
	}
	
	static boolean isPali(String a)
	{
		char[] s= a.toCharArray();
		{
			int i=0;
			int j=s.length-1;
			while(i<j) 
			{
					if(s[i]!=s[j])
					{
						return false;
					}
					i++;
					j--;
			}
					return true;
			}
		}
	}
