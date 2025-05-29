package _27_Bean;

import lombok.*;

//멤버변수 정의하고, @Getter, @Setter, @ToString 해서 import 확인-UserEntity 에서 정의한 그대로 쓸 수 있음
//@어노테이션은 public class 위에 붙여서 달기

//2. @Getter, @Setter, @ToString 어노테이션 불러오기
//@NoArgsConstructor - 기본 생성자
//이렇게 하면 Bean 조건 만족

@Getter
@Setter
@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor
//require 로 쓰고 싶으면 final(상수지정) / 상수 하고 싶으면 생성자 위에 @NonNull -> required 쓰면 NoArgs 쓸 수 없음
public class UserEntityLombok {

//1. 멤버변수 정의

    private int userId;
//    @NonNull
    private String userName;
    private int age;
    private String email;




}


// *Entity
// DB 의 테이블과 1:1 매핑되는 클래스
// 자바 객체 <=> DB 테이블 간 데이터를 매핑하기 위해 사용
// DB 와 CRUD 작업 시 사용

// *Lombok
// 자바의 반복적인 코드를 자동으로 생성해주는 라이브러리
// getter, setter, toString, 생성자, Builder 등등


