import java.util.HashMap;
import java.util.Map;

public class NumberThatAppearsOnce {
    static int numberThatAppearsOnce2(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else{
                int value = mp.get(arr[i]) + 1;
                mp.put(arr[i],value);
            }
        }

        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }

    static int numberThatAppearsOnce(int[] arr){
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int [] arr = {4,1,2,1,2,4,5,5,6,8,8};
        int res = numberThatAppearsOnce2(arr);
        System.out.println(res);
    }
}
