package ex01;

import java.net.SocketTimeoutException;

import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;

public class Var03 {
    public static void main(String[] args) {
        //업 캐스팅,묵시적 형변환
        int n1 =10;
        double d1; 
        System.out.println(d1);
    }
    //다운 캐스팅(큰 걸 작은거로 변환), 명시적 형변환
    double d2 = 10.5;
    int n2 = (int)d2;
    System.out.println(n2);
}
 //문자 형변환 (아스키코드)
byte ch = 65;
 ckar data = ch; //char는 2바이트
 System.out.println(ch);
