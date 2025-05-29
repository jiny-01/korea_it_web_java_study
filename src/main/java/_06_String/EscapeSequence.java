package _06_String;

public class EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        // \n, \t, \\, \", \'
        System.out.println("집에");
        System.out.println("너무");
        System.out.println("가고싶어요");

        // \n => new line 줄바꿈
        System.out.println("집에\n너무\n가고싶어요");

        // \t => tab (스페이스바 4칸 공백, 들여쓰기)
        /*
            손흥민
            페이커
            BTS
            블랙핑크
        * */
        System.out.println("\t손흥민");
        System.out.println("\t페이커");
        System.out.println("\tBTS");
        System.out.println("\t블랙핑크");

        // \\: 실제 \(역슬래시)를 출력하고자 할 때
        //"C:\Program Files\java"
        System.out.println("C:\\Program Files\\java");

        // \"
        // 손흥민의 팀은 "토트넘 홋스퍼 FC"이다.
        System.out.println("손흥민의 팀은 \"토트넘 홋스퍼 FC\"이다");  //"" 문자열 내 ""넣고 싶을 떄
        // 페이커는 '신'이다.
        System.out.println("페이커는 \'신 이다");

        char c = 'A';
        c = '\'';  // ' 하나만 출력하고 싶을 때 -> \'
        System.out.println(c);

        //문제
        String id = "010830-4123456";
        //출력은 010830-4

        System.out.println(id.substring(0, 8));  //첫번째 방법
        System.out.println(id.substring(0, id.indexOf("-")+2));
        //-의 인덱스 찾으면 010830 만 출력되기 때문에 +2 를 해줌








    }
}
