package kr.poly;

// RemoCon 인터페이스를 상속하는 것이 아니라, 인터페이스의 추상 메서드를 구현한다는 점에서 implements 키워드를 사용한다.
public class TV implements RemoCon {
    int currentCh = 70;

    // 추상 메서드 재정의
    @Override
    public void chUp() {
        if (currentCh < MAX_CH) {
            currentCh++;
            System.out.println("TV의 채널이 올라간다. 채널: " + currentCh);
        } else {
            currentCh = MIN_CH;
            System.out.println("TV의 채널이 1로 돌아간다.");
        }
    }

    // 추상 메서드 재정의
    @Override
    public void chDown() {
        if (currentCh > MIN_CH) {
            currentCh--;
            System.out.println("TV의 채널이 내려간다. 채널: " + currentCh);
        } else {
            currentCh = MAX_CH;
            System.out.println("TV의 채널이 100으로 돌아간다.");
        }
    }

    // 추상 메서드 재정의
    @Override
    public void internet() {
        System.out.println("TV에서 인터넷이 동작한다.");
    }

    // TV 클래스만의 기능 구현도 가능
    // ...
}
