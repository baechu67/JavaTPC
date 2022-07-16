package kr.inflearn;        // 패키지 내부에 클래스를 생성하면 패키지 선언문이 등장함

// public 접근권한이므로 패키지 외부에서도 MyClass에 접근 가능함
// 접근권한을 명시하지 않은 default 접근권한의 경우 패키지 내부에서는 public처럼 동작하지만 패키지 외부에서는 private처럼 동작한다.
public class MyClass {
    public int plus(int a, int b) {
        int sum = 0;
        for(int num = a; num <= b; num++) {
            sum += num;
        }
        return sum;
    }
}
