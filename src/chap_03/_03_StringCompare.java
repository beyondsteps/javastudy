package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 , s2;
        s1 = "Java";
        s2 = "Python";

        System.out.println(s2.equals("python")); //문자열 내용 비교
        System.out.println(s1.equalsIgnoreCase("JAVA")); //문자열 대소문자 구분 없이 비교 내용이 같으면 true, false

        // 문자열 비교 심화

        s1 = new String ("1234");
        s2 = new String ("1234");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2)? "로그인 성공":"로그인 실패");

    }
}
