 class palindrome {
    public static void main(String[] args) {
        long a = 111122221111l;
        long original = a;
        long res = 0;
        while (a>0) {
            long digit = a%10;
            res = res * 10+digit;
            a = a/10;
        }
     if (original == res){
        System.out.println("yes");
    } else{
        System.out.println("no");
    }
    }}
