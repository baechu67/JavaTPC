import kr.tpc.A;
import kr.tpc.B;

public class TPC30 {
    public static void main(String[] args) {
        // A, B 클래스의 객체를 저장하는 배열
        Object[] objects = new Object[2];
        objects[0] = new A();
        objects[1] = new B();

        printGo(objects);
    }

    private static void printGo(Object[] objects) {
        for(Object obj : objects) {
            if (obj instanceof A) {
                ((A) obj).go();
            } else {
                ((B) obj).go();
            }
        }
    }
}
