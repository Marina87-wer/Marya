public class Main {

       public static void main(String[] args) {

            int[] interArray = {1, 0, 1, 1, 0};
            for (int i = 0; i < interArray.length; i++) System.out.print(i + "-" + interArray[i] + " ");

            int[] interArrray = {1, 0, 1, 1, 0};
            for (int i = 0; i < interArray.length; i++)
                if (interArrray[i] == 1) {
                    interArray[i] = 0;
                } else interArray[i] = 1;
            for (int i = 0; i < interArray.length; i++) {
                System.out.println(i + "-" + interArray[i] + " ");
            }
            fillArray();
            otherArr();
            fillDiagonal();
            int[] arr5 = getArray(8, 10);
            for (int i = 0; i < arr5.length; i++) {
                System.out.println(arr5[i] + "");
            }


        }


        public static void fillArray() {
            int[] arr;
            arr = new int[100];
            for (int i = 0; i < 100; i++) {
                arr[i] = i + 1;
                System.out.println("arr[" + i + "] = " + arr[i]);

            }

        }

        public static void otherArr() {
            int[] arr3;
            arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < 6) {
                    arr3[i] *= 2;
                    System.out.println(arr3[i] + "");
                }

            }


        }


        public static void fillDiagonal() {


            int[][] arr4 = new int[4][4];
            for (int i = 0; i < arr4.length; i++) {
                arr4[i][i] = 1;
                arr4[i][arr4.length - 1 - i] = 1;
            }
            for (int i = 0; i < arr4.length; i++) {
                for (int j = 0; j < arr4.length; j++) {
                    System.out.println(arr4[i][j] + "");

                }
            }

        }

        public static int[] getArray(int len, int initialValue) {
            int[] result = new int[len];
            for (int i = 0; i < result.length; i++) {
                result[i] = initialValue;

            }
            return result;
        }


}





