import java.util.*;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int l = sc.nextInt();

        int a = 1;
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }
}
