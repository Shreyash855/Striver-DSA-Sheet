import java.util.Scanner;

public class ArmstrongNumber {
    static long armstrongNumber(long num){
        long sum = 0;
        while(num>0){
            long a = num % 10;
            sum = sum + a*a*a;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = armstrongNumber(n);
        System.out.println(ans);
        if(n == ans) System.out.println("true");
        else System.out.println("false");
    }
}
