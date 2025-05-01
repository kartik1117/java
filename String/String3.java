class String3 {
    public static int findMissingNumber(int[] arr, int n) {
        int Sum = n * (n + 1) / 2;
        int Sum1 = 0;
        for (int num : arr) {
            Sum1 += num;
        }
        return Sum - Sum1;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 4, 5, 6 };
        int s = findMissingNumber(numbers, 6);
        System.out.println("The missing number is: " + s);

    }
}
