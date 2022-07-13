public class TPC04 {
    public static void main(String[] args) {
        // 4. 데이터를 이동하라(변수 vs. 배열)
        // 변수
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;

        // a + b + c 의 결과를 메서드로 처리하기
        plusVariables(a, b, c);

        // 배열
        int[] intArr = new int[3];
        intArr[0] = a;
        intArr[1] = b;
        intArr[2] = c;

        // 배열 요소의 덧셈 결과를 메서드로 처리하기
        plusArray(intArr);
    }

    public static void plusVariables(int x, int y, int z) {
        System.out.printf("변수 덧셈 결과: %d\n", x + y + z);
    }

    public static void plusArray(int[] arr) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        System.out.printf("배열 덧셈 결과 : %d\n", sum);
    }
}
