package _22_Inheritance;


/*
* super 는 부모에게 접근할 수 있는 키워드
* 즉, 자식 클래스에서 "부모님 기능 또는 속성" 접근할 때 쓰는 것
* super 키워드의 두 가지 사용방식\
* 1. super() : 부모 클래스의 생성자를 호출하는 키워드
*           / 기본 생성자라면 () 아무런 값이 없다.
*           매개변수 생성자라면 () 매개변수가 포함되는 것
* 2. super.메소드() 또는 super.필드명(멤버변수) : 부모클래스의 메소드 또는 멤버변수에 접근
*
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
    }

        //getter 만들기 - boolean 이라서 알아서 isStriped 로 된 것
        public boolean isStriped() {
            return isStriped;
        }

        //setter 만들기
        public void setStriped(boolean striped) {
            isStriped = striped;
        }


        // (오버로딩: 같은 클래스 내에서 매개변수의 자료형 or 개수를 다르게 하는 것)

        //오버라이드 - 메소드 재정의 (상속 관계에서 물려받은 부모의 메소드를 자식클래스에서 재정의)
        //            같은 동작을 하지만 자식이 '다르게' 실행하도록 바꾸는 것
        //            -> 동일한 이름, 매개변수, 리턴 타입으로 재정의


        //오버라이딩 - Alt + Ins 누르고 메소드 재정의
        @Override                 //오버라이드를 어너테이션+시그니처(컴파일러에게 의도명시)으로 정의
        public void move() {
        super.move();             //부모의 메소드 호출
            System.out.println(getAnimalName() + "가 움직입니다.");
            //메소드 - tiger(자식)한테 없는 걸 확인 후 animal(부모)에서 가져옴 - 동적 바인딩?
        }

        //tiger 만의 메소드 추가
        public void hunt() {
            System.out.println(getAnimalName() + "가 사냥을 합니다.");
        }
        // 메소드에서는 왜 super를 안 쓰냐?
        // 상속과 메소드에서는 탐색 순서
        // 자식 클래스에서 해당 메소드가 없다면 부모 클래스에서 찾는다.
        // super 쓰고 싶다면-> 명확히 부모의 메소드를 호출할 때



}

