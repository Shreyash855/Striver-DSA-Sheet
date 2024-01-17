public class SumByRecursion {
    static int sum1(int n){
        if(n==0) return 0;
        else {
            return n + sum1(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum1(5));
    }
}
