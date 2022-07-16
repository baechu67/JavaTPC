package kr.tpc;

public class JavaOracle implements DbConnect {
    @Override
    public void getConnection(String url, String user, String pwd) {
        System.out.println("오라클 DB에 접속합니다.");
    }
}
