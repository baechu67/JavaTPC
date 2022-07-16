import kr.inflearn.ObjectArray;
import kr.tpc.A;
import kr.tpc.B;

import java.util.ArrayList;

public class TPC37 {
    public static void main(String[] args) {
        ObjectArray objectArray = new ObjectArray(5);
        objectArray.add(new A());
        objectArray.add(new B());
        objectArray.add(new B());
        objectArray.add(new B());
        objectArray.add(new A());
        // ObjectArray 객체 생성 시 5를 전달했기 때문에 더이상 객체를 추가할 수 없음 -> 한계점

        System.out.println("objectArray 출력");
        for (int i = 0; i < objectArray.size(); i++) {
            Object obj = objectArray.get(i);

            if (obj instanceof A) {
                ((A) obj).go();
            } else {
                ((B) obj).go();
            }
        }
//         나는 A의 go() 메서드이다.
//         나는 B의 go() 메서드이다.
//         나는 B의 go() 메서드이다.
//         나는 B의 go() 메서드이다.
//         나는 A의 go() 메서드이다.

        // ObjectArray의 한계점을 극복해주는 ArrayList를 Java API가 제공한다.
        ArrayList arrayList = new ArrayList(5);     // 배열 길이에 제약이 없다.
        arrayList.add(new A());
        arrayList.add(new B());
        arrayList.add(new B());
        arrayList.add(new A());
        arrayList.add(new A());
        arrayList.add(new B());     // ArrayList 객체 생성 시 5를 전달하더라도 객체를 계속 추가할 수 있음
        arrayList.add(new A());

        System.out.println("arrayList 출력");
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);

            if (obj instanceof A) {
                ((A) obj).go();
            } else {
                ((B) obj).go();
            }
        }
//        나는 A의 go() 메서드이다.
//        나는 B의 go() 메서드이다.
//        나는 B의 go() 메서드이다.
//        나는 A의 go() 메서드이다.
//        나는 A의 go() 메서드이다.
//        나는 B의 go() 메서드이다.
//        나는 A의 go() 메서드이다.
    }
}
