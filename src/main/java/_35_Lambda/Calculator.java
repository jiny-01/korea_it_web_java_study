package _35_Lambda;

@FunctionalInterface
//@FunctionalInterface 어노테이션 사용
//람다식은 단일 메소드만 가지는 인터페이스 => 함수형 인터페이스
//구현해야 할 메소드가 하나만 정의된 인터페이스
//-> 컴파일 시 단일 메소드인지 확인
//어노테이션 : 소스코드를 읽을 때(컴파일) 확인하라고 제시하는 꼬리표 개념



public interface Calculator {
    int calculate(int a, int b);     //메소드 정의

}
