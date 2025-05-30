package _29_Builder;

public class Member {

    //멤버변수 만들기
    private String name;
    private int age;
    private String email;

    private Member(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }
    //this: Member - Member 의 name, age, email 에 builder 의 변수를 넣음

    //정적 내부 클래스 - Member 내부에 선언된 정적 내부 클래스
    //Builder => 객체를 만들기 위한 준비도구
    //최종적으로 Builder 의 build 메소드가 Member 의 객체를 생성할 것임
    //Member 의 멤버변수를 그대로 가져야함
    public static class Builder {
        private String name;
        private int age;
        private String email;

        //Builder 의 클래스 객체의 멤버변수에 매개변수를 대입(setter 역할)
        //자기 자신 객체를 반환 => 메소드 체이닝
        //메소드 체이닝?
        //메소드를 연속해서 호출할 수 있도록 객체 자신을 반환하는 방식
        //ex) 객체.메소드.메소드

        //Builder
        public Builder name(String name) {   //setter 랑 형식 비슷 / Builder 클래스 리턴, 메소드명 : Builder
            this.name = name;
            return this;         //
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        //모든 필드 설정이 끝난 후 Member 객체의 생성자를 통해
        //Builder 의 객체를 넣어줌

        public Member build() {
            return new Member(this);       //this 안에는 name, age, email 갖고 있음, Member 의 생성자로 받음
        }

        //빌더 방식을 이용했을 때의 이점
        //1. 가독성이 높아짐
        //2. 매개변수의 순서를 지키지 않아도 된다.
        //3. 유지보수성 향상 => 필드 추가 변경에 용이

    }
}
