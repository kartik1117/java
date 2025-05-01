import java.util.Scanner;

class a3 {
    static void sum(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(i);

        }

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        sum(a);
        System.out.println(a);
    }

}
