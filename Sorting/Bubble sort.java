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
		
		for(int i=n-1;i>=0;i--) {
			int swap=0;
			// swap until second last element
			for(int j=0;j<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					swap=1;
				}
			}
			if(swap==0) {
				break;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
