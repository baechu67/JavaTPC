//import java.lang.*;   디폴트 패키지(생략)

public class TPC34 {
    public static void main(String[] args) {
//        java.lang.String str = new java.lang.String("Java");

        String str = new String("Java");
        System.out.println(str.toLowerCase());      // java
        System.out.println(str.charAt(2));          // v
        System.out.println(str.length());           // 4
        System.out.println(str.indexOf("va"));      // 2
        System.out.println(str.indexOf("VA"));      // -1: 찾을 수 없음
        System.out.println(str.replaceAll("a", "x"));
    }

}
