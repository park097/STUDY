package ex04;

class player {
    String name;
    int thirty; // 0~100 (클수록 목말라짐) //범주 //디폴트 생성자는

    public player(String name, int thirty) {
        this.name = name;
        this.thirty = thirty;
    }

    public void drink() {
        thirty = thirty - 30;
    }

    // 생성자는 메쏘드이름과 똑같음

}

public class OOPO1 {
    public static void main(String[] args) {

        Player p1 = new player(홍길동, 100); /// 변수를 선언했는데 값이 없는 것
        Player p2 = new player(임꺽정, 100); /// 변수를 선언했는데 값이 없는 것

        System.out.println(p1.name);
        System.out.println(p2.name);

        System.out.println(p1.thirty);
        System.out.println(p2.thirty);
    }

}
