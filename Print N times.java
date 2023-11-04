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

------or-------

public class Practice {
    static int i=0;
    public static void printNtimes(int n){
        if(i>=n){
            return;
        }
        else{
            System.out.print("Tamil"+" ");
            i++;
            printNtimes(n);
        }
    }
}
