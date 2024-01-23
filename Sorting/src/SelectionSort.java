import java.util.Scanner;

public class SelectionSort {
    /*
     * Best Time Complexity = O(n)
     * Average and Worst Time Complexity = O(n²)
     */
    static void selectionSort(int[] arr, int size){
        // Select minimum and swap
        for(int i=0;i<=size-2;i++){
            int min_index = i;
            for(int j=i;j<=size-1;j++){
                if(arr[min_index] > arr[j]){
                    min_index = j;
                }
            }
            int temp = arr[i]; // swapping
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        System.out.println();
        System.out.println("After sorting:");
        for(int i:arr){
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
        selectionSort(arr,n);
    }
}
