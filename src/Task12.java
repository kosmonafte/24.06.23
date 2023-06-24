import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int leftPart = input / 1000;
        int rightPart = input % 1000;
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < 3; i++) {
            leftSum += leftPart % 10;
            leftPart /= 10;
            rightSum += rightPart % 10;
            rightPart /= 10;
        }
        if (leftSum == rightSum) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
