package ex03;

import java.util.Scanner;

public class Nunber {
   public static void main(String[] args) {
      int answer;

      Scanner sc = new Scanner(System.in);
      System.out.println("정답을 추측하여 보시오 ");

      answer = sc.nextInt();
      if (answer <= 50)
         System.out.println("제시한 정수가 낮습니다");
      else if (answer >= 50)
         ;
      System.out.println("제시한 정수가 높습니다.");

   }
}