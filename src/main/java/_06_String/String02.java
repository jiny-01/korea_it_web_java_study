package _06_String;

public class String02 {
    public static void main(String[] args) {
        String str = "I like music and movie and travel.";

        System.out.println(str.replace(" and", ",")); //replace : 특정 문자열을 다른 문자열로 대체
        System.out.println(str.substring(7));    //substring: 인덱스 기준 7부터 출력
        System.out.println(str.substring(7, 12));  // 인덱스 기준 7부터 11까지, 끝지점은 본인 포함x
        System.out.println(str.indexOf("movie"));  //m의 인덱스 : 17
        System.out.println(str.substring(str.indexOf("movie"), str.indexOf("."))); //-> movie부터 travel 까지, . 포함x

        str = "    I want to go home    ";
        System.out.println(str.trim());   //.trim: 문자열 앞뒤 공백 제거

        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));  //.concat : 문자열 이어붙이기
        System.out.println(s1 + " " + s2);  //공백 추가
        System.out.println(s1.concat(" ").concat(s2)); //공백 중간에 추가하고 다시 concat

    }
}
