package kr.tpc;

public class Overload {
    // 메서드로만 이루어진 객체 설계

    // 메서드 오버로딩: 메서드 중복 정의 -> 메서드의 시그니쳐(매개변수 타입, 개수)만 다르면 됨
    // 메서드 오버로딩은 정적 바인딩된다. (정적 바인딩: 컴파일 시점에 호출될 메서드가 이미 결정되어 있는 바인딩)
    // 따라서 속도와 무관하다.

    // 메서드 오버로딩
    // 컴파일 시, 내부적으로 plus_int_int 메서드 이름으로 바뀜
    public void plus(int a, int b) {
        System.out.printf("두 정수의 합: %d\n", a + b);
    }

    // 메서드 오버로딩
    // 컴파일 시, 내부적으로 plus_float_int 메서드 이름으로 바뀜
    public void plus(float a, int b) {
        System.out.printf("하나의 실수와 하나의 정수의 합: %f\n", a + b);
    }

    // 메서드 오버로딩
    // 컴파일 시, 내부적으로 plus_float_float 메서드 이름으로 바뀜
    public void plus(float a, float b) {
        System.out.printf("두 실수의 합: %f\n", a + b);
    }
}
