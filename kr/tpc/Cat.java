package kr.tpc;

public class Cat extends Animal {
    // 이름, 나이, 종: 상태정보

    // 상속받은 eat() 메서드 재정의(override)
    @Override
    public void eat() {
        System.out.println("고양이처럼 먹는다.");
    }

    public void night() {
        System.out.println("밤에 고양이 눈에서 빛이 난다.");
    }
}
