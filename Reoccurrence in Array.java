
import java.util.Arrays;
class Test{
	public static void main(String[] args) {
		int[] arr = {2,2,3,2,4,4};
		Arrays.sort(arr);
		int count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}
			else {
				if(count>1) {
					System.out.println("Element "+arr[i-1]+" occured "+count+" times.");
				}
				count=1;
			}
		}
		if(count>1) {
			System.out.println("Element "+arr[arr.length-1]+" occured "+count+" times.");
		}
	}
}
