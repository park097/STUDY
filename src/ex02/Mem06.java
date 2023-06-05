package ex02;

import java.util.Scanner;

public class Mem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("초를 입력하시오:");
        int time =sc.nextInt();
        int sec = (time%60);
        int min = (time/60);

        System.out.println(time + "초는" + min + "분 " + sec + "초입니다.");
        sc.close();
    }
    
}

//int result = (int) (5.0/9.0) 은 0이나오니까
//double로 바꿈 (소수점 이하까지 다 보고 싶을 때 )
