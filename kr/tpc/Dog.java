package kr.tpc;

public class Dog extends Animal {
    // 이름, 나이, 종: 상태정보


    public Dog() {
        super();        // new Animal(); -> Animal 생성자 메서드 호출
    }

    // 상속받은 eat() 메서드 재정의(override)
    @Override
    public void eat() {
        System.out.println("개처럼 먹는다.");
    }
}
