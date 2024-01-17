import java.util.Scanner;

public class Patterns {
    public static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*n-(2*i+1));k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n){
                stars = 2*n-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern10(int n){
        int start=1;
        for(int i=1;i<=n;i++){
            if(i%2==0) start = 0;
            else start = 1;
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        int space = 2 * (n-1);
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void pattern12(int n){
        int start = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }

    public static void pattern13(int n){
        for(int i=1;i<=n;i++){
            char ch=65;
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for(int i=n;i>=1;i--){
            char ch=65;
            for(int j=i;j>=1;j--){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }

    public static void pattern16(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int k=1;k<=2*i-1;k++){
                System.out.print(ch);
                if(k<breakpoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for(int i=0;i<n;i++){
            for(char ch = (char) ('E'-i); ch<='E'; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern18(int n){
        for(int i=0;i<n;i++){
            //stars
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            //spaces
            for(int k=0;k<2*i;k++){
                System.out.print(" ");
            }
            //stars
            for(int l=0;l<n-i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        int iniS = 2*n-2;
        for(int i=0;i<n;i++){
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int k=0;k<iniS;k++){
                System.out.print(" ");
            }
            //stars
            for(int l=0;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
            iniS -= 2;
        }
    }

    public static void pattern19(int n){
        int spaces = 2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //spaces
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces -= 2;
            else spaces += 2;
        }
    }

    public static void pattern20(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern21(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int right = (2*n-2) - j;
                int bottom = (2*n-2) - i;
                System.out.print(n - Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        pattern7(n);
//        pattern8(n);
//        pattern9(n);
//        pattern10(n);
//        pattern11(n);
//        pattern12(n);
//        pattern13(n);
//        pattern14(n);
//        pattern15(n);
//        pattern16(n);
//        pattern17(n);
//        pattern18(n);
//        pattern19(n);
//        pattern20(n);
        pattern21(n);
    }
}
