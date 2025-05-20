package _13_BreakContinue;

public class Continue {
    public static void main(String[] args) {
        // 반복문 - continue
        // continue - 다시 반복문의 처음으로 돌아가서 실행

//        int waiting = 50;   //현재 대기인원
//        int max = 20;       //판매재고
//        int sold = 0;       //현재 판매량
//        int noShow = 12;    //노쇼 번호

        //for 문에서 continue 사용
//        for (int i = 1; i <= waiting; i++) {
//            System.out.println(i + "번 손님 입장함");
//
//            if (i == noShow) {
//                System.out.println(i + "번 손님 노쇼--");
//                continue;                  //12번에서 노쇼 발생-> continue 타고 fori 로 돌아감 -> 13번 입장 & sold코드 실행
//            }
//
//            sold++;                        //현재 판매량은 계속 증가
//            if (sold == 20) {
//                System.out.println("재료 소진함");
//                break;
//            }
//        }


        //while 문에서 continue 사용
        int waiting = 50;   //현재 대기인원
        int nowNum = 1;     //현재 입장번호(시작번호)
        int max = 20;       //판매재고
        int sold = 0;       //현재 판매량
        int noShow = 12;    //노쇼 번호

        while (nowNum <= waiting) {         //50번 반복하도록
            System.out.println(nowNum + "번 손님 입장!");

            if(nowNum == noShow) {
                System.out.println(nowNum + "번 손님 노쇼함");
                nowNum ++;                        //만약 12번 노쇼일 때 13번 호출하기 위함
                continue;
            }

            sold++;                     //판매처리 -> 현재 판매량 1씩 증가
            if (sold == max) {
                System.out.println("재료소진됨");
                break;
            }

            nowNum++;                    //번호 1씩 증가
//



        }




    }
}
