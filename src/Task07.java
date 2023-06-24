import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.next().charAt(0);
            if (input > 1039 & input < 1104) {
                System.out.println("Кирилица");
            } else if (input > 64 & input < 123) {
                System.out.println("Латиница");
            } else if (input > 47 & input < 58) {
                System.out.println("Цифра");
            } else {
                System.out.println("Неизвестный символ");
            }
        }
    }
}
