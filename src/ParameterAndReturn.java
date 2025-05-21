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

    //문자열을 매개변수로 전달하고 해당 문자열의 길이를 반환받아서 출력하는 메소드
    //strLength 메소드는 int형으로 반환하고 String 을 매개변수로 받음
    public static int strLength(String str) {
        int len = str.length();           //길이를 len 으로 지정
        System.out.println("문자열의 길이: " + len);
        return len;
    }

    public static void main(String[] args) {
        int power = getPower(3);    //getPower(3)의 값을 power 라는 변수에 저장
        System.out.println(power);

        int powerByExp = getPowerByExp(2, 4);
        System.out.println(powerByExp);


//return - 메소드를 호출한 부분에 반환값을 전달해줌

//문자열을 매개변수로 전달하고 해당 문자열의 길이를 반환받아서 출력하는 메소드
//        System.out.println(getStrLength("안녕하세요 반갑습니다"));

        String str = "안녕하세요 반갑습니다.";
        int strLength = strLength(str);

//        System.out.println(getStrLength("안녕하세요 반갑습니다"));










    }
}
