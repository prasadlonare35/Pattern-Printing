import java.util.*;

public class NumberPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int l = sc.nextInt();

        int nsp=l-1;
        int nst = 1;
        for (int i = 1; i <= l; i++) {     
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}
