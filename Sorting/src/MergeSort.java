import java.util.Scanner;

public class MergeSort {
    /*
    * Divide and conquer strategy
    * Time Complexity:
    * Best Average Worst = O(n log(n))
    * Space complexity = O(n)
    */
    static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high+1];
        int k = 0;
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[k] = arr[left];
                left++;k++;
            }
            else{
                temp[k] = arr[right];
                right++;k++;
            }
        }
        while(left <= mid){
            temp[k] = arr[left];
            left++;k++;
        }
        while(right <= high){
            temp[k] = arr[right];
            right++;k++;
        }
        for(int i=low; i<=high; i++){
            arr[i] = temp[i-low];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements ? ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println("Before sorting:");
        for(int i:arr){
            System.out.print(i+" ");
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println("\nAfter sorting:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
