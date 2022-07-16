import kr.poly.A;

public class TPC28 {
    public static void main(String[] args) {
        // A 클래스 객체 직접 생성
        A a = new A();
        a.display();
        System.out.println(a.toString());   // 재정의된 toString() 메서드 호출
        System.out.println(a);              // toString() 생략 가능

        // 업캐스팅하여 A 클래스 객체 생성
        Object obj = new A();
        ((A) obj).display();
        System.out.println(obj.toString());     // A 클래스에서 toString() 메서드를 재정의하므로 재정의된 toString() 메서드 호출
    }
}
