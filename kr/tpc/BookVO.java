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

    // 디폴트 생성자 메서드 생략
}
