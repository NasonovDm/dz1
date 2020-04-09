package dz1;

public class Main {

    public static void main(String[] args) {
        // не совсем понял,что значит инициализировать значения.
        byte =-128.. .127;
        short =-327768.. .32767;
        int max = 2147483647;
        long =9223372036854775807;
        float usd = 77.25f;
        double pi = 3.14159;
        char symb = 1067 + "ы";
        boolean =true / false;

    }

    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d))
    }

    public static boolean task10and20(int a, int b) {
        return (10 <= a + b) && (a + b <= 20);
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println(x + "positive");
        } else {
            System.out.println(x + "negative");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    public static void greetings(String name) {
        System.out.println("Привет," + name + "!);
    }

    public static void year(int year) {
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Год" + year + " високосный");
        else
            System.out.println("Год " + year + " не високосный");
    }
}