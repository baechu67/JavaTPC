public class TPC08 {
    // static 키워드: 프로그램 시작 전, Method Area의 static zone에 로딩됨
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = staticPlus(a, b);       // static method call
        System.out.println(sum);
    }

    // static 키워드: 프로그램 시작 전, Method Area의 static zone에 로딩됨
    public static int staticPlus (int a, int b) {
        return a + b;
    }
}
