import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int xInput = scanner.nextInt();
            int yInput = scanner.nextInt();
            if (xInput > 0) {
                if (yInput > 0) {
                    System.out.println("I - четверть");
                } else if (yInput < 0) {
                    System.out.println("IV - четверть");
                } else {
                    System.out.printf("Точка на оси координат, между I и IV четвертями");
                }
            } else if (xInput < 0) {
                if (yInput > 0) {
                    System.out.println("II - четверть");
                } else if (yInput < 0) {
                    System.out.println("III - четверть");
                } else {
                    System.out.printf("Точка на оси координат, между II и III четвертями");
                }
            } else {
                if (yInput > 0) {
                    System.out.println("Точка на оси координат, между I и II четвертями");
                } else if (yInput < 0) {
                    System.out.println("Точка на оси координат, между III и IV четвертями");
                } else {
                    System.out.printf("Точка находится по центру координат");
                }
            }
        }

    }
}
