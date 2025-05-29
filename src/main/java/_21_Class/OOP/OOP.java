package _21_Class.OOP;

import _21_Class.Person.Person;

public class OOP {
    public static void main(String[] args) {
        //OOP => Object Oriented Programming : 객체지향프로그래밍
        //- 현실 세계의 개념을 코드로 표현
        //- 사람, 동물, 자동차 등 하나의 객체로 보는 것
        //- 상태(속성)과 동작(기능)을 중심으로 프로그래밍
        //클래스(설계도면), 실체(개체)

        //OOP 의 4가지 원칙***
        //1. 추상화
        //- 복잡한 내부 동작은 감추고, 객체의 메소드를 호출했을 뿐 -> 별도 클래스에 메소드 정의
        //ex) 엔진 시동 걸고 구체적인 동작은 모름 시동건다는 메소드를 정의하고 호출만 함
        //- 실행된 클래스메인에 직접 명시하면 -> 추상화 안된 거
        //2. 캡슐화
        //- 정보은닉(내부 변수에 직접적으로 접근하지 못하게)
        //=> 데이터(변수)를 보호하고, 접근을 제한하여 안정성을 높히는 것
        //3. 상속
        //4. 다형성

       Person person = new Person();
        System.out.println(person.name);  //public - 접근 가능
//        System.out.println(person.age);   //protected - 같은 패키지(Person)/자식 패키지만 가능 -> 접근 불가
//        System.out.println(person.address); //default - 같은 패키지내에서만 가능






    }
}
