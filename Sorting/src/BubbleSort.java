import java.util.Scanner;

public class BubbleSort {
    /*
    * Best Time Complexity = O(n)
    * Average and Worst Time Complexity = O(n²)
    */
    static void bubbleSort(int[] arr, int size){
        // adjacent swapping
        for(int i=size-1;i>=1;i--){
            int didSwap = 0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j]; // swapping
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
        System.out.println();
        System.out.println("After Swapping:");
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
        bubbleSort(arr,n);
    }
}
