package basicproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PossibleStrings {
	public static void main(String[] args) 
	{
		String s="malli";
		//Set<String> st= new HashSet<>();
		List<String> st = new ArrayList<String>();
		int n= s.length();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				String app= (s.substring(i,j));
				st.add(app);
			}
		}		
		
		
			for(String c1:st) 
			{
				System.out.println(c1);
			}
			System.out.println(st.size());
	}
}

