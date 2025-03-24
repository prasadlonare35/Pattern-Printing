import java.util.*;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int s = sc.nextInt();
       
        for(int i = 1; i <= s; i++){
            for( int j =1 ; j<=s; j++){
                System.out.print("* ");
            
            }
            System.out.println();
        }

    }
}
