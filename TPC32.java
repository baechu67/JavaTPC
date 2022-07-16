import kr.tpc.DbConnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {
    public static void main(String[] args) {
        // Oracle -> Driver class
        DbConnect dbConnect = new JavaOracle();
        dbConnect.getConnection("url", "user1", "1234");
        // 오라클 DB에 접속합니다.

        // MySQL -> Driver class
        dbConnect = new JavaMySQL();
        dbConnect.getConnection("url", "user2", "12345");
        // MySQL DB에 접속합니다.
    }
}
