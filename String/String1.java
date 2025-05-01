public class String1 {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append("hii");
        System.out.println(str);
        System.out.println(str.capacity());
        System.out.println(str.length());

        StringBuffer strr = new StringBuffer("hello");
        strr.append("hii");
        System.out.println(strr);
    }
}