package _18_Overloading;

public class Overloading {

    //getPower - int형
    public static int getPower(int number) {
        return number * number;
    }

    //getPower - double형
    public static int getPower(double doubleNum) {
        int number = (int) doubleNum;
        return number * number;
    }

    //getPower - 문자열
    public static int getPower(String strNum){
        int number = Integer.parseInt(strNum);   //문자열 -> 숫자(int)
        return number * number;
    }

    //getPower -
    public static void getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의" + exponent + "승은" + result + "입니다");
    }

//    //문자열 이름 출력
//    public static void printInfo(String name) {
//        String str = name;
//        System.out.println("이름:" + name);
//
//    }
//
//    //문자열 이름, 정수 나이 출력
//
//    public static void printInfo(int num) {
//        int age = num;
//        System.out.println("나이:" + num);
//    }
//
//    //문자열 이름, 정수 나이, 문자열 이메일 출력
//    public static void printInfo(String email) {
//        String str = email;
//        System.out.println("이메일:" + email);
//    }


    //메소드 이름 add() => void
    //int 와 int 덧셈
    //double 과 double 덧셈         -> 형 변환 int
    //문자열 숫자와 문자열 숫자 덧셈

    public static int add(int i, int j) {
        int sum = i + j;
        return i + j;
//        System.out.println("int 합: " + sum);
    }

    public static void(double 0.2, double 0.3);






    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러 개 선언하는 것
        //매개변수(파라미터)의 타입이 달라야한다 또는 갯수가 달라야한다.
        //리턴되는 자료형은 같아야 한다.

        //->.indexOf  와도 같음 (자료형만 달라지기 때문)

        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("4"));
//        System.out.println(getPower(2,4));


        //문제
        //메소드 이름 printInfo()
        //문자열로 이름만 전달 => return 없음, 메소드 안에서 출력

        //문자열 이름, 나이(정수) 전달 => 이름, 나이 출력
        //문자열 이름, 나이(정수), 이메일(문자열) => 이름 나이 이메일 출력

//        printInfo("김지니");
//        printInfo(25);

        //메소드 이름 add() => void
        //int 와 int 덧셈
        //double 과 double 덧셈         -> 형 변환 int
        //문자열 숫자와 문자열 숫자 덧셈

        add(1, 4);



    }
}
