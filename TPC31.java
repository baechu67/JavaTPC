import kr.tpc.Inflearn;

public class TPC31 {
    public static void main(String[] args) {
        // 객체(인스턴스)를 생성하지 않고도 클래스 메서드 호출 가능
        Inflearn.java();
        Inflearn.tpc();

        // Java API private 생성자와 클래스 메서드 예시1
        System.out.println("출력");

        // Java API private 생성자와 클래스 메서드 예시2
        int max = Math.max(10, 30);
        System.out.println(max);
    }
}
