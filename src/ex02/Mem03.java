package ex02;

public class Mem03 {
    public static void main(String[] args) {
        int x =1 , y =1 ;

        int a = x++;
        int b = ++y ;
        System.out.println( "a=" + a + ", b=" + b);
        
        int c = 100, d = 200;
        c += 10;
        d /=10;
        System.out.println("c=" + c +  ", d=" + d);
    
    }
    
}
