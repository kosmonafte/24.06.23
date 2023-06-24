import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xInput = scanner.nextInt();
        int yInput = scanner.nextInt();
        if (xInput % 2 == 0 & yInput % 2 == 0 | xInput % 2 != 0 & yInput % 2 != 0) {
            System.out.println("YES");
        }
    }
}
