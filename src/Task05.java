import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        String zodiak = null;
        String china = null;
        System.out.println(day + " " + month + " " + year);
        switch (month) {
            case 1:
                if (day <= 19) {
                    zodiak = "Козерог";
                } else {
                    zodiak = "Водолей";
                }
                break;
            case 2:
                if (day <= 18) {
                    zodiak = "Водолей";
                } else {
                    zodiak = "Рыбы";
                }
                break;
            case 3:
                if (day <= 20) {
                    zodiak = "Рыбы";
                } else {
                    zodiak = "Овен";
                }
                break;
            case 4:
                if (day <= 19) {
                    zodiak = "Овен";
                } else {
                    zodiak = "Телец";
                }
                break;
            case 5:
                if (day <= 20) {
                    zodiak = "Телец";
                } else {
                    zodiak = "Близнецы";
                }
                break;
            case 6:
                if (day <= 20) {
                    zodiak = "Близнецы";
                } else {
                    zodiak = "Рак";
                }
                break;
            case 7:
                if (day <= 22) {
                    zodiak = "Рак";
                } else {
                    zodiak = "Лев";
                }
                break;
            case 8:
                if (day <= 22) {
                    zodiak = "Лев";
                } else {
                    zodiak = "Дева";
                }
                break;
            case 9:
                if (day <= 22) {
                    zodiak = "Дева";
                } else {
                    zodiak = "Весы";
                }
                break;
            case 10:
                if (day <= 22) {
                    zodiak = "Весы";
                } else {
                    zodiak = "Скорпион";
                }
                break;
            case 11:
                if (day <= 21) {
                    zodiak = "Скорпион";
                }  else {
                    zodiak = "Стрелец";
                }
                break;
            case 12:
                if (day <= 21) {
                    zodiak = "Стрелец";
                } else {
                    zodiak = "Козерог";
                }
                break;
        }
        switch (year % 12) {
            case 0:
                china = "Обезьяна";
                break;
            case 1:
                china = "Петух";
                break;
            case 2:
                china = "Собака";
                break;
            case 3:
                china = "Свинья";
                break;
            case 4:
                china = "Крыса";
                break;
            case 5:
                china = "Бык";
                break;
            case 6:
                china = "Тигр";
                break;
            case 7:
                china = "Кролик";
                break;
            case 8:
                china = "Дракон";
                break;
            case 9:
                china = "Змея";
                break;
            case 10:
                china = "Лошадь";
                break;
            case 11:
                china = "Коза";
                break;
        }
        System.out.println(zodiak + " " + china);
    }
}
