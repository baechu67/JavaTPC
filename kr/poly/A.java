package kr.poly;
import java.lang.*;     // 디폴트 패키지: 생략

// extends Object: 생략
public class A extends Object {

    // 디폴트 생성자: 생략
    public A() {
        super();
    }

    // A 클래스만의 메서드 정의
    public void display() {
        System.out.println("나는 A이다.");
    }

    // Object 클래스의 toString() 메서드 재정의
    @Override
    public String toString() {
        return "재정의된 toString() 메서드입니다.";
    }

}
