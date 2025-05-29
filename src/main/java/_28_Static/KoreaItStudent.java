package _28_Static;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class KoreaItStudent {
    //원래는 객체 생성과 동시에 컴퓨터가 알 수 있는데, static, 즉 항상 존재함을 의미 - 이미 알고 있음
    //static 변수 - static_curriculum
    static String static_curriculum = "웹개발";

    //멤버변수 정의
    private String name;
    private int age;

    //static_curriculum 보여주는 메소드 정의
    public String getStatic() {
        return static_curriculum;
    }

}
