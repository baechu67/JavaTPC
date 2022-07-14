import kr.tpc.BookDTO;

public class TPC13 {
    public static void main(String[] args) {
        String title = "스프링";
        int price = 25000;
        String company = "제이펍";
        int page = 890;

        // 책(객체) -> class BookDTO(객체 설계 도구) -> 객체 -> 인스턴스
        // 인스턴스: 메모리에 로딩된 객체의 실체를 말하는 용어
        BookDTO bookDTO;        // bookDTO: 객체 (변수)
        bookDTO = new BookDTO(title, price, company, page); // bookDTO: 인스턴스를 가리키는 인스턴스 변수 -> 간단하게 인스턴스라고도 함

        // Call By Reference
        printBookInfo(bookDTO);
    }

    public static void printBookInfo(BookDTO bookDTO) {
        System.out.printf("책 제목: %s\n", bookDTO.title);
        System.out.printf("책 가격: %s\n", bookDTO.price);
        System.out.printf("책 출판사: %s\n", bookDTO.company);
        System.out.printf("책 페이지: %s\n", bookDTO.page);
    }
}
