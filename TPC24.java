import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {
    public static void main(String[] args) {
        // 2. 다형성배열
        // Dog 객체, Cat 객체를 저장하기 위한 배열을 생성하는 방법은? (배열은 동일한 데이터 타입으로 이루어진 구조)
        // Animal 타입의 배열을 생성한다.
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        display(animals);
    }

    // 다형성배열
    private static void display(Animal[] animals) {
        for(Animal animal : animals) {
            animal.eat();

            if (animal instanceof Cat) {
                ((Cat) animal).night();
            }
        }
    }
}
