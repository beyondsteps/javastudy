package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 if

        int hour = 20;
        boolean mcoffee = false;

        if ( hour < 15) // 하나의 문장은 중괄호가 필요 업음
            System.out.println("아이스 아메리카노");
        System.out.println("주문완료");

        if ( hour >= 15 && mcoffee == false)
        {
            System.out.println("아이스 아메리카노");
            System.out.println("할인완료");

        }

        }
    }

