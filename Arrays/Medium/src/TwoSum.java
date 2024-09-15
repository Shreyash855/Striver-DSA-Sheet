import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static String twoSum1(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left<right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }
    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] res = new int[2];
        res[0] = res[1] = -1;
        for(int i=0;i<arr.length;i++){
            int moreNeeded = target - arr[i];
            if(mp.containsKey(moreNeeded)){
                res[0] = mp.get(moreNeeded);
                res[1] = i;
                return res;
            }
            mp.put(arr[i],i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;

        int[] res = twoSum(arr,target);
        System.out.println("This is the answer for variant 2: [" + res[0] + ", "
                + res[1] + "]");

        String ans = twoSum1(arr,target);
        System.out.println(ans);
    }
}
