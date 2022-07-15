package kr.poly;

// RemoCon 인터페이스를 상속하는 것이 아니라, 인터페이스의 추상 메서드를 구현한다는 점에서 implements 키워드를 사용한다.
public class TV implements RemoCon {
    // 추상 메서드 재정의
    @Override
    public void chUp() {
        System.out.println("TV의 채널이 올라간다.");
    }

    // 추상 메서드 재정의
    @Override
    public void chDown() {
        System.out.println("TV의 채널이 내려간다.");
    }

    // 추상 메서드 재정의
    @Override
    public void internet() {
        System.out.println("TV에서 인터넷이 동작한다.");
    }

    // TV 클래스만의 기능 구현도 가능
    // ...
}
