import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.eat();

        // Animal <---- [Dog.class, Cat.class]
//        Animal animal = new Dog();
//        animal.eat();
//
//        animal = new Cat();
//        animal.eat();
    }
}
