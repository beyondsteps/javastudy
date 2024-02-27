package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항연산자
        // 조건이 만족할 떄 실행 혹은 반대
        // 결과 = 조건 ? 참의 경우의 결과값 : 거짓일 경우의 결과값

//        System.out.println(5>3 ? "참입니다~" : "거짓입니다~");

int height;
height=115;

        System.out.println(height>=120 ? height + "cm 는 탑승 가능합니다" : height + "cm 는 탑승 불가능합니다.");
    }
}
