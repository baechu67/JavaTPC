public class TPC09 {
    // static: 프로그램 시작 전, method area의 static zone에 로딩됨
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // TPC09 객체 생성: heap area에 실제 객체가 생성됨
        // 객체가 생성되고 plus 메서드가 method area의 non-static zone에 기계어로 로딩됨
        // 생성된 객체에는 plus 메서드를 가리키는 포인터가 저장됨
        TPC09 tpc09 = new TPC09();
        System.out.println(tpc09.plus(a, b));
    }

    // non-static: 객체가 생성되면 method area의 non-static zone에 기계어로 로딩됨
    public int plus(int a, int b) {
        return a + b;
    }
}
