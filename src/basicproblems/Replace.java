package basicproblems;

public class Replace {
    public static void main(String[] args) {
		/*
		  String s = "banana is a seedless food";
		  
		  String[] arr = s.split(" "); 
		  StringBuilder res = new StringBuilder();
		  
		  for (int i = 0; i < arr.length; i++) 
		  {
		   if (arr[i].equals("banana")) 
		   {
		   
		  res.append("orange "); 
		  } 
		  else 
		  
		  {
		   res.append(arr[i]).append(" "); 
		   }
		   }
		  System.out.println(res.toString().trim());
		
		  Output: orange is a seedless food
		 */    
    	String s = "this is a good food";
        String s1 = "";
        String s2 = "";
        
        char[] c = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            // Continue building the word (non-space characters)
            if(c[i] != ' ') {
                s1 += c[i];
            } else {
                // If a space is encountered, add the word to s2 with a space
                s2 += s1 + " ";
                s1 = "";  // Reset s1 for the next word
            }
        }
        
        // Append the last word after the loop (since it wouldn't trigger on space)
        s2 += s1;
        
        // Print the final result
        System.out.println(s2.trim());  // Output: this is a good food
    }
}
