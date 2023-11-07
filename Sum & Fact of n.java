//Sum of N numbers using Recursion
public class Test {

  //Non Parameterized way
	static int sum(int n) {
		if(n==0) return 0;
		else return n+sum(n-1);
	}
	
	//Parameterized way
	static int sum2(int n , int sum) {
		if(n<1) return sum;
		else {
			return sum2(n-1,sum+n);
		}
	}
	
	public static void main(String[] args) {
		int n=3;
		System.out.println(sum(n));
		System.out.println(sum2(n,0));
	}
}

//Factorial of N numbers

public class Test {
    
	// Non-Parameterized way
    static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        else return n * fact(n - 1);
    }

    // Parameterized way
    static int fact2(int n, int sum) {
        if (n == 0) return sum;
        else {
            return fact2(n - 1, sum * n);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fact(n));
        System.out.println(fact2(n, 1));
    }
}
