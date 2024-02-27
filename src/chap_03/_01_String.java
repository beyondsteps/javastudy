package chap_03;

public class _01_String {
    public static void main(String[] args) {
        String s = "I like Java, Python and C.";
        System.out.println(s);

        System.out.println(s.length()<30 ? "너무 짧습니다." : "리뷰 등록 완료"); // 28
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.toUpperCase().contains("JAVA")?"JAVA 있음":"JAVA 없음");
        System.out.println(s.indexOf("Java"));
        System.out.println(s.lastIndexOf("."));
    }
}
