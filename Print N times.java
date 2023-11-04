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

// Print Number 1 to n times using Recursion

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

------or-------

// using Backtracking (Do task after the function call. Last is executed first)
// Linearly increasing order. 
public class A{
	static void test(int n) {
		if(n<1)
			return;
		else
			test(n-1);
			System.out.print(n+" "); //Backtracking
	}
	
	public static void main(String[] args) {
		int n=5;
		test(n);
	}
}

// Print Number n to 1 times using Recursion

public class A{
	static void test(int n) {
		if(n<=0)
			return;
		else
			System.out.print(n+" ");
			test(n-1);
	}
	
	public static void main(String[] args) {
		test(5);
	}
}

------or-------
	
//using Backtracking

public class A{
	
	static void test(int i,int n) {
		if(i>n)
			return;
		else
			test(i+1,n);
			System.out.print(i+" ");
	}
	
	public static void main(String[] args) {
		int n=5;
		test(1,n);
	}
}
