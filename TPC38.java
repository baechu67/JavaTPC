import kr.bit.Book;
import kr.tpc.BookDTO;
import kr.tpc.BookVO;

import java.util.ArrayList;
import java.util.List;

public class TPC38 {
    public static void main(String[] args) {
        // BookDTO 타입의 객체만 저장할 수 있도록 제네릭 사용할 수 있다: Object[] ---> BookDTO[]
        // 실제로 ArrayList에 객체를 저장할 때 서로 다른 타입의 객체를 함께 저장하는 일은 매우 드물다.
        // 따라서 제네릭을 사용하면 다른 타입의 객체를 저장할 수 없고 한 타입의 객체만 저장할 수 있으므로 조금 더 안정적으로 사용 가능하다.
        List<BookDTO> list = new ArrayList<>(1);

        // ArrayList 생성 시 1로 초기화하여도 객체를 더 넣을 수 있음(길이 제약 없음)
        list.add(new BookDTO("자바", 12000, "이지스", 700));
        list.add(new BookDTO( "C언어", 17000, "에이콘", 800));
        list.add(new BookDTO("파이썬", 15000, "제이펍", 900));

        // BookDTO 타입의 객체가 아니면 추가할 수 없음
//        list.add(new BookVO());

        for (BookDTO bookDTO : list) {
            System.out.printf("%s %d %s %d\n", bookDTO.title, bookDTO.price, bookDTO.company, bookDTO.page);
        }
    }
}
