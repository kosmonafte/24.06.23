import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        final int apartments = 5;
        final int levels = 9;
        Scanner scanner = new Scanner(System.in);
        int apartNum = scanner.nextInt();
        int entrance = apartNum / (apartments * levels);
        if (!(apartNum % (apartments * levels) == 0)) {
            entrance++;
        }
        System.out.println(entrance);
    }
}
