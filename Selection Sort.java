public class B{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of elements :");
		int n=sc.nextInt();
		
		int[] arr= new int[n];
		System.out.print("Enter array elements :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		// swap until second last element
		for(int i=0;i<=n-2;i++) { 
			// Assume the current index is the minimum element
			int min=i;
			// compare each Element with Minimum Element
			// find the Minimum element
			for(int j=i;j<=n-1;j++) { // 0 to i is sorted
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			//Swap the element
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
    // print the sorted array
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
