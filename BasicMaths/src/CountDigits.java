import java.util.Scanner;

public class CountDigits {
    static int countDigits1(int num){
        // Time Complexity = n
        // Space complexity = 1
        int count = 0;
        while(num>0){
            num = num / 10;
            count++;
        }
        return count;
    }

    static int countDigits2(int num){
        // Time Complexity = 1
        // Space complexity = 1
        String n = Integer.toString(num);
        return n.length();
    }

    static int countDigits3(int num){
        int res = (int) Math.log10(num) + 1;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int ans1 = countDigits1(n);
//        int ans2 = countDigits2(n);
        int ans3 = countDigits3(n);
        System.out.println(ans3);
    }
}
