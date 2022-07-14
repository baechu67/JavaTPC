import kr.tpc.Movie;

public class TPC17 {
    public static void main(String[] args) {
        // 자바에서 배열은 객체로 취급한다: intArr(주소값) -> [int값, int값, int값, int값, int값] 배열 객체
        int[] intArr = new int[5];
        int num = 1;
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = num;
            num++;
        }
        for(int element : intArr) {
            System.out.println(element);
        }

        // Movie 객체 생성
        Movie movie = new Movie("탑건2, 메버릭", 10000, "톰 크루즈", 3, 180.0f);
        System.out.println(movie);

        // Movie 객체 배열 생성
        Movie[] movieArr = new Movie[3];
        for(int i = 0; i< movieArr.length; i++) {
            movieArr[i] = new Movie("탑건2, 메버릭", 10000, "톰 크루즈", 3, 180.0f);
        }
        for(Movie element: movieArr) {
            System.out.println(element);
        }
    }
}
