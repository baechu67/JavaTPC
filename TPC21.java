import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
    public static void main(String[] args) {
        // 상위 클래스를 이용하지 않는 방식
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        cat.eat();

        // Dog.java, Cat.java (X)
        // Dog.class, Cat.class (O)
        // 상위 클래스를 이용하는 방식
        Animal animal = new Dog();  // 업캐스팅
        animal.eat();       // Animal 클래스의 eat() 메서드가 아니라 하위 클래스인 Dog 클래스에서 재정의한 eat() 메서드 호출

        animal = new Cat();
        animal.eat();       // Animal 클래스의 eat() 메서드가 아니라 하위 클래스인 Cat 클래스에서 재정의한 eat() 메서드 호출

        // 다운캐스팅
        ((Cat) animal).night();     // Cat 클래스 고유의 night() 메서드를 호출하려면 Cat 타입으로 다운캐스팅해야 한다.
    }
}
