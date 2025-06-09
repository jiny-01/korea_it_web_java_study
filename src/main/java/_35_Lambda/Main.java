package _35_Lambda;

//함수형 프로그래밍\
//람다식(Lambda Expression)
//Java 8 에서 도입된 '함수형 프로그래밍'을 지원하기 위한 표현식
//익명 클래스를 사용해 함수처럼 동작하는 코드
//해당 클래스 내 메소드는 1개만 있어야함
//=> 익명 함수에 표현되는 표현식

//자식클래스 메소드를 잠시 정의해서 사용하는 것

// () -> 코드 실행부
//(): 매개변수  ->   실행할 코드(구현부)

//Lambda 식이 등장한 배경
//람다식이 나오기 전에는 함수형 프로그래밍을 하기위해 익명클래스를 주로 사용
//익명 클래스 방식은 코드가 길어지고, 불필요한 반복이 많아질 수 있었다. -> 가독성 저하
//

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //Runnable - 할일 목록 만드는 것 (자바 내장 인터페이스)
        //run() 메소드 밖에 없음
        //람다 사용 X -> 익명클래스 사용

        Runnable job1 = new Runnable() {                  //익명 클래스
            @Override
            public void run() {                           //익명 함수
                System.out.println("익명 클래스 방식");
            }
        };
        job1.run();



        Runnable job2 = () -> System.out.println("람다 방식");            //(): 매개변수  ->   실행할 코드(구현부)
        job2.run();


        Comparator<Integer> comparator = new Comparator<Integer>() {         //익명클래스
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);        //Integer 의 메소드 중 하나 - 두 수 비교
            }
            //두 객체 중 만약 앞의 객체가 더 작다면 음수, 같다면 0, 크다면 양수를 반환

        };

        System.out.println(comparator.compare(10, 20));

        Comparator<Integer> comparator1 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator1.compare(20, 20));

        //람다식의 장점
        //-코드 간결화
        //-표현력 향상

        //람다식의 단점
        //디버깅의 어려움(오류 잡기)
        //재사용성 낮음 - 코드가 한줄이 아니고 여러 줄로 늘어났을 때 결국엔 익명 클래스

        //주요 함수형 인터페이스 - 메소드가 하나만 있는 인터페이스
        //Runnable, Comparator
        //Supplier ->  T get();
        //매개변수 없이 값을 반환하는 인터페이스, 단순히 값을 '공급'하는 역할
        //타입: T  get(): 메소드

        //Supplier  <->  Consumer
        //Consumer -> void accept(T t);
        //값을 매개변수로 받아서 사용, 아무것도 반환하지 않는 인터페이스, 데이터를 '소비'하는 역할
        //타입: void

        //Function<T, R> - R apply(T t);    제네릭으로 T(매개변수타입), R(리턴) 받음
        //'하나의 매개변수(T)' 를 받아서, 연산을 수행한 후 결과를 리턴함
        //T : 매개변수 타입 / R : 반환 타입

        //Predicate - boolean test(T t);
        //'하나의 매개변수'를 받아서 특정 조건을 검사한 후 true / false 를 리턴

        //인터페이스 사용해서 오버라이딩(재정의)을 할 건데
        //1. 익명 클래스로 메소드 오버라이딩
        //2. 한 줄 쓸거면 람다 함수식 사용

        //1. supplier
        Supplier<String> stringSupplier = () -> "Hello, World";     //반환O
        //2. consumer
        Consumer<String> stringConsumer = (message) -> System.out.println("메시지 : " + message);   //반환X, 출력만
        String message = stringSupplier.get();     //message = "Hello, World"
        stringConsumer.accept(message);             //"메시지 : " + "Hello, World"




    }

}
