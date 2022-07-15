import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC26 {
    public static void main(String[] args) {
        // RemoCon 인터페이스는 스스로 객체를 생성할 수 없다.
        // RemoCon remo = new RemoCon();

        // TV 객체 생성 시 RemoCon 인터페이스로 업캐스팅
        RemoCon remoCon = new TV();
        remoCon.chUp();             // 재정의한 메서드 실행 -> 다형성 보장
        remoCon.chDown();           // 재정의한 메서드 실행 -> 다형성 보장
        remoCon.internet();         // 재정의한 메서드 실행 -> 다형성 보장

        // Radio 객체 생성 시 RemoCon 인터페이스로 업캐스팅
        remoCon = new Radio();
        remoCon.chUp();             // 재정의한 메서드 실행 -> 다형성 보장
        remoCon.chDown();           // 재정의한 메서드 실행 -> 다형성 보장
        remoCon.internet();         // 재정의한 메서드 실행 -> 다형성 보장
    }
}
