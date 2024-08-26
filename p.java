package practice;

public class p {
    public static void main(String[] args) {
        String s = "ja1234v123a12204";
        int re = 0;
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                re = re * 10 + (c - '0');
            } else {
                if (re > max) {
                    max = re;
                }
                re = 0;
            }
        } 
        if (re > max) {
            max = re;
        }
       
        
        System.out.println(max);
    }
}
