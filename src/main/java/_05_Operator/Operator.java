package _05_Operator;

public class Operator {
    public static void main(String[] args) {
        //연산자

        //대입 연산자
        int num1 = 10;
        int num2 = 5;
        //여기서 =은 해당 변수에 데이터(값)을 대입한다는 의미
        //수학적인 같다라는 의미가 아님

        //산술 연산자
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);  //몫
        System.out.println(num1 % num2);  //나머지

        //복합 대입 연산자
        num1 +=5;  //num1 = num1 + 5; => 15
        System.out.println(num1);
        num1 -= 5; //num1 = num1 - 5 => 10
        System.out.println(num1);
        num1 *= 2;  // num1 = num1 * 2 => 20
        System.out.println(num1);
        num1 /= 2; //num1 = num1 / 2 => 10
        System.out.println(num1);
        num1 %= 2; //num1 = num1 % 2 => 0  %: 나머지만 출력
        System.out.println(num1);

        //증감 연산자
        int j = 10;
//        System.out.println(j);
        //뒤에 ++ : 실행이 된 후에 1증가
//        System.out.println(j++);   //여긴 10 다음=> 10 + 1
//        System.out.println(j);     //11 출력
        //뒤에 -- : 실행이 된 후에 1감소
//        System.out.println(j--);     //여전히 10
//        System.out.println(j);       //여긴 -1한 9
        //앞에 ++ : 실행이 되기 전에 1증가해서 출력
//        System.out.println(++j);     //앞에 ++면 코드 실행 이전 연산 수행 => 10
        //앞에 -- : 실행이 되기 전에 1감소해서 출력
//        System.out.println(--j);     //11

        //비교 연산자 => 결과가 항상 boolean 참/거짓 둘 중 하나
        num1 = 5;
        num2 = 3;
        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2); //같냐?
        System.out.println(num1 != num2); //같지 않냐?

        //논리 연산자 (&, |, !)
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 & flag2); //& : and, 논리곱 => 하나라도 false 있으면 false
        System.out.println(flag1 | flag2); //| : or, 논리합 => 하나라도 true 있으면 true
        System.out.println(flag2 | flag2); //둘 다 false, true 없으니 -> false
        System.out.println(!flag1); //!: not -> true 가 아님 => false 출력

        //논리 연산자 조합(&&, ||)
        //&& -> 선조건이 true 일 때만 후조건을 실행한다, 선조건이 false 이면 후조건을 실행하지 않는다.
        //|| -> 선조건이 true 이면 후조건을 실행하지 않는다, 선조건이 false 이면 후조건을 실행한다
        System.out.println(flag1 && flag2);
        System.out.println(flag1 || flag2);

        //삼항 연산자
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
                //int 변수 = (조건) ? 값1(true일 때):값2(false일 때)
        System.out.println(max);
        int min = (x < y) ? x : y;
//        int min = (y < x) ? y : x;
        System.out.println(min);

        x = 3;
        boolean isSame = (x == y) ? true : false;
        System.out.println(isSame);

        x = 3;
        String sameStr = (x != y) ? "다름" : "같음";
        System.out.println(sameStr);

        /*
        * int height = 160;
        * 키가 120이상인 경우 탑승 가능하도록 하는 삼항연산자
        * 가능하면 "탑승 가능" 불가능하면 "탑승 불가능" 출력
        * */
        int height = 160;
        String test = (height >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println(test);
    }
}
