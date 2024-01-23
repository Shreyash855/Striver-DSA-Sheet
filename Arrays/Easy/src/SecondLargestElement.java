import java.util.Scanner;

public class SecondLargestElement {
    static int secondLargestElement(int[] arr){
        int largest=arr[0],secondLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
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

        int result = secondLargestElement(arr);
        System.out.println("\nSecond Largest Element = "+result);
    }
}
