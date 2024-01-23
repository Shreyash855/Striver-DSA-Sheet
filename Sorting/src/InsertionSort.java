import java.util.Scanner;

public class InsertionSort {
    /*
     * Best Time Complexity = O(n)
     * Average and Worst Time Complexity = O(n²)
     */
    static void insertionSort(int[] arr, int size){
        for(int i=0;i<=size-1;i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println();
        System.out.println("After sorting:");
        for(int i: arr){
            System.out.print(i+" ");
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
        insertionSort(arr,n);
    }
}
