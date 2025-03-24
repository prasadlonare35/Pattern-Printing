import java.util.*;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int l = sc.nextInt();

        int mid = l/2 +1;
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= l; j++) {
                if(i==mid || j==mid) System.out.print(" *");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
