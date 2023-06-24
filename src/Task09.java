import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты первой точки");
        int oneX = scanner.nextInt();
        int oneY = scanner.nextInt();
        System.out.println("Введите координаты второй точки");
        int twoX = scanner.nextInt();
        int twoY = scanner.nextInt();
        if (twoX > oneX) {
            if (twoY > oneY) {
                System.out.println("Подъем");
            } else if (twoY < oneY) {
                System.out.println("Спуск");
            } else {
                System.out.println("Ровная дорога");
            }
        } else if (twoX < oneX) {
            if (twoY < oneY) {
                System.out.println("Подъем");
            } else if (twoY > oneY) {
                System.out.println("Спуск");
            } else {
                System.out.println("Ровная дорога");
            }
        } else {
            System.out.println("Дорога отвесная");
        }
    }
}
