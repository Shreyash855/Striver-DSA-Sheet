import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountFrequency {
    static void countFrequency(int[] arr,int size){
        int[] hash_arr = new int[100];
        for(int i=0;i<size;i++){
            hash_arr[arr[i]]++;
        }

        for(int i=0;i<hash_arr.length;i++){
            if(hash_arr[i]>0){
                System.out.println(i+" : "+hash_arr[i]);
            }
        }
    }
    static void countCharacterFrequency(String str, int size){
        int[] hash_char = new int[256];
        for(int i=0;i<size;i++){
            hash_char[str.charAt(i)]++;
        }

        for(int i=0;i<hash_char.length;i++){
            if(hash_char[i]>0){
                System.out.println((char) i+" : "+hash_char[i]);
            }
        }
    }

    static void countFrequencyMap(int[] arr,int size){
        Map<Integer,Integer> mp = new TreeMap<>();
        for(int i:arr){
            if(mp.get(i) == null){
                mp.put(i,1);
            }
            else{
                int cnt = mp.get(i);
                cnt++;
                mp.put(i,cnt);
            }
        }
        for (Integer key : mp.keySet()) {
            Integer value = mp.get(key);
            System.out.println(key + ": " + value);
        }
        int max = 1;
        int min = mp.size();
        int max_ele = 0;
        int min_ele = 0;
        for (Integer key : mp.keySet()) {
            if(mp.get(key) > max){
                max = mp.get(key);
                max_ele = key;
            }
            if(mp.get(key) < min){
                min = mp.get(key);
                min_ele = key;
            }
        }
        System.out.println("Min freq = "+min_ele+":"+min);
        System.out.println("Max freq = "+max_ele+":"+max);
    }
    public static void main(String[] args) {
        int[] arr = {10,2,45,3,21,2,10,21,2,3,45,3,2,1,2};
        String str = "abcabcbfba";
//        countFrequency(arr,arr.length);
//        countCharacterFrequency(str,str.length());
        countFrequencyMap(arr,arr.length);
    }
}
