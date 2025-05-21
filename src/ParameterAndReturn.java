public class ParameterAndReturn {

    // 메소드 정의 - power
//    public static void power(int number) {
//        //거듭제곱을 하는 메소드  메소드명(타입 전달받을 매개변수)
//        //매개변수를 전달 받아서 해당 매개변수를 거듭제곱
//        int result = number * number;
//        System.out.println(number + "의 2승은" + result + "입니다");
//    }
//

    //return 기능 추가
    public static int getPower(int number) {
        int result = number * number;
        return result;
//        => return number * number;
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의" + exponent + "승은" + result + "입니다");
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int power = getPower(3);    //getPower(3)의 값을 power 라는 변수에 저장
        System.out.println(power);















    }
}
