import kr.inflearn.IntArray;

public class TPC36 {
    public static void main(String[] args) {
        // 정수 3개를 저장하는 배열
        int[] intArr = new int[3];
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 30;

        System.out.println("일반적인 int 배열 사용하기");
        System.out.println(intArr[1]);
        System.out.println(intArr.length);

        for(int num : intArr) {
            System.out.println(num);
        }

        // int 배열처럼 동작하는 클래스 객체를 생성하여 객체지향적으로 사용하기
        IntArray arr = new IntArray(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println("int 배열처럼 동작하는 클래스 사용하기");

        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
