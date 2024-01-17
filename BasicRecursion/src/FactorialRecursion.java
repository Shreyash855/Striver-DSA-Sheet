import java.util.Scanner;

public class FactorialRecursion {
    static int factorialOfNumbers(int n){
        if(n == 1) return 1;
        else return n*factorialOfNumbers(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = factorialOfNumbers(num);
        System.out.println(ans);
    }
}
