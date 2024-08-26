package ClassProblemsNew;

public class printcharbasedontNumbers {
	public static void main(String[] args) {
		String s = "a1b17c12";
		String s1 = "";
		char[] c = s.toCharArray();
		int count = 0;

		for (int i = 0; i < c.length; i++) 
		{
			char t = c[i];
		
			while (i + 1 < c.length && c[i + 1] >= '1' && c[i + 1] <= '9') 
			{
				count = (count*10)+c[i + 1] - '0';
				
				System.out.println(count);
				
				i++;
			}
			for (int j = 0; j < count; j++) 
			{
				s1 += t;
			}
			count=0;
		}

		System.out.println(s1);

	}
}