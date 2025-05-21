package _17_Method;

public class Method {
    public static void sayHello() {
        //sayHello 라는 이름을 가진 메소드 정의
        //기능-안녕을 출력
        //호출은 main 실행부에서
        System.out.println("안녕");
    }
    public static void main(String[] args) {
        //메소드
        //기능을 담당하는 부분

        //메소드 호출
        System.out.println("메소드 호출 전");   //실행 안됨
        sayHello();                            //호출
        System.out.println("메소드 호출 후");





    }
}
