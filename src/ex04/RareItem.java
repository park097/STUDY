package ex04;

public class RareItem {

    public static void main(String[] args) {
        int hp = 0;

        if (hp == 100)
            System.out.println("체력이 가득합니다");
        else if (hp > 50)
            System.out.println("체력이 손실되었습니다");
        else
            System.out.println("체력이 부족합니다");

    }

}
