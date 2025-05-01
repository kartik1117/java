import java.util.Scanner;

public class a4 {

    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
            for (i = 0; i < arr.length; i++) {
                System.out.print(" " + arr[i]);
            }

        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter array length");
        int len = inp.nextInt();
        int[] arr = new int[len];

        System.out.print("enter value to be inseerted in arr :");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = inp.nextInt();

        }

        bubblesort(arr);

    }
}