import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumber {
    static int findMissingNumber(ArrayList<Integer> l1, int n){
        int sum1=0,sum2=0;
        for(int i=0;i<l1.size();i++){
            sum1 += l1.get(i);
        }

        sum2 = (n*(n+1)) / 2;

        return sum2 - sum1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n-1;i++){
            l1.add(sc.nextInt());
        }

        int res = findMissingNumber(l1,n);
        System.out.println(res);
    }
}
