package _31_Generic;

import lombok.AllArgsConstructor;
import lombok.Data;

// <T> : Generic(제네릭) -> <>
//클래스나 메서드가 다룰 데이터 타입을 미리 명시하여 재사용성과 유연성을 높이는 기술
//타입 매개변수(Type Parameter)
//클래스나 메서드에서 사용할 실제 타입을 '대신하여' 사용하는 매개변수
//-> 타입은 객체 생성 시 사용
//일반적으로 알파벳 대문자 하나로 표기
// T(Type) - 일반적으로 클래스의 타입을 나타낼 때 사용
//          ex) String, Integer, 다른 클래스  (int, double 이런 건 원시적이라 불가)
            //T: 최상위 클래스라고 볼 수 있음
// E(Element) - 컬렉션의 요소
// K(Key) - Map 의 key 를 나타낼 때 사용
// V(Value) - Map 의 Value 를 나타낼 때 사용

//사용 이점
//1) generic 을 사용하면 다양한 자료형에 대해 하나의 클래스나 메서드를 정의할 수 있다.
//=> 재사용성 증가, 중복 감소

//2) 타입 안정성 증가 -> 컴파일 시 타입을 체크(객체 생성 시) / 잘못된 타입이 들어갈 수 X
//
//
@Data  //@getter, @setter, @toString
@AllArgsConstructor
//여러가지 형태를 담을수 있는 클래스
public class ResponseData<T> {
    private String message;
    private T data;
    //임시로 T 로 한 것, 타입은 객체 생성 시 정해짐
//    private String data1;
//    private int data2;
//    private double data3;

    @Override
    public String toString() {
        return message + data;


//
//    public String toStringStr() {
//        return message + data1;
//    }
//
//    public String toStringInt() {
//        return message + data2;
//    }
//
//    public String toStringDouble() {
//        return message + data3;
    }
}
//



