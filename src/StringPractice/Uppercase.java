package StringPractice;

public class Uppercase {
public static void main(String[] args) {
		
		String s="java is easy";
		String[] s3= s.split(" ");
		for(int i=0;i<s3.length;i++)
		{
			String s4=s3[i];
			String s5=s4.substring(0,1).toUpperCase()+s4.substring(1);
			System.out.print(s5+" ");
		}
		
	}

}

