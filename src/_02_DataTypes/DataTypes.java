package _02_DataTypes;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(123);

        //변수
        //자료형 변수명 = 데이터;    //자바는 자료형 명시해줘야함
        //정수 - int, long
        int num = 123;
        int num1;           //변수명만 선언한 상태, 초기화하지 않은 상태
        num1 = 234;         //초기화된 상태
        num1 = 456;         //123 -> 456 변경

        System.out.println("num1은" + num1);

        long l = 1_000_000_000_000L;       //long 은 값 끝에 L써야 인식
        System.out.println("l은" + l);

        //실수 - float, double  -> 보통 double 많이 씀
        float f = 3.14f;                   //float 는 끝에 f, F 써야함
        double d = 3.14123456123456d;       //double 은 끝에 d

        //문자 - char
        //문자열 -String
        char a = 'A';
        char b = 'B';
        System.out.println("" + a + b);  //연산에 문자열이 있으면 전체를 문자열로 생각함

        String str = "안녕하세요";  //String 은 자바 내 클래스(문자를 넣어둔)
        System.out.println(str);

        //논리 자료형 - boolean
        boolean isEmpty;
        isEmpty = true;
        isEmpty = false;
        System.out.println(isEmpty);

        /*
        *제 이름은 *** 입니다. 제 나이는 **살이고
        * 취미는 ***입니다.
        * */

        String name = "김지니";
        int age = 25;
        String hobby = "운동";
        String mbti = "isfj";

        System.out.println("제 이름은 " + name + "입니다. 제 나이는 " + age + "살이고\n 취미는" + hobby + "입니다");

        System.out.println("제 이름은 " + name + "입니다. 제 나이는" + age + "살이고");
        System.out.println("취미는 " + hobby + "입니다.");
        System.out.println("제 mbti " + mbti + "입니다.");






    }
}

