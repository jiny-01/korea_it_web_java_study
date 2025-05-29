package _26_Objects;

public class Main {
    public static void main(String[] args) {

        //모든 클래스는 자바의 Object 클래스를 상속받고 있음
        // -> 따로 부모 없어도 Object 의 메소드는 모두 오버라이드 가능
        //equals 를 오버라이드한다면 hashcode 도 함께 해줘야함

        //생성자 넣어서 객체 생성
        Teacher teacher1 = new Teacher("이동윤", "코리아IT");
        System.out.println(teacher1.toString());    //오버라이드 안해줬음에도 메소드 나옴, .toString() 생략가능
        System.out.println(teacher1);

        Teacher teacher2 = new Teacher("홍길동", "하버드대");
        System.out.println(teacher1.equals(teacher2));  //해시코드가 달라서 false
        //equals 성립되려면 hashcode 도 같아야함
        System.out.println(teacher1.hashCode());
        System.out.println(teacher1.hashCode());

        System.out.println(teacher1.equals(teacher2));  //오버라이드 해줬으므로 true

    }


}
