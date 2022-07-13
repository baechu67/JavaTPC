public class TPC07 {
    public static void main(String[] args) {
        int a = 10;
        float b = 56.7f;

        // Call By Value(값을 전달하여 메서드 호출)
        System.out.println(plus(a, b));

        int[] intArr = {1, 2, 3, 4, 5};

        // Call By Reference(참조를 전달하여 메서드 호출)
        System.out.println(getSum(intArr));
    }

    public static float plus(int a, float b) {
        return a + b;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
