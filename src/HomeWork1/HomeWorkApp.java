package HomeWork1;


public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();   // первый вариант решения
        checkSumSign2();  // второй вариант решения
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }


    // первый вариант решения

    public static void checkSumSign() {
        int a = 20;
        int b = 10;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // второй вариант решения

    public static void checkSumSign2() {
        int a = -20;
        int b = 10;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = -121;

        if (value <= 0) {
            System.out.println("Красный");
            return;
        }
        if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 29;
        int b = 30;

        if (a >= b) {
            System.out.println(a + " >= " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }

    public static void test(){

    }
}
