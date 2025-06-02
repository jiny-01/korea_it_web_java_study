package _31_Generic.Generic_Wildcard.LowerBoundedWildcard;

public class SuperWildcard {
    //하한 경계 와일드카드: Dog 또는 Dog 의 상위 타입만 허용

    public static void putDog(Box<? super Dog> box) {
        box.setItem(new Dog());   //쓰기는 가능, 읽기는 안됨
//        Dog dog = box.getItem();  //읽기 불가능
        //타입이 명확하지 않아서, Dog 보다 상위는 많아서 알고 꺼낼 수 없음



        Object obj = box.getItem();   //굳이 읽을 수는 있으나 object 로 반환됨(object 로 업캐스팅되어있을 것)

        System.out.println("obj: " + obj);
    }


}
