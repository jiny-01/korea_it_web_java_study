package _34_Exception;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
//}
public class SignUpException extends Exception{
    public SignUpException(String message) {
        super(message);
    }

    public static void signUp(String name, int age) throws AgeException {

//        String input_name = "홍길동";
//        int input_age = 15;

        boolean isSign = age < 14;
        //예외 발생
        if (isSign) {
            throw new AgeException("14세 미만은 가입할 수 없습니다.");
        }

        System.out.println(name + "님 회원가입이 완료되었습니다.");
    }
    }

    public static void main(String[] args) {
        String name = "홍길동";
        int age = 12;


//        try {
//            signUp(name, age);
//        } catch (SignUpException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println(name + "님 회원가입이 완료되었습니다.");
//        }

    }
}
