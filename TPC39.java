public class TPC39 {
    public static void main(String[] args) {
        // Wrapper 클래스
        int a = 1;
        Integer b = new Integer(1);     // 정상적인 방법: new로 객체 생성
        Integer c = 1;                        // boxing: 컴파일러가 자동 처리함
        System.out.println(b.intValue());
        System.out.println(b.toString());

        // Wrapper 클래스 사용 이유
        Object[] objects = new Object[3];
        objects[0] = new Integer(1);
        objects[1] = new Integer(2);
        objects[2] = new Integer(3);
        System.out.println(objects[0].toString());
        System.out.println(objects[1]);             // toString() 메서드 생략 가능
        System.out.println(objects[2]);             // toString() 메서드 생략 가능

        Object[] objects1 = new Object[3];
        objects1[0] = 1;        // boxing
        objects1[1] = 2;        // boxing
        objects1[2] = 3;        // boxing
        System.out.println(objects1[0]);
        System.out.println(objects1[1]);
        System.out.println(objects1[2]);

        // "100" + "100" = 200
        String str1 = "100";
        String str2 = "100";
        System.out.println(str1 + str2);        // "100100": 문자열 결합

        // Integer 클래스 static 메서드 parseInt: 정수로 변환할 수 있는 문자열을 정수로 변환하여 반환하는 메서드
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));    // 200

        // 100 + 100 = "100100"
        int num1 = 100;
        int num2 = 100;
        System.out.println(num1 + num2);        // 200
        System.out.println(String.valueOf(num1) + String.valueOf(num2));    // "100100"
    }
}
