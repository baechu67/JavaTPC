import kr.tpc.BookVO;

public class TPC12 {
    public static void main(String[] args) {
        // 디폴트 생성자로 객체 생성 후 초기화 진행
        BookVO bookVO1 = new BookVO();
        System.out.printf("책 제목: %s\n", bookVO1.title);
        System.out.printf("책 가격: %d\n", bookVO1.price);
        System.out.printf("책 출판사: %s\n", bookVO1.company);
        System.out.printf("책 페이지: %d\n", bookVO1.page);

        System.out.println("----------------");

        // 디폴트 생성자로 객체 생성 후 초기화 진행
        BookVO bookVO2 = new BookVO();
        System.out.printf("책 제목: %s\n", bookVO2.title);
        System.out.printf("책 가격: %d\n", bookVO2.price);
        System.out.printf("책 출판사: %s\n", bookVO2.company);
        System.out.printf("책 페이지: %d\n", bookVO2.page);

        System.out.println("----------------");

        // 오버로딩한 생성자로 객체 생성 후 초기화 진행
        BookVO bookVO3 = new BookVO("파이썬", 18000, "한빛미디어", 900);
        System.out.printf("책 제목: %s\n", bookVO3.title);
        System.out.printf("책 가격: %d\n", bookVO3.price);
        System.out.printf("책 출판사: %s\n", bookVO3.company);
        System.out.printf("책 페이지: %d\n", bookVO3.page);
    }
}
