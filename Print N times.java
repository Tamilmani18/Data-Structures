// Print Name n times using Recursion
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

// Print Number n times using Recursion

public class A{
	static int i=1;
	static void test(int n) {
		if(i>n) {
			return;
		}
		else {
			System.out.print(i+" ");
			i++;
			test(n);
		}
	}
	public static void main(String[] args) {
		test(5);
	}
}
