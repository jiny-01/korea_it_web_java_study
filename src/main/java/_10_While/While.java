package _10_While;

public class While {
    public static void main(String[] args) {
        //반복문 - While
        //조건이 참일 경우 계속 반복
        // while (조건) {
        //      반복할 코드
        // }

        //for문 - 횟수 중심
        //while 문 - 조건 중심

        //1~5 까지 출력
//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num++; //조건을 변화시키기 위한 증가 (필수)
//        }
//
//        //10 에서 거꾸로 1까지 출력
//        num = 10;
//        while (num >= 1) {
//            System.out.println(num);
//            num--;  // 조건 변경 코드
//        }
//
//        //1~10 중 짝수만 출력
//        num = 1;
//        while (num <= 10) {
//            System.out.println(num);
//            if(num % 2 == 0) {
//                System.out.println(num);
//            }
//        }
//
//        num = 1;
//        while (num <= 10) {
//            System.out.println(num);
//            if(num % 2 == 0) {
//                System.out.println(num);
//
//            }
//        }

        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i ++;
        }
        System.out.println(sum);
    }
}




