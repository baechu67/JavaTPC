import kr.tpc.MemberVO;

public class TPC14 {
    public static void main(String[] args) {
        MemberVO memberVO = new MemberVO();

        // setter method 호출하여 객체의 상태정보에 값 쓰기
        memberVO.setName("홍길동");
        memberVO.setAge(50);
        memberVO.setTel("010-1111-1111");
        memberVO.setAddr("서울");

        // getter method 호출하여 객체의 상태정보의 값 읽기
        System.out.printf("이름: %s\n", memberVO.getName());
        System.out.printf("나이: %d\n", memberVO.getAge());
        System.out.printf("번호: %s\n", memberVO.getTel());
        System.out.printf("주소: %s\n", memberVO.getAddr());
    }
}
