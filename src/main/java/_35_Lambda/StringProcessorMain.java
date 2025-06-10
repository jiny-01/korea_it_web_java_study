package _35_Lambda;

//Main에서 정적 메소드로 execute 만들고 매개변수로 String input,
//인터페이스 StringProcessor processor 두가지 받음
//return 으로 processor.process(input)

//스캐너 객체 하나 만들기
//람다식으로 구현 => 모두 대문자로, 모두 소문자로, 접두사로 >> 붙이기, 문자열 거꾸로
//접두사 => ">>" + string,
//접두사, 문자열 거꾸로
//스캐너로 영문하나 입력받고 4가지 실행결과물 출력

import java.util.Scanner;


public class StringProcessorMain {
    //메소드 정의
    public static String execute(String input, StringProcessor processor) {
        return processor.process(input);
    }


    public static void main(String[] args) {



        //람다식 구현
//        StringProcessor toUpper = s -> s.toUpperCase();
//        StringProcessor toLower = s -> s.toLowerCase();
//        StringProcessor addPrefix = s -> ">>" + s;
//        StringProcessor reverse = s -> new StringBuilder(str).reverse().toString();
//
//        String testStr = scanner.nextLine();
//
//        System.out.println("모두 대문자 : " + execute(testStr, toUpper));



        //내가 한 방법
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String resultUpper = execute(str, s -> s.toUpperCase());

        String resultLower = execute(str, s -> s.toLowerCase());

        String resultStr = execute(str, s -> ">>" + str);

        //문자열 거꾸로
        String original = str;
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("문자열 거꾸로: " + reversed);

        String reverseStr = execute(str, s -> new StringBuilder(str).reverse().toString());

        System.out.println("모두 대문자 : " + resultUpper);
        System.out.println("모두 소문자 : " + resultLower);
        System.out.println("접두사 붙이기 : " + ">>" + str);
        System.out.println("문자열 거꾸로 : " + reverseStr);

        //출력은 됨




    }
}
