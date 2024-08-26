package ClassProblemsNew;

public class RemoveExtraSpacesbtwnwords {
	public static void main(String[] args) {
		String s="Hi   Hello  How Are         You   "; 
		String res="";
		int st=0;
		int end=s.length()-1;
		while(s.charAt(st)==' ') st++;
		while(s.charAt(end)==' ') end--;
		
		for(int i=st;i<=end;i++)
		{
			char c=s.charAt(i);
			if(c!=' ') res+=c;
			else if(s.charAt(i+1)!=' ') res+=c;
		}
		System.out.println(res);
	}

}

