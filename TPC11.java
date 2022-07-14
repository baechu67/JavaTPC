import kr.tpc.BookVO;

public class TPC11 {
    public static void main(String[] args) {
        // 책 1권을 저장하기 위한 객체를 생성하기: new + 생성자 메서드
        BookVO bookVO = new BookVO();
        bookVO.title = "Head First Java";
        bookVO.price = 30000;
        bookVO.company = "한빛미디어";
        bookVO.page = 700;
        System.out.printf("책 제목: %s\n", bookVO.title);
        System.out.printf("책 가격: %d\n", bookVO.price);
        System.out.printf("책 출판사: %s\n", bookVO.company);
        System.out.printf("책 페이지: %d\n", bookVO.page);

        System.out.println("--------------");

        // 책 1권을 저장하기 위한 객체를 생성하기: new + 생성자 메서드
        BookVO bookVO1 = new BookVO();
        bookVO1.title = "오라클";
        bookVO1.price = 16000;
        bookVO1.company = "이지스퍼블리싱";
        bookVO1.page = 560;
        System.out.printf("책 제목: %s\n", bookVO1.title);
        System.out.printf("책 가격: %d\n", bookVO1.price);
        System.out.printf("책 출판사: %s\n", bookVO1.company);
        System.out.printf("책 페이지: %d\n", bookVO1.page);
    }
}
