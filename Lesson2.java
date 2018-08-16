/**
*Java1.Lesson2
*@author Evdokimov Maksim
*@version 16.08.2018
 */

public class Lesson2 {

    public static void main(String[] args) {
        //Change number in array - 1 instead 0
        convert();
        System.out.println();

        //Filling array
        createArr();
        System.out.println();

        //Increase number less 2
        lessSix();
        System.out.println();

        //Choose Min and Max
        minMax();
        System.out.println();

        //Filling diagonal in two-dementional array
        diagonal();

    }

    public static void convert() {
        int arr[] = {0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        for (int o : arr) {
            System.out.print(o + " ");
        }
    }

    public static void createArr() {
        int arrr[] = new int[8];
        for (int i = 0, j = 0; i < arrr.length; i++, j = j + 3) {
            arrr[i] = j;
        }
        for (int o : arrr) {
            System.out.print(o + " ");
        }
    }

    public static void lessSix() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        for (int o : arr) {
            System.out.print(o + " ");
        }
    }

    public static void minMax() {
        int arr[] = {1, -5, 3, 2, 1156, 4, 5, 2, 4, 8, 9, 1};
        int min = arr[1];
        int max = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }
        System.out.println("Min figure: " + min);
        System.out.println("Max figure: " + max);
    }

    public static void diagonal() {
        int arr[][] = new int[5][5];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            arr[i][j] = 1;
        }

        for (int i = 0, x = arr.length - 1; i < arr.length; i++, x--) {
            arr[i][x] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }


}
