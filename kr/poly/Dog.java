package kr.poly;

public class Dog extends Animal {
    // 상속받은 eat() 추상 메서드 재정의(override)
    @Override
    public void eat() {
        System.out.println("개처럼 먹다.");
    }
}
