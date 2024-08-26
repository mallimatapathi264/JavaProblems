package Nodesproblems;

public class HashSet {
	static Node[] a = new Node[10];
    static int n = Integer.valueOf(5).hashCode();


    public static void main(String[] args) {
        HashSet a = new HashSet();
        
        System.out.println(a.hashCode());
        
        System.out.println(a.hashCode()%10);
    }
}
