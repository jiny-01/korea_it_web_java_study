package _34_Exception;

class LoginFailedException extends Exception {
   public LoginFailedException(String message) {        //예외 발생 2번째
       super(message);    //부모인 Exception 의 생성자에 message 넣는 것
       System.out.println("예외 발생함");                //예외 발생 3번째 - 객체 생성 완료와 동시에 예외 발생
   }
}

public class Exception02 {
    public static void login(String id, String pw) throws LoginFailedException {         //예외 발생 4번째
        String correctId = "admin";
        String correctPw = "1q2w3e4r";
        //throws - 메소드에다가 씀 => 책임전가
        //throw 발생할 예외 (복수 가능)
        //메소드 실행 중 예외가 발생하면 메소드를 호출/실행한 곳에서 처리하라고 책임 전가하는 것

        //예외 발생
        if (!id.equals(correctId) || !pw.equals(correctPw)) {   //Id 와 Pw 둘 중 하나라도 일치하지 않으면
            throw new LoginFailedException("ID 또는 PW 가 틀렸습니다.");    //예외 발생 시점 1번째 - 새로운 객체 생성

        };

    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPw = "1234qwer";

        try {
            login(inputId, inputPw);        //예외발생 5번째 => 예외가 터진 것
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패 : " + e.getMessage());  //예외발생 6번째
        } finally {
            System.out.println("프로그램 정상 종료");
        }

        //throw new -> 생성자, 객체 생성 -> "예외 발생"출력 -> 메소드 내 throws -> try 안, 즉 호출, 예외터진 곳 -> catch 안
        //호출한 곳에서 처리하기 위해 try 안에다 예외 발생 시키는 것
        //17라인(메소드 내) 에서 예외를 발생시켰지만, 실질적으로는 try 안에서 터지고 -> catch 에서 예외처리


    }
}
