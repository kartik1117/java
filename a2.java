public class a2 {
    static int a = 20;
    int b = 23;

    public static void main(String[] args) {
        a2 obj = new a2();
        int c = 22;
        System.out.println("the value of instance level variable" + obj.b);
        System.out.println("the value of local variable" + c);
        System.out.println("the value of static variable " + a);
    }
}