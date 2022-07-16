import kr.inflearn.MyClass;     // 클래스 이름으로 외부 패키지의 클래스에 접근하려면 import 해야 한다.

public class TPC33 {
    public static void main(String[] args) {
        // 클래스 풀 네임으로 외부 패키지의 클래스에 접근하기
        kr.inflearn.MyClass myClass = new kr.inflearn.MyClass();
        System.out.println(myClass.plus(10, 100));

        // 클래스 이름으로 외부 패키지의 클래스에 접근하기
        MyClass myClass2 = new MyClass();
        System.out.println(myClass2.plus(10, 100));
    }
}
