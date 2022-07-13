public class TPC06 {
    public static void main(String[] args) {
        // 메서드: 동작이나 기능
        int a = 100;
        int b = 200;
        System.out.println(plus(a, b));

        int sum = 0;
        int[] intArr = makeIntArr();
        for (int num : intArr) {
            sum += num;
        }
        System.out.println(sum);
    }

    // 정수 2개를 매개변수로 받아 두 매개변수의 합을 구하여 리턴하는 메서드
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int[] makeIntArr() {
        int[] intArr = new int[3];
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 30;
        return intArr;
    }
}
