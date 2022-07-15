package kr.poly;

// 인터페이스도 추상 클래스처럼 불완전한 객체이다.
// 인터페이스는 추상 메서드를 선언하는 불완전한 객체이므로 스스로 객체 생성 불가능: 추상 클래스와 유사함
// -> RemoCon remoCon = new RemoCon(); (X: 객체 생성 불가능)
// 인터페이스는 스스로 객체를 생성하지 못하지만, 모든 메서드를 추상 메서드로 선언하고
// 추상 메서드를 하위 클래스에서 반드시 재정의하게 함으로써 다형성을 보장한다.
public interface RemoCon {

    // 인터페이스 상수 사용 가능
    // -> 인터페이스의 객체를 생성할 수 없으므로 인스턴스 변수를 사용할 수 없다.
    // -> 인터페이스는 일종의 규약이므로 인터페이스에서 변수를 사용하는 것은 인터페이스 사용 취지와 맞지 않기 때문에 상수로 사용한다.
    // public static final 생략됨(암시적)
    int MAX_CH = 100;       // 접근법: RemoCon.MAX_CH
    int MIN_CH = 0;         // 접근법: RemoCon.MIN_CH

    // 추상 메서드 선언
    // abstract 키워드 생략됨(암시적)
    public void chUp();
    public void chDown();
    public void internet();
}
