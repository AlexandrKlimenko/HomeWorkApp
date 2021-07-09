package HomeWork2;

public class Homework2 {
    public static void main(String[] args) {

        checkValue(5, 5);
        checkNumber(-5);
        whyNumber(9);
        printWord(2, "word");

    }


    // 1 задание
    public static boolean checkValue(int a, int b) {
        return (a + b >= 10 && a + b <= 20);

    }

    // 2 задание
    public static void checkNumber(int a) {
        if (a <= 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("число положительное");
        }
    }

    // 3 задание
    private static boolean whyNumber(int a) {
        return (a >= 0);
    }


    // 4 задание                          // не смог понять, как сделать задание без дополнительной переменной.
    public static void printWord(int quantity, String d) {
        int i = 0;
        for (i = 0; i < quantity; i++) {
            System.out.println(d);
        }

    }
}
