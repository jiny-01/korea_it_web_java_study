package _22_Inheritance;

public class Animal {
    //필드(멤버변수) == 객체의 속성
    private String animalName;
    private int animalAge;

    //생성자

    //기본, name만, age 만, 둘 다

    public Animal () {

    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }


    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    //setter 이용
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    //getter 이용
    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    //메소드 - 반환값없음, move(움직입니다)
    public void move() {
        System.out.println(" 움직입니다");
    }

}
