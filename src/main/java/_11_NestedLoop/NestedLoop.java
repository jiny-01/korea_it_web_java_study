package _11_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 네모 별 찍기 - 이중 for문 사용
        // *****
        // *****
        // *****
        // *****
        // *****

        for (int i = 0; i < 5 ; i++) {     //세로줄
            for (int j = 0; j < 5; j++) {  //가로로 별 찍기
                System.out.print("*");
            }
            System.out.println(":"+ i);
        }

        System.out.println();

        //별 삼각형 찍기
        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.println("*");
            }
            System.out.println("-" + i);

        }
        //j의 범위 -> j < i+1
        //i가 0일 때 j<1 이므로 j=0  -> 한번 실행
        //i가 1일 때 j<2 -> j=0, 1   -> 2번 실행
        //i가 2일 때 j<3 -> j=0, 1, 2 -> 3번 실행

        //__*__  0->1
        //_***_  1->3
        //*****  2->5

//        int n = 3;
//        for (int i = 0; i < 3; i++) {
//            System.out.println("*");
//            if (n <= 3)
//            for (int j = 0; j < i+2 ; j++) {
//
//            }
//
//        }

        // *****
        // ****
        // ***
        // **
        // *

//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 5-i; j++) {
//                System.out.println("*");
//            }
//        }
//            System.out.println("line: " + i);

//        //풀이
//        for (int i = 5; i >= 1 ; i--) {
//            for (int j = 0; j < i ; j++) {
//
//            }
//
//        }


        // *
        // SSSS*    i=0 j 4번
        // SSS**    k=5-j   i=1  j1 3번
        // SS***    k=5-j   i=2  j2
        // S****    k=5-j
        // *****
        // *
        //i(줄)=0 -> i+1, j(*)=0, k(S)=4-i

        for (int i = 0; i < 5 ; i++) {               //총 세로줄 반복
            for (int j1 = 0; j1 < 4 - i; j1++) {     // S 찍히는 반복
                System.out.println("S");
            }
            for (int j = 0; j < i + 1; j++) {       //가로줄에 * 찍히는 개수
                System.out.println("*");
            }
            System.out.println();
        }





    }
}
