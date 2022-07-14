import kr.tpc.Overload;

public class TPC16 {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.plus(10, 20);          // plus_int_int 메서드 호출(컴파일 단계에서 결정됨)
        overload.plus(10.1f, 20);       // plus_float_int 메서드 호출(컴파일 단계에서 결정됨)
        overload.plus(10.1f, 10.1f);    // plus_float_float 메서드 호출(컴파일 단계에서 결정됨)
    }
}
