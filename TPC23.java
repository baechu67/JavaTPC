import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {
    public static void main(String[] args) {
        // 1. 다형성인수
        Dog dog = new Dog();
        Cat cat = new Cat();

        display(dog);
        display(cat);
    }

    // 다형성인수: animal -> Animal 클래스를 상속받는 모든 클래스의 객체를 전달받을 수 있다.
    // 업캐스팅되어 전달됨
    public static void display(Animal animal) {
        animal.eat();

        if (animal instanceof Cat) {
            ((Cat) animal).night();
        }
    }
}
