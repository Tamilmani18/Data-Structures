//Fibonacci Sequence using Recursion
public class C{
	
	static int fib(int n) {
		if(n<=0) return 0;
		if(n==1) return 1;
		else return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			System.out.print(fib(i)+" ");
		}
	}
}

//Fibonacci Sequence without using Recursion
class Test{
	
	static int[] fib(int n) {
		int[] arr = new int[n];
		if(n<=0) return arr;
		else if(n==1) {
			arr[0] = 0;
			return arr;
		}
		else {
			arr[0]=0;
			arr[1]=1;
			for(int i=2;i<n;i++) {
				arr[i] = arr[i-1]+arr[i-2];
			}
			return arr;
		}			
	}
	
	public static void main(String[] args) {
		int n=5;
		int[] result=fib(n);
		for(int i=0;i<n;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
