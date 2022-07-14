import kr.tpc.MemberVO;

public class TPC15 {
    public static void main(String[] args) {
        MemberVO memberVO = new MemberVO("홍길동", 40, "010-1111-0000", "서울");
        System.out.println(memberVO.toString());
        System.out.println(memberVO);   // 또는 toString() 생략 가능

        MemberVO memberVO1 = new MemberVO();
        memberVO1.setName("나길동");
        memberVO1.setAge(35);
        memberVO1.setTel("010-2222-1111");
        memberVO1.setAddr("광주");

        System.out.println(memberVO1.toString());
        System.out.println(memberVO1);
    }
}
