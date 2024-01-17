import java.util.Scanner;

public class PrimeNumber {
    static boolean checkPrime(int n){
        boolean flag = true;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = checkPrime(num);
        if(ans) System.out.println("Prime number");
        else System.out.println("Not a Prime number");
    }
}
