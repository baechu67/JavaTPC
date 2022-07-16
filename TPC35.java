public class TPC35 {
    public static void main(String[] args) {
        // new로 String 객체 생성
        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println("-----str1과 str2의 비교-----");

        // 문자열 객체를 비교
        if (str1 == str2) {
            System.out.println("같은 문자열 객체입니다.");
        } else {
            System.out.println("다른 문자열 객체입니다.");    // 출력
        }

        // 실제로 객체가 가지고 있는 문자열끼리 비교
        if (str1.equals(str2)) {
            System.out.println("같은 문자열입니다.");       // 출력
        } else {
            System.out.println("다른 문자열입니다.");
        }


        // 문자열 리터럴로 String 객체 생성
        String str3 = "Java";
        String str4 = "Java";

        System.out.println("-----str3과 str4의 비교-----");

        // 문자열 객체를 비교
        if (str3 == str4) {
            System.out.println("같은 문자열 객체입니다.");        // 출력: 동일한 리터럴로 생성 시, literal pool의 동일한 객체를 공유함
        } else {
            System.out.println("다른 문자열 객체입니다.");
        }

        // 실제로 객체가 가지고 있는 문자열끼리 비교
        if (str3.equals(str4)) {
            System.out.println("같은 문자열입니다.");       // 출력
        } else {
            System.out.println("다른 문자열입니다.");
        }
    }
}
