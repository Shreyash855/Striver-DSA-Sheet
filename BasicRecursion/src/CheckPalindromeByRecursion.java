import java.util.Scanner;

public class CheckPalindromeByRecursion {
    static boolean checkPalindrome(String s, int i, int n){
        if(i>=n/2)
            return true;
        if(s.charAt(i) != s.charAt(n-i-1))
            return false;
        return checkPalindrome(s,i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        boolean res = checkPalindrome(str,0, str.length());
        if(res) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}
