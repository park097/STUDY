package ex03;

public class while01 {
    public static void main(String[] args) {
        // for -->끝이 있는 반복문
        // while --> 끝을 모르는 반복문
        // while (조건식){}

        int i = 1; // while 전에
        while (true) {
            if (i == 100) {
                break;
            }

            System.out.println("Hello world : " + i);

            i = i + 1;
        }
    }

}
