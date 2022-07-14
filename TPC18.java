//import java.lang.*;     // 디폴트 패키지 임포트(생략): 자주 사용하는 클래스들을 모아놓은 패키지

import com.google.gson.Gson;
import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {
    public static void main(String[] args) {
        // 1. 자바에서 제공하는 클래스들(API)
        // String 객체 생성: str(주소값) -> String 객체(인스턴스)
        String str = new String("Java String");
        System.out.println(str.toLowerCase());      // toLowerCase() 메서드 호출

        // 2. 직접 만들어서 사용하는 클래스(DTO/VO, DAO, Utility class)
        MyUtil myUtil = new MyUtil();
        int sum = myUtil.plus();
        System.out.println(sum);

        // 3. 다른 회사나 개발자가 만들어 제공하는 클래스들(API)
        // Gson 클래스: json 데이터 생성 시 사용하는 클래스 (mvnrepository.com 에서 다운로드)
        Gson gson = new Gson();
        BookVO bookVO = new BookVO("자바", 15000, "한빛미디어", 800);
        String json = gson.toJson(bookVO);
        System.out.println(json);
    }
}
