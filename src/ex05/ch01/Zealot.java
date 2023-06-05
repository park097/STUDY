package ex05.ch01;

public class Zealot {

    String name;
    int hp;
    int attack;

    public Zealot(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;

    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("질럿1", 100, 10);
    }

}
