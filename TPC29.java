import kr.tpc.A;
import kr.tpc.B;

public class TPC29 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        display(a);
        display(b);
    }

    // Object obj: 다형성인수 -> Object 클래스의 모든 하위 클래스의 객체를 받을 수 있다.
    private static void display(Object obj) {
        // Object 타입으로 받지만, 어떤 클래스의 객체인지 확인한 후 다운캐스팅하여 메서드를 호출한다.
        if (obj instanceof A) {
            ((A) obj).go();
        } else {
            ((B) obj).go();
        }
    }
}
