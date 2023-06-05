package ex04;

import javax.sound.sampled.SourceDataLine;

class Cal01 {
    void add() {
        System.out.println("add 호출됨");
        // ()는 동전 투입구
    }

    void minus() {
        System.out.println("마이너스 호출됨");
        // ()는 동전 투입구
    }

    void multi() {
        System.out.println("멀티 호출됨");
        // ()는 동전 투입구
    }

    void didve() {
        System.out.println("디바이드 호출 됨");
        // ()는 동전 투입구
    }

}

public class Meth01 {
    public static void main(String[] args) {
        Cal01 c1 = new Cal01();
        c1.add();
        c1.minus();
        c1.multi();
        c1.didve();

        Cal01 c2 = new Cal01();
        c1.add();
        c1.minus();
        c1.multi();
        c1.didve();

    }

}
