import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input % 4 == 0) {
                if (input % 100 == 0 & input % 400 != 0) {
                    System.out.println("Год обычный 365 дней");
                } else {
                    System.out.println("Год високосный 366 дней");
                }
            } else {
                System.out.println("Год обычный 365 дней");
            }
        }
    }
}
