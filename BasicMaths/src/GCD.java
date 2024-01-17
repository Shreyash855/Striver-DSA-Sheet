import java.util.Scanner;

public class GCD {
    static int gcd(int a, int b){
        int gcd = 1;
        while(a > 0 && b > 0){
            if(a > b) a = a%b;
            else b = b%a;

            if(a==0) gcd = b;
            else gcd = a;
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(gcd(num1,num2));
    }
}
