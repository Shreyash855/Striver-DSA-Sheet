import java.util.Scanner;

public class LargestElement {
    static int largestElement(int[] arr){
        int largest_element = arr[0];
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>largest_element){
                largest_element = arr[i];
            }
        }
        return largest_element;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = (int)(Math.random()*100);
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        int result = largestElement(arr);
        System.out.println("\nLargest Element = "+result);
    }
}
