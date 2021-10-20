package cz.upol.jj.seminar1;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

    }

    public static void prvocisla(int number) {
        if (number <= 1) {
            return;
        }

        System.out.print(2 + ", ");
        if (number == 2) {
            return;
        }

        for (var i = 3; i < number; i += 2) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int max = (int) sqrt(number);
        for (int i = 3; i <= max; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nasob(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if ((a > 0 && b < 0) || (b > 0 && a < 0)) {
            var ret = abs(a);
            var bPositive = abs(b);
            var aPositive = ret;
            for (var i = 0; i < bPositive + 1; i++) {
                ret -= aPositive;
            }
            return ret;
        }
        b = abs(b);
        var ret = abs(a);
        var bPositive = abs(b);
        var aPositive = ret;
        for (var i = 0; i < bPositive - 1; i++) {
            ret += aPositive;
        }
        return ret;
    }

    private static void ctverecVodorovnyVypis(int number) {
        if (number <= 0){
            return;
        }
        System.out.print(" ");
        for (var i = 0; i < number; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private static void ctverecHorizontalniVypis(int number) {
        if (number <= 0){
            return;
        }
        for (var j = 0; j < number; j++) {
            System.out.print("|");
            for (var i = 0; i < number; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void ctverec(int number) {
        ctverecVodorovnyVypis(number);
        ctverecHorizontalniVypis(number);
        ctverecVodorovnyVypis(number);
    }

    public static String slovo(int number) {
        return switch (number) {
            case 1 -> "jedna";
            case 2 -> "dva";
            case 3 -> "tři";
            case 4 -> "čtyři";
            case 5 -> "pět";
            case 6 -> "šest";
            case 7 -> "sedm";
            case 8 -> "osm";
            case 9 -> "devět";
            case 10 -> "deset";
            default -> "neznám";
        };
    }
}