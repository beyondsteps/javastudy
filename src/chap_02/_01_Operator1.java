package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        // 산술 연산자
        int a, b,c,val;
        a = 10;
        b = 20;
        c = a+b;
        System.out.println(c);

        val = 10;
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);


        System.out.println("==========================");
        //대기인원
        int waiting = 0;
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);
        System.out.println("대기인원 : " + waiting++);

        System.out.println("총 대기인원 : "+ waiting);
    }
}
