package ex05.exam02;

public class Walking {
    public static void main(String[] args) {
        /* 1. 칼로리 계산을 위해 메소드를 호출하시오. */
        double result = calculateCalory(5000); // 메소드 실행 ->치환돼서 들어감 //더블 됨
        System.out.println(result);
        /* 3. 결과를 출력하시오. */
    }

    /* 2. 칼로리 계산 메소드를 정의하시오. */
    private static double calculateCalory(int walk) {
        return 0.02 * walk;
    }
}
