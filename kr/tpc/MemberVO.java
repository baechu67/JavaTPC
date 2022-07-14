package kr.tpc;

public class MemberVO {
    // private: 클래스 외부에서 상태정보에 직접 접근할 수 없도록 정보은닉
    private String name;
    private int age;
    private String tel;
    private String addr;

    // 생성된 객체의 상태정보에 간접적으로 접근할 수 있는 getter, setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
