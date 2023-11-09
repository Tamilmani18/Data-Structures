// Occurrences of a number in an array using Hashing

import java.util.*;
class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    System.out.println("Enter size of arr: ");
		int n= sc.nextInt();
		
    System.out.println("Enter array elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
    //Prestoring or Precompute
		int[] hash = new int[15];
		for(int i=0;i<n;i++) {
			hash[arr[i]]+=1;
		}
		
    System.out.println("Enter no of elements to be searched: ");
		int q=sc.nextInt();
		
    while(q--!=0) {
			int num =sc.nextInt();
			System.out.println(hash[num]); //Fetching
		}
	}
}

// Occurrences of a character(uppercase and lowercase) in an string using Hashing.

import java.util.*;
class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s= sc.next();
		
		//Prestoring or Precompute
		int[] hash = new int[256];
		for(int i=0;i<s.length();i++) {
			hash[s.charAt(i)]++; //auto type casts character to integer value(ascii number).
		}
		
		System.out.println("Enter no of Characters to be searched: ");
		int q=sc.nextInt();
		while(q-- > 0) {
			char c = sc.next().charAt(0);
			System.out.println(hash[c]); //Fetching
		}
	}
}

// Occurrences of a character(uppercase) in an string using Hashing.

import java.util.*;
class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s= sc.next();
		
		//Prestoring or Precompute
		int[] hash = new int[25];
		for(int i=0;i<s.length();i++) {
			hash[s.charAt(i)-'a']++;  // for Uppercase use character - 'A'
		}
		
		System.out.println("Enter no of Characters to be searched: ");
		int q=sc.nextInt();
		while(q-- > 0) {
			char c = sc.next().charAt(0);
			System.out.println(hash[c-'a']); //Fetching
		}
	}
}
