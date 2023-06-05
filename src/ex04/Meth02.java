package ex04;

class Cal02 {
    void add(int n1, int n2) {
        System.out.println("더하기 :" + (n1 + n2));
    } // 스택을 종료하고, 복귀주소를 확인하고 복귀한다.

    // minus
    void minus(int c1, int c2) {
        System.out.println("빼기 :" + (c1 - c2));
    }

    // multi
    void multi(int m1, int m2) {
        System.out.println(" 곱하기 :" + (m1 * m2));
    }

    // divide
    void divide(int d1, int d2) {
        System.out.println("나누기 :" + (d1 / d2));
    }
}

public class Meth02 {
    public static void main(String[] args) {
        Cal02 c1 = new Cal02();
        c1.add(10, 5); // 매개변수
        c1.minus(10, 5); // 매개변수
        c1.multi(10, 5); // 매개변수
        c1.divide(10, 5); // 매개변수
        // c1.minus();
        // c1.multi();
        // c1.divide();
        // 컨트롤 슬래시 하면 한꺼번에 주석처리

    }
}