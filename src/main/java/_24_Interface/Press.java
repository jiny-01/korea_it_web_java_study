package _24_Interface;

public interface Press {
    //클래스가 아닌 인터페이스
    //1. interface 인터페이스는 기능(메소드)의 명세(규칙, 약속)만 정의하는 틀
    //2. 모든 변수는 public static final(상수)
    //3. 객체 생성 불가, 생성자 없음

//     String NAME = "button";    //(public static final) 상수 - 생략되어 있지만 있는 것

    //기능 중심 설계를 하고 싶을 때
    //여러 클래스에서 같은 행동(메소드)를 다르게 구현하고 싶을 때

    void onPressed();       //public abstract 생략된 것

    //인터페이스 : 다중 상속 가능 / 추상클래스- 단일상속

    //추상 클래스 만들기	패키지 내에 MyAbstractClass.java 생성
    //인터페이스 만들기	패키지 내에 MyInterface.java 생성
    //일반 클래스 만들기	패키지 내에 MyClass.java 생성

    //_24_Interface/ 내에
    //─ Button.java           (추상 클래스)
    //─ Press.java            (인터페이스)
    //─ Up.java               (인터페이스)
    //─ Down.java             (인터페이스)
    //─ Tv.java         (일반 클래스 - Button 상속 & 인터페이스 구현할 파일)
}
