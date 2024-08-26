package StringPractice;

public class SumNumbers {
	public static void main(String[] args) {
	String s= "he123ll3o8";
	int sum=0; int temp=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='9' && s.charAt(i)<='0')
		{
			sum+=s.charAt(i);
		}
		temp+=sum;
		sum=0;
	}
	System.out.println(temp);
	}
}
