package _29_Builder;

public class MemberLombokMain {
    public static void main(String[] args) {
        MemberLombok memberLombok = MemberLombok.builder()
                .age(25)
                .email("allie7019@naver.com")
                .build();

        System.out.println(memberLombok);
    }


}
