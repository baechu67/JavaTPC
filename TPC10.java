// kr 패캐지 내부의 tpc 패키지에 생성한 BookDTO 클래스 임포트
import kr.tpc.BookDTO;

public class TPC10 {
    public static void main(String[] args) {
        // new와 생성자 메서드를 사용하여 BookDTO 객체 생성: 힙 영역에 로딩됨
        BookDTO bookDTO = new BookDTO();

        // 이제 bookDTO 참조 자료형 변수는 BookDTO 타입의 객체를 가리킨다.
        bookDTO.title = "디지털 포트리스";
        bookDTO.price = 13000;
        bookDTO.company = "대교베텔스만";
        bookDTO.page = 320;
        System.out.printf("책 제목: %s\n", bookDTO.title);
        System.out.printf("책 가격: %d\n", bookDTO.price);
        System.out.printf("책 출판사: %s\n", bookDTO.company);
        System.out.printf("책 페이지: %d\n", bookDTO.page);
    }
}
