import org.w3c.dom.css.DocumentCSS;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("1 - Собака, " +
                "2 - Кошка, " +
                "3 - Лошадь, " +
                "4 - Корова, " +
                "5 - Баран, " +
                "6 - Коза, " +
                "7 - Свинья, " +
                "8 - Петух, " +
                "9 - Лягушка, " +
                "10 - Осел");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Гав гав");
                break;
            case 2:
                System.out.println("Мяу мяу");
                break;
            case 3:
                System.out.println("Иго го");
                break;
            case 4:
                System.out.println("Мууууу");
                break;
            case 5:
                System.out.println("Беееее");
                break;
            case 6:
                System.out.println("Мееее");
                break;
            case 7:
                System.out.println("Хрю хрю");
                break;
            case 8:
                System.out.println("Кукареку");
                break;
            case 9:
                System.out.println("Ква ква");
                break;
            case 10:
                System.out.println("Иа иа");
                break;
        }
    }
}
