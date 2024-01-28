public class ZerosToEnd {
    static void moveZerosToEnd(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                j=i;
                break;
            }
        }
        if(j == -1) return;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i] != 0){
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        moveZerosToEnd(arr);
        System.out.println("After moving zeros to end:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
