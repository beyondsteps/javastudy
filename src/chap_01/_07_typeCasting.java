package chap_01;

public class _07_typeCasting {
    public static void main(String[] args) {

        int score_1 = 92;
        double score_2 = 96.2;

        System.out.println(score_1);
        System.out.println((double)score_1);
        System.out.println(score_2+(double)score_1);

//        String s1 = String.valueOf(score_1);

        System.out.println("문자열 변환 : ");
        String s1 = Integer.toString(score_1);

        System.out.println(score_1+s1);


        int a = Integer.parseInt("93");
//        int b = Integer.parseInt("false");

        System.out.println(a );

    }
}
