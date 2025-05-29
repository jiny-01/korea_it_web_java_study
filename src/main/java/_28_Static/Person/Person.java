package _28_Static.Person;

public class Person {

    //static 넣었으므로 population - 멤버변수가 아닌 전역변수
    //population 에 static 이 없으면 객체 생성 될 때마다 0 초기화 될 것
    public static int population = 0;
    public String name;

    public Person(String name) {
        System.out.println("현재 인구 수: " + population);
        this.name = name;
        population++;          //객체 생성 할 떄마다 ++ 되도록
        System.out.println("객체가 생성됨");
    }

    //인스턴스 수준의 메소드
    public void sayHello() {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }

    //클래스 수준의 메소드
    public static void showPopulation() {
        System.out.println("전체 인구 수: " + population);
    }


}
