import java.util.Scanner;

public class ReverseNumber {
    static int reverseNumber(int num){
        int sum = 0;
        while(num>0){
            int a = num % 10;
            sum = sum*10 + a;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ans = reverseNumber(n);
        System.out.println(ans);
    }
}
