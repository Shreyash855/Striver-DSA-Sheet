import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayByRecursion {
    static void reverseArray(ArrayList<Integer>a, int i, int n){
        if(i>=n/2){
            return;
        }
        Collections.swap(a,i,n-i-1);
        reverseArray(a,i+1, n);
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? : ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            a.add((int)(Math.random()*100));
        }
        System.out.println(a);
        reverseArray(a,0,a.size());
        System.out.println(a);
    }
}
