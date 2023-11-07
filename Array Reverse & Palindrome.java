//Reverse an array using Recursion
public class C{
	
	static void rev(int i , int[] arr) {
		if(i>=arr.length/2) return;
		else {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
			rev(i+1,arr);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		rev(0,arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

//Reverse an array without using Recursion
public class C {

    static void rev(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rev(arr); // Reverse the array in-place
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

//Palindrome using Recursion

public class C{
	
	static boolean palindrome(int i , String s) {
		if(i>=s.length()/2) return true;
		else {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
			return palindrome(i+1,s);
		}
	}
	
	public static void main(String[] args) {
		String s = "MAM";
		System.out.println(palindrome(0,s));
	}
}
