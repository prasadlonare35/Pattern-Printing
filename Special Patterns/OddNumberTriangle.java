import java.util.*;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int l = sc.nextInt();

        // using maths formula and printing
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( (2 * j - 1) +" ");
            }
            System.out.println();
        }

        // using maths AP formula and giving condition
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= 2 * i - 1; j+=2) {
                System.out.print( j +" ");
            }
            System.out.println();
        }

        // withou using maths formula
        for (int i = 1; i <= l; i++) {
            int a= 1;
            for (int j = 1; j <= i; j++) {
                System.out.print( a +" ");
                a+=2;
            }
            System.out.println();
        }
        
    }
}
