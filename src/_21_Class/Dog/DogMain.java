package _21_Class.Dog;

public class DogMain {
    public static void main(String[] args) {
        //객체 생성하는 방법
        Dog dog = new Dog();
        //생성된 해당 객체 속성 값 대입 또는 변경
        dog.name = "방울이";
        dog.age = 3;

        dog.name = "호두";  //변경(수정)

        System.out.println(dog.name);
        System.out.println(dog.age);

        //생성된 객체 메소드 호출
        dog.bark();          //Ctrl 누르고 메소드 누르면 바로가기 가능
        dog.sleep();

        //21 class 폴더 안에 student 패키지 만들고 안에 클래스파일 Student 와 StrudentMain 만들기
        //이름, 나이, 이메일, 주소 변수 만들고
        //메소드 showInfo() => 정보출력
        //StudentMain 에서 객체 생성 후 본인 정보 대입(주소 대충)
        //showInfo() 호출해서 정보출력




    }
}
