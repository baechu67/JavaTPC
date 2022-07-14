package kr.tpc;

/**
 * 책(Object)의 상태정보: 제목, 가격, 출판사, 페이지수, ...
 * 책의 상태정보를 모델링하여 제목, 가격, 출판사, 페에지수만 사용하여 객체를 설계한다.
 * VO: Value Object
 */
public class BookVO {
    public String title;
    public int price;
    public String company;
    public int page;

    // 생성자: 객체 생성 -> 초기화
    // 디폴트 생성자 메서드 정의
    public BookVO() {
        // 겍체 생성 후 초기화 작업 진행
        this.title = "자바";
        this.price = 14000;
        this.company = "한빛미디어";
        this.page = 789;
    }

    // 생성자 메서드 오버로딩
    // 생성자 메서드를 오버로딩하면 디폴트 생성자가 자동으로 삽입되지 않는다.
    public BookVO(String title, int price, String company, int page) {
        // 객체 생성 후 초기화 작업 진행
        this.title = title;
        this.price = price;
        this.company = company;
        this.page = page;
    }
}
