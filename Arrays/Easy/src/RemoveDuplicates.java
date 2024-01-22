import java.util.Scanner;

public class RemoveDuplicates {
    static int removeDuplicatesFromSortedArray(int[] arr){
        int i=0;
        int n = arr.length;
        for(int j=1;j<n;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return (i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i:arr){
            System.out.print(i+" ");
        }

        int result = removeDuplicatesFromSortedArray(arr);
        System.out.println("\nUnique elements = "+result);
        for(int i=0;i<result;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
