// kr.bit 패키지의 Book 클래스 임포트
import kr.bit.Book;
import kr.bit.Person;

public class TPC03 {
    public static void main(String[] args) {
        // 관계를 이해하라. Primitive Data Type vs. User Defined Data Type
        // 정수 1개를 저장하기 위한 변수를 선언하시오.
        int a;
        a = 10;

        // 책 1권을 저장하기 위한 변수를 선언하시오.
        Book book;
        book = new Book();
        book.title = "Java";
        book.price = 15000;
        book.company = "Hanbit Media";
        book.page = 700;

        System.out.println("-----책 정보 출력-----");
        System.out.println(book.title);
        System.out.println(book.price);
        System.out.println(book.company);
        System.out.println(book.page);

        // 회원 1명을 저장하기 위한 변수를 선언하시오.
        Person person;
        person = new Person();
        person.name = "anonymous";
        person.age = 40;
        person.weight = 68.4f;
        person.height = 176.6f;

        System.out.println("-----회원 정보 출력-----");
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.weight);
        System.out.println(person.height);
    }
}
