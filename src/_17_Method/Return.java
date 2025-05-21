package _17_Method;

public class Return {
    public static String getName() {           //void 대신 반환할 자료형
        String name = "김지니";
        return name;
    }

    public static int getAge() {
        int age = 25;
        return age;
    }

    public static void main(String[] args) {
        //return : 반환값
        //void : 반환값이 없다
        System.out.println(getName());

        System.out.println(getAge());

        String myName = getName();      //return 값을 변수에 저장할 때 -> 반환할 자료형 변수이름 = 메소드()
        System.out.println(myName);

        int myAge = getAge();
        System.out.println(getAge());



    }
}
