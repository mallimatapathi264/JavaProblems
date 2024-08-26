package StringPractice;

public class A2 {
	public static void main(String[] args) {
		String s1="malayalam";
		char[] a= {'a','e','i','o','u'};
		char ch='\u0000';
		int max=0;
		for(char c:a) {
			int count=s1.length()-s1.replace(c+"","").length();
			if(count>max)
			{
				max=count;
				ch=c;
			}
		}
		System.out.println(ch+" "+max);
	   }
	}

