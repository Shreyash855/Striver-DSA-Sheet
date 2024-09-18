public class SortArray {

    public static void sortArrayOptimal(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){
                // swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                //swap mid and high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        // display sorted array
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
    public static void sortArrayBetter(int[] arr){
        int cnt0=0,cnt1=0,cnt2 = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == 0) cnt0++;
            else if(arr[i] == 1) cnt1++;
            else cnt2++;
        }
        for(int i=0;i<cnt0;i++){
            arr[i] = 0;
        }
        for(int i=cnt0;i<cnt0+cnt1;i++){
            arr[i] = 1;
        }
        for(int i=cnt0+cnt1;i<n;i++){
            arr[i] = 2;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0,0,0,1,1,1,2,0,0};
        sortArrayBetter(arr);
        System.out.println();
        sortArrayOptimal(arr);
    }
}
