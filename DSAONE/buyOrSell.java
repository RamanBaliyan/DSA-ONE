import java.util.*;
public class buyOrSell {
    static int maxprofit(int []a){
     int max=0;
     int min=a[0];
     
     for(int i=0;i<a.length;i++){
        min=Math.min(min,a[i]);
        int profit = a[i]-min;
        max=Math.max(max,profit);
     }
     return max;
    }
    public static void main(String[] args) {
        int [] b={5,2,6,1,4};
         System.out.println(maxprofit(b));
    }
}
