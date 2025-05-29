package _08_SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
        //조건문 - Switch Case
        //1등 => 전액장학금
        //2등 => 반액 장학금
        //3등 => 소정의 상품
        // 그 이하 => 박수

        //If 문 이용
        int ranking = 3;
        if (ranking ==1) {
            System.out.println("전액 장학금!!");
        } else if (ranking ==2) {
            System.out.println("반액 장학금!!");
        } else if (ranking ==3) {
            System.out.println("소정의 상품!!");
        } else {
            System.out.println("짝짝짝짝!!");
        }
        System.out.println("수여 끝~");


        //Switch문 이용 - 비교할 값이 case 로 나눌 수 있도록 명확한 경우 사용
        //switch (비교할 데이터)
        //  case 1:
        //         case1 일 때 실행할 코드

        switch (ranking) {
            case 1:
                System.out.println("전액 장학금!!");
                break;
            case 2:
                System.out.println("반액 장학금!!");
                break;
            case 3:
                System.out.println("소정의 상품");
                break;
            default:
                System.out.println("짝짝짝짝!!!");
        }
        System.out.println("수여 끝~!");

        //조건문 - Switch Case
        //1등 => 전액장학금
        //2등 => 반액 장학금
        //3등 => 반액 장학금
        // 그 이하 => 박수

        switch (ranking) {
            case 1:
                System.out.println("전액 장학금!!");
                break;
            case 2:                                    //case3이랑 같기 때문에 case2 생략 가능
            case 3:
                System.out.println("반액 장학금!!");
                break;
            default:
                System.out.println("짝짝짝짝!!!");
        }
        System.out.println("수여 끝~!");

        int price = 7000;
        int grade = 3;
        //l등급이면 10000, 등급이 한단계씩 낮아질수록 -1000

        switch (grade) {
            case 1:              //1등급 10000원
                price +=1000;
            case 2:              //2등급 9000원
                price +=1000;
            case 3:
                price += 1000;   //3등급 1000원
        }
        System.out.println("가격은" + price);

        // 봄: 3, 4, 5 => 봄입니다.
        // 여름: 6, 7, 8 => 여름
        // 가을: 9, 10, 11 => 가을
        // 겨울: 12, 1, 2 => 겨울

        int num = 12;

        switch (num) {
            case 3, 4, 5:
                System.out.println("봄입니다.");
                break;
            case 6, 7, 8:
                System.out.println("여름입니다.");
                break;
            case 9, 10, 11:
                System.out.println("가을입니다.");
                break;
            case 12, 1, 2:
                System.out.println("겨울입니다.");
                break;
        }

        //풀이
        switch (num) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울입니다.");
                break;
        }

        //1~7까지 숫자 하나 변수
        //1: 월, 2: 화 .... 7: 일

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("월");
                break;
            case 2:
                System.out.println("화");
                break;
            case 3:
                System.out.println("수");
                break;
            case 4:
                System.out.println("목");
                break;
            case 5:
                System.out.println("금");
                break;
            case 6:
                System.out.println("토");
                break;
            case 7:
                System.out.println("일");
        }

    }
}


