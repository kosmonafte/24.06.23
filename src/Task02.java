import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input > 0 & input < 6) {
                System.out.println("Доброй ночи");
            } else if (input >= 6 & input < 12) {
                System.out.println("Доброе утро");
            } else if (input >= 12 & input < 18) {
                System.out.println("Добрый день");
            } else {
                System.out.printf("Добрый вечер");
            }
        }
    }
}
