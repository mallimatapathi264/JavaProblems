package StringPractice;

public class A {
	public static void main(String[] args) {
		int n;
		int fact=1;
		int sum=0;
		for(n=5;n>1;n--)
		{
		fact=n*n*n;
		sum=fact+sum;
		}
		System.out.println(sum);
		
	}

}
