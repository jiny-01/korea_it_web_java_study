package _35_Lambda;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
        //operate의 매개변수
        //a, b 숫자, 인터페이스(재정의할, add..)

    };

    public static void main(String[] args) {       // 람다로 재정의한 부분
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println("2 + 2 = " + operate(2, 2, add));
        System.out.println("4 - 2 = " + operate(4, 2, sub));
        System.out.println("2 * 3 = " + operate(2, 3, mul));
        System.out.println("10 / 2 = " + operate(10, 2, div));


        //1. 익명 클래스
        Calculator div1 = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return 0;
            }
        };

        //2. 람다 한 줄
        Calculator div2 = (x, y) -> x / y;


        //3. 람다 여러 줄
        Calculator div3 = (x, y) -> {
            if(y ==0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return x / y;
        };
        System.out.println("2 / 0 = " + operate(2, 0, div3));



    }
}
