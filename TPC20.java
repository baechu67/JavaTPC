import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();      // 재정의한 eat() 메서드 호출

        Cat cat = new Cat();
        cat.eat();      // 재정의한 eat() 메서드 호출
        cat.night();

        // **중요: 상속 관계**
        // 객체를 직접 설계해서 사용하는 경우라면 위와 같은 방법으로 객체를 생성하고 사용할 수 있다.
        // 하지만 다른 사람이 설계한 객체의 컴파일된 코드(Dog.class, Cat.class)를 받아서 사용하는 경우라면 어떻게 해야 할까?
        // 이럴 때는 Dog, Cat 클래스의 상위 클래스인 Animal 클래스와 재정의를 사용해서 하위 클래스의 메서드에 접근할 수 있다.

        // Animal 클래스를 상속하는 Dog 클래스의 객체 생성
        // Dog 클래스의 객체를 Animal 클래스(타입)으로 참조한다:
        // 하위 클래스의 객체를 상위 클래스로 참조하는 것을 업캐스팅(upcasting)이라고 한다.
        // 업캐스팅은 자동으로 형변환된다.
        Animal animal = new Dog();
        animal.eat();   // Animal 클래스의 eat() 메서드가 아니라 Dog 클래스에서 재정의한 eat() 메서드가 호출됨

        animal = new Cat();
        animal.eat();   // Animal 클래스의 eat() 메서드가 아니라 Cat 클래스에서 재정의한 eat() 메서드가 호출됨

        // 하지만 Cat 클래스에서 정의한 night() 메서드는 Animal 클래스에 정의되어 있지 않으므로 night() 메서드를 호출할 수 없다.
        // night() 메서드를 호출하려면 Animal 클래스로 참조하던 것을 Cat 클래스로 참조한다고 명시해야 한다.
        // 이것을 다운캐스팅(downcasting)이라고 한다.
        // 다운캐스팅은 강제로 형변환 해야 한다.
//        animal.night();
        ((Cat) animal).night();
    }
}
