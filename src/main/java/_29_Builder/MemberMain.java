package _29_Builder;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member.Builder()
                .name("김지니")
                .age(25)
                .email("allie7019@naver.com")
                .build();


        // Builder 불러와서 메소드 체이닝
        //생성자 넣어서 객체 만들 땐 순서를 지켜야하지만
        //Builder 사용하면 순서 안 지켜도 됨

        //실제로 쓸땐 @Builder 로 어노테이션 쓰면 다 만들어줌
        //import lombok.Builder;
        //
        //@Builder   해서 위에 import 되면 쓸 수 있음





    }

}
