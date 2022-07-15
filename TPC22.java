import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
    public static void main(String[] args) {
        // 업캐스팅(자동 형변환)
        Animal animal = new Cat();

        // 컴파일 시점: Animal 클래스에서 정의한 eat() 메서드
        // 런타임 시점: Cat 클래스에서 재정의한 eat() 메서드
        // -> 재정의된 메서드는 동적 바인딩 방식 사용
        animal.eat();

        // 다운캐스팅(강제 형변환)
        Cat cat = (Cat) animal;

        // Animal 클래스에 night() 메서드가 정의되어 있지 않기 때문에
        // Cat 클래스로 다운캐스팅하여 night() 메서드 호출
        cat.night();

        // 또는
        ((Cat) animal).night();

        // 업캐스팅
        animal = new Dog();
        animal.eat();   // 동적 바인딩
        // 다형성: 상위클래스가 하위클래스에게 동일한 메세지를 전달하더라도 하위클래스에서 서로 다르게 동작하는 원리

        // 업캐스팅
        Object obj = new Dog();

        // 다운캐스팅
        ((Dog) obj).eat();
    }
}
