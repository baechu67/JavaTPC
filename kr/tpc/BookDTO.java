package kr.tpc;

/**
 * 책(객체) 설계
 * 상태정보(속성): 제목, 가격, 출판사, 페이지수
 * DTO: Data Transfer Object
 */
public class BookDTO {
    public String title;
    public int price;
    public String company;
    public int page;

    // default 생성자 메서드 -> 일반적으로 생략되어 있음
    public BookDTO() {
        // 객체 생성 작업(내부적으로 기계어로 설계되어 있음)
    }

    public BookDTO(String title, int price, String company, int page) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.page = page;
    }
}
