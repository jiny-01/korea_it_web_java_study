package _28_Static;

public class Main {
    public static void main(String[] args) {

        System.out.println(KoreaItStudent.static_curriculum);  //KoreaItStudent : 클래스 (객체X)
//        System.out.println(KoreaItStudent.getStatic);          //getStatic 에 static 걸 경우 바로 접근 가능

        // 객체 안 만들고(객체 생성 이전 클래스 수준에서 바로 접근가능
        //static_curriculum 은 static 이므로 클래스로 바로 접근 가능

        KoreaItStudent koreaItStudent = new KoreaItStudent("김지니", 25);
        System.out.println(koreaItStudent.getStatic());

        //static - 클래스 수준(인스턴스 수준이 아님) 에서 변수를 정의하거나 메소드를 선언할 때 사용
        // static 으로 선언된 변수나 메서드는 클래스의 인스턴스에 속하지 않음.
        // => 클래스 자체에 속하게 됨.
        //예) static String static_curriculum
        //    private static String name;

        //이는 인스턴스를 생성하지 않고 접근이 가능하다
        //이런 점에서 인스턴스 변수나 메소드와 차이가 있다.


        //특징
        //1. 클래스 수준의 변수 및 메소드 - static 변수와 메소드는 클래스 로드 시(객체 생성 없이도) 메모리에 할당
        //but 인스턴스 수준의 변수와 메소드는 객체 생성 시 메모리에 할당

        //2. static 은 공유가 가능 - 모든 인스턴스가 동일한 static 변수에 접근
        //따라서, 데이터를 공유하거나 상태를 저장할 때 유용

        //static 걸려면 클래스 안에서 변수든, 메소드에 걸어줘야 함
        //static 있으면 객체 생성 안해도 접근 가능(클래스 수준) / 없으면 객체 생성해야 접근 가능



    }
}
