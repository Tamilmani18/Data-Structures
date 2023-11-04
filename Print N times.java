public class Practice {
    public static void printNtimes(int n){
       System.out.print("Tamil"+" ");
       if(n>1){
           printNtimes(n-1);
       }
    }
    public static void main(String[] args){
       printNtimes(5);
    }
}
