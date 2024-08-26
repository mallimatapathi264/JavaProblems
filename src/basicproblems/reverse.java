package basicproblems;

public class reverse {
public static void main(String[] args) {
	String s= "java is good";
	String[] arr = s.split(" ");
    String[] res = new String[arr.length]; // Initialize the res array with the correct length

    for (int i = 0; i < arr.length; i++) {
        res[i] = reverse(arr[i]); // Reverse each word and store it in res
    }

    for (String r : res) {
        System.out.print(r+" "); // Print each reversed word
    }
}
public static String reverse(String s)
{
	String res="";
	for(int i=s.length()-1;i>=0;i--)
	{
		res+=s.charAt(i);
	}
	return res;
}
}
