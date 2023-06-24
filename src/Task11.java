import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a, b, c через пробел");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = ((-b) - Math.sqrt(D)) / (2 * a);
            double x2 = ((-b) + Math.sqrt(D)) / (2 * a);
            System.out.println("2 корня, х1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x1 = -(b/(2*a));
            System.out.println("1 корень, х1 = " + x1);
        } else {
            System.out.println("Корней нет");
        }
    }
}
