package StringPractice;

public class PalindromePrgm {
	public static void main(String[] args) {
		String s="malajkhkjalamt";
		if(isPali(s))
		{
			System.out.println("Pali");
		}
		else System.out.println("not a pali");
	}
	
	public static boolean isPali(String s)
	{
		if(s.length()<1) return false;
		if((s.length()==1)) return true;
		int i=0, j=s.length()-1;
		
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
