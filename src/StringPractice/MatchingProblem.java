package StringPractice;

import java.util.Stack;

public class MatchingProblem {
public static void main(String[] args) {
	String s="}])([{";
	
	System.out.println(isBalanced(s));
		
	}
	
	public static boolean isBalanced(String s)
	{
		char[] c=s.toCharArray();
		Stack<Character> stack= new Stack<>();
		for(int i=0;i<c.length;i++)
	{
		char ch1=c[i];
		if(ch1=='{'||ch1=='('||ch1=='[')
			stack.push(ch1);
			else if(ch1=='}'||ch1==']'||ch1==')')
			{
				if(!stack.isEmpty())
				{
				char ch2=stack.pop();
				if(!isPair(ch1,ch2))
					return false;
				}
				else
					return false;
				}
			}
		return stack.isEmpty();
	}

	public static boolean isPair(char ch1, char ch2) {
	    if ((ch1 == '}' && ch2 == '{') || (ch1 == ']' && ch2 == '[') || (ch1 == ')' && ch2 == '(')) {
	        return true;
	    }  else {
	        return false;
	    }
	}
}
