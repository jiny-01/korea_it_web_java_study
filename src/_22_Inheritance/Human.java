package _22_Inheritance;

//Animal 상속
//부모 생성자 호출해서 객체 생성과 동시에 속성값 넣을 수 있도록 생성자 만들고
//getter, setter 이용
//getAnimalName => 제 이름은 _ _ _ 입니다. 로 오버라이딩
//getAnimalAge => 올해 제 나이는 __ 이고, 내년에는 __ 입니다.
//move => 사람이 두 발로 걷습니다.
//고유(자식) 메소드 - read(String bookName) => ___이 b_name(책 이름)을 읽습니다.

public class Human extends Animal {

    //Human 생성자 호출하기 - name, age
    public Human(String animalName, int animalAge) {
        super(animalName, animalAge);
    }


    @Override
    public String getAnimalName() {
        return "제 이름은" + super.getAnimalName() + "입니다.";
    }

    @Override
    public int getAnimalAge() {
        System.out.println("올해 제 나이는" + super.getAnimalAge() + "이고, 내년에는" + (super.getAnimalAge()+1) + "입니다.");
        return super.getAnimalAge();
    }

//    public Human(String animalName) {
//        super(animalName);
//        System.out.println("제 이름은" + super.getAnimalName() + "입니다.");
//    }
    //super.getAnimalName 안해주면 stackoverflow 에러 뜰 것


//    public Human(int animalAge) {
//        super(animalAge);
//        System.out.println("올해 제 나이는" + getAnimalAge() + "이고, 내년에는" + (getAnimalAge()+1) + "입니다.");
//    }


    //메소드 오버라이딩 - move, 고유 메소드 - read
    @Override
    public void move() {
//        super.move();         //부모 메소드 호출
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String bookName) {
        System.out.println(super.getAnimalName() + bookName + "을 읽습니다.");
    }


//    public void printAge() {
//        System.out.println("올해 제 나이는 " + getAnimalAge() + "이고, 내년에는 " + (getAnimalAge() + 1) + "입니다.");
//    }
//
}
