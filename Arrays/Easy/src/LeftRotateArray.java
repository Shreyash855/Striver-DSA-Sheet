import java.util.Scanner;

public class LeftRotateArray {
    static void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void leftRotateByDPlacesOptimal(int[] arr, int place){
        int size = arr.length;
        reverse(arr,0,place-1);
        reverse(arr,place,size-1);
        reverse(arr,0,size-1);
    }
    static void leftRotateByDPlaces(int[] arr, int place){
        //[1,3,5,3,6] place = 3 -> [3,6,1,3,5]
        int size = arr.length;
        int[] temp_arr = new int[place];
        for(int i=0;i<place;i++){
            temp_arr[i] = arr[i];
        }
        for(int i=place;i<size;i++){
            arr[i-place] = arr[i];
        }

        for(int j=0,i=size-place;i<size;i++){
            arr[i] = temp_arr[j++];
        }

    }
    static void leftRotateByOne(int[] arr){
        //[1,3,5,3,6] = [3,5,3,6,1]
        int size = arr.length;
        int first_element = arr[0];
        for(int i=0;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        arr[size-1] = first_element;
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
//        leftRotateByOne(arr);
//        System.out.println("\nAfter Rotating array by one:");
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
        System.out.print("\nHow many times you want to rotate? ");
        int n = sc.nextInt();
//        leftRotateByDPlaces(arr,n);
        leftRotateByDPlacesOptimal(arr,n);
        System.out.println("After rotating "+n+" times:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
