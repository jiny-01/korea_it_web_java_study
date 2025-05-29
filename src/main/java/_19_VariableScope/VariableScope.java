package _19_VariableScope;

public class VariableScope {

    public static void methodA() {
        String str = "abc";
    }

    //-> str 은 이 메소드 안에서만 쓸 수 있는 지역변수
    public static void main(String[] args) {
        //지역변수와 전역변수
        //지역변수 : {} 안에서만 사용

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        System.out.println(i); //-> i 사용불가


        {
            int age = 25;
        }
//        System.out.println(age);  //-> {} 밖이므로 사용불가

    }
}
