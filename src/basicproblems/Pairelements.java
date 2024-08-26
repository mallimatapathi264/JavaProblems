package basicproblems;

import java.util.ArrayList;

public class Pairelements {
public static void main(String[] args) {
	int[] a={10,3,4,5,6,8};
	ArrayList<String> t= new ArrayList<>();
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				t.add(a[i]+","+a[j]);
			}
		}
	}
	
	 for (String pair : t) {
         System.out.println("("+pair+")");
     }
}
}
