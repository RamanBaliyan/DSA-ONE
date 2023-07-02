public class pallindromeString {
    
    public static boolean palli(String s, int l, int r){
        char [] arr = s.toCharArray();
        if(l>=r){
            System.out.println("pallindrome");
            return true;
        }
        if(arr[l]!=arr[r]){
            System.out.println(" not pallindrome");
            return false;
        }
        else {
            return(palli(s,l+1,r-1));
        }

    }
    public static void main(String[] args) {
    
        palli("aabbaa",0,5);
    }
    
}
