import java.util.Scanner;

public class LinearSearch {
    static int linearSearch(int[] arr, int num){
        int pos = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                pos = i;
                return pos;
            }
        }
        return pos;
    }
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.print("\nEnter a number to search : ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int result = linearSearch(arr,num);
        System.out.println(result);
    }
}
