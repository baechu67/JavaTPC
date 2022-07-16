package kr.inflearn;

// int 배열처럼 동작하는 클래스 설계하기(객체지향 방식으로 배열을 사용하기)
public class IntArray {
    private int count;
    private int[] arr;

    public IntArray() {
        this(10);
    }

    public IntArray(int init) {
        arr = new int[init];
    }

    public void add(int data) {
        arr[count++] = data;
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return count;
    }
}
