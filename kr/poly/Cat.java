package kr.poly;

public class Cat extends Animal {
    // 상속받은 eat() 추상 메서드 재정의(override)
    @Override
    public void eat() {
        System.out.println("고양이처럼 먹는다.");
    }

    public void night() {
        System.out.println("밤에 고양이 눈에서 빛이 난다.");
    }
}
