package kr.tpc;

public class Inflearn {

    // 외부에서 객체를 생성하지 못하도록 생성자에 private 접근 제어 지시자 사용
    private Inflearn() {}

    // 외부에서 객체를 사용하지 못하므로 메서드 선언 시 클래스 메서드로 선언함
    // 클래스 메서드: 객체(인스턴스)를 생성하지 않아도 호출할 수 있는 메서드, 클래스 이름으로 접근 가능함
    public static void tpc() {
        System.out.println("TPC 강의 너무 재미있다.");
    }

    // 클래스 메서드
    public static void java() {
        System.out.println("자바 강의 너무 재미있다.");
    }
}
