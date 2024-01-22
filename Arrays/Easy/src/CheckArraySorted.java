import java.util.Scanner;

public class CheckArraySorted {
    static boolean checkArrayIsSorted(int[] arr){
        int i=1;
        int size = arr.length;
        while(i<size){
            if(arr[i]<arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
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
        boolean result = checkArrayIsSorted(arr);
        if(result){
            System.out.println("\nArray is sorted");
        }
        else{
            System.out.println("\nArray is not sorted");
        }
    }
}
