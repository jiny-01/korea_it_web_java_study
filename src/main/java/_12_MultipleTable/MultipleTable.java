package _12_MultipleTable;

import com.sun.security.jgss.GSSUtil;

public class MultipleTable {
    public static void main(String[] args) {
        //1~9단까지 출력하시오
        //1x3 =3


        for (int i = 1; i < 10; i++) {      //앞단
            for (int j = 1; j < 10 ; j++) {  //뒷단
                System.out.println(i + "x" + j + "=" + i*j);
            }
        }
        System.out.println();
    }
}
