package _17_Method;

public class Parameter {
    public static void power(int number) {
        //거듭제곱을 하는 메소드  메소드명(타입 전달받을 매개변수)
        //매개변수를 전달 받아서 해당 매개변수를 거듭제곱
        int result = number * number;
        System.out.println(number + "의 2승은" + result + "입니다");
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의" + exponent + "승은" + result + "입니다");
    }

    //메소드 정의 getAvg
    //3개의 정수를 전달하여 평균을 출력하는 메소드
    //getAvg(80, 90, 100);
    public static void getAvg(int n1, int n2, int n3) {
        int avg = (n1+n2+n3) / 3;
        System.out.println("세 수의 평균: " + (n1 + n2 + n3) / 3);
    }

    //정수를 전달하여 짝수인지 홀수인지 판별하는 메소드
    //단, 삼항연산자 쓸 것
    //isEven(2)
    public static void isEven(int number) {
        int num = 1;
        String result = (num % 2 == 0) ? "짝수":"홀수";
    }

    public static void main(String[] args) {
        //Parameter
        //매개변수, 전달값
        int num = 4;
        power(3);
        power(num);         //number 와 num - 전달하는 자료형만 일치하면 됨, 이름 같을 필요는 없음

        powerByExp(2, 4);

        getAvg(80, 90, 100);

        //3개의 정수를 전달하여 평균을 출력하는 메소드
        //getAvg(80, 90, 100);

        //정수를 전달하여 짝수인지 홀수인지 판별하는 메소드
        //단, 삼항연산자 쓸 것
        //isEven(2)

        isEven(2);








    }
}
