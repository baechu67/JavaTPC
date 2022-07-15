import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC27 {
    public static void main(String[] args) {
        // RemoCon으로 TV 클래스를 구동하기
        RemoCon remoCon = new TV();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.internet();
    }
}
