package Wildcard.UnBoundedWildcard;

public class UnBoundedWildcard {
    // 와일드 카드 => <> 에 ?
    // => 타입에 제한이 없다, 모든 타입(== 비한정적 와일드카드)
    // 하지만 읽기(get)만 가능, 쓰기는 불가능(set 불가) => 타입이 명확하지 않기 때문


    public static void printBox(Box<?> box) {
        System.out.println("Box 내용물: " + box.getItem());
    }

//    //set 불가능
//    public static void setBox(String str, Box<?> box) {
//        box.setItem(str);
//
//    }
}
