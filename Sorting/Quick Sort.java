public class Sorting {

    public static void quickSort(int[] arr, int low , int high){

        if(low < high){
            int pIndex = partition(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high){

        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j){
            while (pivot >= arr[i] && i <= high-1) i++;
            while (pivot < arr[j] && j >= low+1) j--;
            if(i < j ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        
        return j;
    }

    public static void main(String[] args){
        int[] arr = {7,2,5,54,99,18,1};
        int n = arr.length;
        System.out.println("Before Sorting :");
        for (int j : arr) {
            System.out.print(j+" ");
        }
        System.out.println("\n");
        quickSort(arr,0,n-1);
        System.out.println("Sorted Array :");
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }
}
