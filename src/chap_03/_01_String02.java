package chap_03;

public class _01_String02 {
    public static void main(String[] args) {
        String s = "I like Java, Python and C.";
        // 문자열 반환

        System.out.println(s.replace("and",","));
        System.out.println(s.substring(7)); // 7부터 시작되고 이전 내용은 삭제
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); //substring 은 index 문자열 앞까지 잘라냄


        //공백 제거
        String a = "  I  love  React.   ";
        System.out.println(a);
        System.out.println(a.trim()); //앞, 뒤 공백을 모두 제거

        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.concat(",").concat(s2));
    }
}
