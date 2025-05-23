package _22_Inheritance;


/*
* super 는 부모에게 접근할 수 있는 키워드
* 즉, 자식 클래스에서 "부모님 기능 또는 속성" 접근할 때 쓰는 것
* super 키워드의 두 가지 사용방식\
* super() : 부모 클래스의 생성자를 호출하는 키워드 / 기본 생성자라면 () 아무런 값이 없다.
*           매개변수 생성자라면 () 매개변수가 포함되는 것
*
*
* */
public class Tiger extends Animal {
    //Animal 클래스의 속성 그대로 상속받음
    //Animal 은 부모클래스(슈퍼클래스), Tiger는 자식클래스(서브클래스)
    //이때 부모클래스에는 없는 속성을 따로 추가할 수 있다.
    private boolean isStriped;  //줄무늬 속성 추가
    // - > 부모 클래스의 name, age 도 갖고 있는 상태

    public Tiger() {
        System.out.println("속성이 정해지지 않은 호랑이 객체 생성=>NoArgsC");
    }



    public Tiger(String animalName, int animalAge, boolean isStriped) {
        super(animalName, animalAge);
        this.isStriped = isStriped;
        System.out.println("모든 속성값이 부여된 호랑이 객체 생성=> AllArgsC");

        //getter 만들기 - boolean 이라서 알아서 isStriped 로 된 것
        public boolean isStriped() {
            return isStriped;
        }

        //setteer 만들기
        public void setStriped(boolean striped) {
            isStriped = striped;
        }

    }
}
