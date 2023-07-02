public class kaden {
    static int maxSum(int arr[]){
        int Msum=0,Csum=0;
        for(int i=0;i<arr.length;i++){
            Csum=Csum+arr[i];
            if(Csum>Msum){
                Msum=Csum;
            }
            if(Csum<0){
                Csum=0;
            }
        }
        return Msum;
    }



    public static void main(String[] args) {
       // int [] a={2,3,4,5,-3,-4,-5,6,7,8,5,4,};
       int [] a = { 1,2,-4,5};
       System.out.println(maxSum(a)); 
    }
}
