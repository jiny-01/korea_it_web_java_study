package _06_String;

public class String01 {
    public static void main(String[] args) {
        String str = "My name is Jiny";

        System.out.println(str.length()); //문자열 길이

        System.out.println(str.toUpperCase());  //전부 대문자로
        System.out.println(str.toLowerCase());  //전부 소문자로

        System.out.println(str.contains("name"));   //포함 여부, 결과는 boolean으로 출력(참/거짓)
        System.out.println("age");

        System.out.println(str.indexOf("name"));   //.indexOf : 해당 위치 정보
        System.out.println(str.indexOf("age"));    //만약 없으면 -1

        str = "I like music and movie and travel";
        System.out.println(str.lastIndexOf("and"));
        //여러 개 중에서 마지막 위치
        //and 가 여러개 이기 때문에 가장 마지막에 있는 and의 인덱스 찾아줌
        System.out.println(str.lastIndexOf("java"));   //없으면 -1
        System.out.println(str.startsWith("I")); //해당 문자열로 시작하냐? - 결과는 t/f
        System.out.println(str.startsWith("My name")); //아니면 -> false
        System.out.println(str.endsWith("travel")); //해당 문자열로 끝나냐?
        System.out.println(str.endsWith("movie"));  //아니면 -> false

    }
}