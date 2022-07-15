import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
    public static void main(String[] args) {
        // 추상 클래스의 객체 생성 불가능
        // Animal ani = new Animal();

        // 추상 클래스는 업캐스팅(상위 클래스 역할)으로 사용된다.
        Animal animal = new Dog();
        animal.eat();           // 재정의된 메서드 실행 -> 다형성 보장
        animal.move();          // 상속한 구현 메서드 실행 -> 공통 기능

        animal = new Cat();
        animal.eat();           // 재정의된 메서드 실행 -> 다형성 보장
        animal.move();          // 상속한 구현 메서드 실행 -> 공통 기능
        ((Cat) animal).night();
    }
}
