package basicproblems;

import java.util.Stack;

public class Balanced {
	public static void main(String[] args) {
		String s="[]{}()";
		System.out.println((isBalanced(s)));
	}
	public static boolean isBalanced(String s)
	{
		char[] c=s.toCharArray();
		Stack<Character> st= new Stack<>();
		for(int i=0;i<c.length;i++)
		{
			char ch= c[i];
			if(ch=='{'||ch=='['||ch=='(')
			{
				st.add(ch);
			}
			else if(ch=='}'||ch==']'||ch==')')
			{	
				if(!st.isEmpty()) {
				char ch2= st.pop();
				
				if(!isPair(ch2,ch)) return false;
			}else return false;
		}
		
	}
return st.isEmpty();
}
	
    public static boolean isPair(char ch1, char ch2) {
        if ((ch1 == '{' && ch2 == '}') ||
               (ch1 == '[' && ch2 == ']') ||
               (ch1 == '(' && ch2 == ')'))
        {
        	return true;
        }
        return false;
    }
}
