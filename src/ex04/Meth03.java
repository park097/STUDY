package ex04;

class Account {
    // 입금 (입금할 금액, 계좌잔액)
    int deposit(int amount, int money) {
        int restMoney = money + amount;
        return restMoney; // 메서드를 호출한 라인으로 값 변환

    }
    // 출금 (입금할 금액, 계좌잔액)

    int withdraw(int amount, int money) {
        int restMoney = money - amount;
        return restMoney;
    }

}
// 리턴말고 출력만 //출력:받는사람잔액 출력, 출력 보낸사람 잔액

public class Meth03 {
    public static void main(String[] args) {
        // 홍길동의 잔액
        int hMoney = 1000;

        // 홍길동이 입금을 2번하고, 출금 한번 하기
        Account hAccount1 = new Account();
        hMoney = hAccount1.deposit(100, hMoney);
        System.out.println("홍길동 남은 금액:" + hMoney);
        hMoney = hAccount1.deposit(500, hMoney);
        System.out.println("홍길동 남은 금액:" + hMoney);
        hMoney = hAccount1.withdraw(300, hMoney);
        System.out.println("홍길동 남은 금액:" + hMoney);

        // 임꺽정이 입금을 1번하고(100원), 출금 두번 하기(300원,500원)

        int iMoney = 1000;
        Account iAccount = new Account();

        iMoney = iAccount.deposit(100, iMoney);
        System.out.println("임꺽정 남은 금액:" + iMoney);
        iMoney = iAccount.withdraw(300, iMoney);
        System.out.println("임꺽정 남은 금액:" + iMoney);
        iMoney = iAccount.withdraw(500, iMoney);
        System.out.println("임꺽정 남은 금액:" + iMoney);

    }
}