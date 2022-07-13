public class TPC05 {
    public static void main(String[] args) {
        // arr1 변수는 길이가 3인 배열 객체를 가리킨다(주소값을 저장한다)
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        int sum = 0;
        for (int num : arr1) {
            sum += num;
        }
        System.out.println(sum);

        // arr2 변수는 길이가 3인 배열 객체를 가리킨다(주소값을 저장한다) -> 행
        // 그리고 arr2 변수가 가리키는 길이가 3인 배열 객체의 각 요소는 길이가 3인 배열 객체를 가리킨다(주소값을 저장한다) -> 열
        int[][] arr2 = new int[3][3];

        // 1행
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;

        // 2행
        arr2[1][0] = 1;
        arr2[1][1] = 2;
        arr2[1][2] = 3;

        // 3행
        arr2[2][0] = 1;
        arr2[2][1] = 2;
        arr2[2][2] = 3;

        // arr2 배열의 모든 요소 출력하기
        for (int[] row : arr2) {
            for (int element : row) {
                System.out.printf("%d ", element);
            }
            System.out.println();
        }

        // 가변길이 배열
        int[][] star = new int[5][];
        star[0] = new int[1];
        star[1] = new int[2];
        star[2] = new int[3];
        star[3] = new int[4];
        star[4] = new int[5];

        // 별 문자 출력하기
        for (int[] row : star) {
            for (int element : row) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
