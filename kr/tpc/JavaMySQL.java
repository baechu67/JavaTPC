package kr.tpc;

public class JavaMySQL implements DbConnect {
    @Override
    public void getConnection(String url, String user, String pwd) {
        System.out.println("MySQL DB에 접속합니다.");
    }
}
