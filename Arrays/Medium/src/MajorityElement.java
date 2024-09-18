import javax.swing.*;
import java.util.HashMap;

public class MajorityElement {

    // Moore's Voting algorithm
    //TC = O(N)
    public static int majorityElementOptimal(int[] arr){
        int n = arr.length;
        int cnt = 0, el=0;
        for(int i=0;i<n;i++){
            if(cnt == 0){
                cnt = 1;
                el = arr[i];
            }
            else if(arr[i] == el){
                cnt++;
            }
            else cnt--;
        }

        int cnt1 = 0;
        for(int i=0;i<n;i++){
            if(el == arr[i]){
                cnt1++;
            }
        }
        if(cnt1>n/2){
            return el;
        }
        return -1;
    }

    //TC = O(n logn) SC = O(N)
    public static int majorityElementBetter(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else{
                int inc = mp.get(arr[i]) + 1;
                mp.put(arr[i],inc);
            }
        }
        int max_count = 0;
        int res=0;
        for (Integer i : mp.keySet()) {
            if(mp.get(i) > max_count){
                max_count = mp.get(i);
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {4,4,2,4,3,4,4,3,2,4};
        int ans = majorityElementBetter(nums);
        int ans1 = majorityElementOptimal(nums);
        System.out.println(ans1);
    }
}
