import java.util.*;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int l = sc.nextInt();

        for (int i = 1; i <= l; i++) {     //Spaces
            for (int j = 1; j <= l - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= l; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
