package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class XOgame {

    static final int SIZE = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '_';

    static char[][] map;

    static final Scanner sc = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Human win");
                break;
            }
            if (isFull()) {
                System.out.println("Draw");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Ai win");
                break;
            }
            if (isFull()) {
                System.out.println("Draw");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");

            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c|", map[i][j]);
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;

        do {
            System.out.println("enter a number Y, X");
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;

    }

    public static void aiTurn() {
        int x, y;

        do {

            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;

    }

    public static boolean isCellValid(int y, int x) {

        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }

            }

        }
        return true;
    }

    public static boolean checkWin(char c) {
        if (map[0][0] == c && map[0][1] == c && map[0][2] == c) {
            return true;
        }
        if (map[1][0] == c && map[1][1] == c && map[1][2] == c) {
            return true;
        }
        if (map[2][0] == c && map[2][1] == c && map[2][2] == c) {
            return true;
        }

        if (map[0][0] == c && map[1][0] == c && map[2][0] == c) {
            return true;
        }
        if (map[0][1] == c && map[1][1] == c && map[2][1] == c) {
            return true;
        }
        if (map[0][2] == c && map[1][2] == c && map[2][2] == c) {
            return true;
        }

        if (map[0][0] == c && map[1][1] == c && map[2][2] == c) {
            return true;
        }
        if (map[0][2] == c && map[1][1] == c && map[2][1] == c) {
            return true;
        }

        return false;


    }

//    public static boolean checkWin(char c) {          //  Фанзиль, прошу помощи, направьте немного,
                                                         // в край запутался и не могу разобраться..
    //


    //      for (int y = 0; y < SIZE; y++) {
    //          for (int x = 0; x < SIZE; x++) {
    //
    //              if (y == x) {
    //                  int[y][x] =1;
    //              }
    //              if ( y + x == aiTurn();humanTurn();-1);
    //              {
    //                  int[y][x] =-1;
    //              }
    //             if (map[y][x] == humanTurn) return false;
    //             if (map[y][x] == aiTurn) return false;
    //             else {
    //                 return true;
    //             }
    //         }
    //     }
    // }
}


