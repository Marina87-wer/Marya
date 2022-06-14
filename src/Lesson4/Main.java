package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] field = initField(3);
        printField(field);


        while (true) {
            humanTurn(field);
            printField(field);
            if (isDraw(field)) ;
            {
                break;
            }

            if (isWinner(field, "X")) {
                System.out.println("Вы победили!!!");
                break;

                aiTurn(field);
                printField(field);
                if (isDraw(field)) ;
                {
                    break;
                }
                if (isWinner(field, "0")) {
                    System.out.println("Комп победил ((");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }


        public static String[][] initField( int size){
            String[][] field = new String[size][size];
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    field[i][j] = "*";

                }
            }


            return field;
        }

        public static void printField (String[][]field){
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }

        }

        public static void humanTurn (String[][]field){
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Укажите клетку по x и y");
                int x = scanner.nextInt() - 1;
                int y = scanner.nextInt() - 1;
                int size = field.length;
                if (x < size && y < size && x >= 0 && y >= 0) {
                    if (field[x][y].equals("*")) {

                        field[x][y] = "X";
                        break;

                    } else {
                        System.out.println("Вы сходили не туда");
                    }


                } else {
                    System.out.println("Вы тыкнули не игровое поле");
                }

            }
        }

        public static void aiTurn (String[][]field){
            Scanner scanner = new Scanner(System.in);
            while (true) {
                Random random = new Random();
                int x = random.nextInt(field.length);
                int y = random.nextInt(field.length);
                int size = field.length;
                if (field[x][y].equals("*")) {
                    field[x][y] = "0";
                    break;
                }
            }
            System.out.println("Комп сходил");
        }

        public static boolean isDraw (String[][]field){
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    if (field[i][j].equals("*")) {
                        return false;
                    }
                }

            }
            return true;

        }

        public static boolean isWinner (String[][]field, String turn){
            for (int i = 0; i < field.length; i++) {
                boolean isWin = true;
                for (int j = 0; j < field[i].length; j++) {
                    if (!field[i][j].equals(turn)) {
                        isWin = false;
                        break;
                    }
                }
                if (isWin) {
                    return true;
                }
            }

            for (int i = 0; i < field.length; i++) {
                boolean isWin = true;
                for (int j = 0; j < field[i].length; j++) {
                    if (!field[j][i].equals(turn)) {
                        isWin = false;
                        break;
                    }
                }
                if (isWin) {
                    return true;
                }
            }

            boolean isWin = true;
            for (int i = 0; i < field.length; i++) {
                if (!field[i][i].equals(turn)) {
                    isWin = false;
                    break;
                }

            }

            if (isWin) {
                return true;
            }
            isWin = true;
            for (int i = 0; i < field.length; i++) {
                if (!field[i][(field.length - 1) - i].equals(turn)) {
                    isWin = false;
                    break;
                }

            }

            if (isWin) {
                return true;
            }
        }
    }
}