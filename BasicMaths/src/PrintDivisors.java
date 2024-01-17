import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class PrintDivisors {
    static void printAllDivisors1(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0) System.out.print(i+" ");
        }
    }

    static void printAllDivisors2(int num){
        LinkedList<Integer> lst = new LinkedList<>();
        for(int i=1;i<=Math.sqrt(num); i++){
            if(num%i==0){
                lst.add(i);
                if(num/i != i) {
                    lst.add(num/i);
                }
            }
        }
        Collections.sort(lst);
        System.out.println(lst);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        printAllDivisors1(n);
        printAllDivisors2(n);
    }
}
